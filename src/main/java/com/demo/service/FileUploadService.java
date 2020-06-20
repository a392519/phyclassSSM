package com.demo.service;


import com.demo.mapper.VideoClassMapper;
import com.demo.model.PhyProperties;
import com.demo.model.VideoClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@Transactional
public class FileUploadService {
    @Autowired
    VideoClassMapper videoClassMapper;
    @Autowired
    PhyProperties phyProperties;
    public String  savePath(MultipartFile file, HttpServletRequest request) throws IOException {
        String fianlPath="";
        // 如果文件不为空，写入上传路径，进行文件上传
        if (!file.isEmpty()) {

            // 构建上传文件的存放路径

            String path =phyProperties.getVideoAddress();

            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            //如果名字相同则被复盖了
            String filename = file.getOriginalFilename();

            File filepath = new File(path, filename);

            // 判断路径是否存在，不存在则新创建一个

            if (!filepath.getParentFile().exists()) {

                filepath.getParentFile().mkdirs();

            }
            // 将上传文件保存到目标文件目录
            fianlPath = path + File.separator + filename;
            file.transferTo(new File(fianlPath));

        }

        return fianlPath;
    }
    public int insertAll(VideoClass videoClass){
        return videoClassMapper.insert(videoClass);
    }

    public int videoCount(String paramkey,VideoClass videoClass){
        String vgrade=null;
        String vbook=null;
        String vname=null;
        setParamName(paramkey,videoClass);
        int count= videoClassMapper.videoCount(videoClass);
        return count;
    }
    public List<VideoClass> findvideoList(String paramkey,VideoClass videoClass){
        String vgrade=null;
        String vbook=null;
        String vname=null;
        setParamName(paramkey,videoClass);
        System.out.println(videoClass.getVname()+".........................");
        List<VideoClass> list= videoClassMapper.videoList(videoClass);
        return list;
    }
    private void setParamName(String paramkey,VideoClass videoClass ){

        if(paramkey!=null && !paramkey.equals("")){
            for(String s:phyProperties.getGrades()){
                if(paramkey.equals(s)){
                    videoClass.setVgrade(s);
                    break;
                }
            }
            if(videoClass.getVgrade()==null){
                for(String s:phyProperties.getBooks()){
                    if(paramkey.equals(s)){
                        videoClass.setVbook(s);
                        break;
                    }
                }
                if(videoClass.getVbook()==null) videoClass.setVname(paramkey);
            }
        }

    }
    public int delById(Integer vid){
        return  videoClassMapper.deleteByPrimaryKey(vid);
    }
    public VideoClass selById(Integer vid){
        return  videoClassMapper.selectByPrimaryKey(vid);
    }
    public int updateVideo(VideoClass videoClass){
        return videoClassMapper.updateByPrimaryKey(videoClass);
    }
}
