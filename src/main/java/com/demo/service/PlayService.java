package com.demo.service;



import com.demo.mapper.VideoClassMapper;
import com.demo.model.VideoClass;
import com.demo.util.MyUtil;
import com.demo.util.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayService {
    @Autowired
    private VideoClassMapper videoClassMapper;
    List< Map<String,Object>> sectionDownList=new ArrayList();
    public List<Map<String ,Object>> selectByGrade(VideoClass videoClass){

        //通过年级查找，整理代码格式,整理成前端需要的代码格式
        List<VideoClass> list=videoClassMapper.selectByGrade(videoClass);
        List<Map<String,Object>> bookList=new ArrayList();
        List<Map<String,Object> > capterList=new ArrayList();
        List< Map<String,Object>> sectionList=new ArrayList();
        for(VideoClass v:list){
            boolean bookisin=false;
            boolean capterisin=false;
            boolean sectionisin=false;
            Map<String,Object> bookMap= Singleton.getBookMap();
            int temp=-1;
            if(bookList.size()>0){
                for (int i=0;i<bookList.size();i++) {
                    if(bookList.get(i)!=null && v.getVbook().equals(bookList.get(i).get("label"))) {
                        bookisin=true;
                        temp=i;
                        break;
                    }
                }
            }
            if( temp!=-1 &  bookisin) {//如果已经有此本书
                int capterTemp=-1;
                capterList= (List<Map<String, Object>>) bookList.get(temp).get("children");
                if(capterList.size()>0){
                    for (int i=0;i<capterList.size();i++) {//是否有某章,有某章，把下标存一下
                        if(capterList.get(i)!=null && v.getVcapter().equals(capterList.get(i).get("label")) ){
                            capterisin=true;
                            capterTemp=i;
                        }
                    }
                }
                if(capterTemp!=-1) {//如果有某章，只需在该章的节中增加
                    sectionList=(List<Map<String, Object>>) ((List<Map<String, Object>>) bookList.get(temp).get("children")).get(capterTemp).get("children");
                }
                //通过有的章，得到这本书存的所有章的list
                List<Map<String,Object>> capterList1=getcapterList(v,capterisin,sectionisin,capterTemp,
                        (List<Map<String, Object>>) bookList.get(temp).get("children"),sectionList
                        );
                bookList.get(temp).put("children",capterList1);
            }else{
                bookMap=new HashMap<>();
                bookMap.put("nodeId",MyUtil.getStrUUID());
                bookMap.put("label",v.getVbook());
                List<Map<String,Object>> capterList1=getcapterList(v,capterisin,sectionisin,0,
                        null,null);
                bookMap.put("children",capterList1);
//                if(bookList==null){
//                    bookList=new ArrayList<>();
//                }
                bookList.add(bookMap);
            }
        }
        return bookList;
    }
    /**
     * 获得里面装了sectionMap的capterMap章
     * @param v
     * @param capterisin
     * @param sectionisin
     * @param capterList
     * @return
     */
    private List<Map<String, Object>> getcapterList(VideoClass v, boolean capterisin, boolean sectionisin,int capterTemp,
                                             List<Map<String, Object>> capterList,//把这本书的所有的章list传过来
                                             List<Map<String, Object>> sectionList) {//如果有重复的节，把重复的对应的节传过来
        int sectionTemp=-1;
        if(capterisin){//如果有该章
            if(sectionList.size()>0){//如果有该节，只需在该节下增加
                for ( int i=0;i<sectionList.size();i++) {//看是否有该节
                    if(sectionList.get(i)!=null &&v.getVsection().equals(sectionList.get(i).get("label"))) {
                        sectionisin=true;
                        sectionTemp=i;
                    }
                }
            }
            sectionDownList.clear();
            if(sectionTemp!=-1){//如果有该节,节下面的内容
                sectionDownList=(List<Map<String, Object>>) sectionList.get(sectionTemp).get("children");
            }
            //创建sectionMap,装节数据getSectionMap
            List<Map<String,Object>> sectionList1=getSectionList(v,sectionisin,sectionDownList,sectionList);//
            if(capterTemp!=-1){
                if(sectionTemp==-1) {
                    capterList.get(capterTemp).put("children", sectionList1);
                }
            }

        }else{//如果没有章
            Map<String,Object> capterMap=new HashMap<>();
            capterMap.put("nodeId",MyUtil.getStrUUID());
            capterMap.put("label",v.getVcapter());
            if(capterList==null){
                capterList=new ArrayList<>();
            }
            List<Map<String,Object>> sectionList1=getSectionList(v,sectionisin,null,null);
            capterMap.put("children",sectionList1);
            capterList.add(capterMap);
        }
        return capterList;
    }

    /**
     * 创建getSectionList,装节数据
     * @param v
     * @param sectionisin
     * @return 装上节数据的map
     */
    private List<Map<String, Object>> getSectionList(VideoClass v ,boolean sectionisin,List<Map<String,Object>> sectionDownList,
                                                     List<Map<String,Object>> sectionList) {

        Map<String,Object> sectionMap=null;
        Map<String,Object> sectionMapChild=null;
        if(sectionisin){//如果有该节,直接在其childrenlist中加即可
            //创建一个childMap,并赋值
            sectionMapChild=sectionChildMap(v);
            sectionDownList.add(sectionMapChild);
        }else{//如果没该节，
            if(sectionList==null) sectionList=new ArrayList<>();
            if(sectionDownList==null)sectionDownList=new ArrayList<>();
            sectionMap=new HashMap<>();
            sectionMap.put("nodeId",MyUtil.getStrUUID());
            sectionMap.put("label",v.getVsection());
           sectionMapChild=sectionChildMap(v);
            sectionDownList.add(sectionMapChild);
            sectionMap.put("children",sectionDownList);
            sectionList.add(sectionMap);
        }
        return sectionList;
    }

    /**
     * 创建一个childMap,并赋值，并加到sectionMap中
     * @param v 便利的VideoClass实体类

     * @return 装了child的实体类
     */
    private Map<String, Object> sectionChildMap(VideoClass v) {
        Map<String,Object> childMap=new HashMap<>();
        childMap.put("nodeId",v.getVid()+"");
        childMap.put("label",v.getVname());
        childMap.put("vdescription",v.getVdescription());
        childMap.put("videosrc",v.getVideosrc());
        return childMap;
    }


}
