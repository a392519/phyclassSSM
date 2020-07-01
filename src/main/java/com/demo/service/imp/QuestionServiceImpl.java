package com.demo.service.imp;

import com.demo.mapper.QuestionMapper;
import com.demo.mapper.TestMapper;
import com.demo.model.Question;
import com.demo.model.QuestionExample;
import com.demo.model.ShortTel;
import com.demo.model.VideoClass;
import com.demo.service.QuestionService;
import com.demo.util.MyUtil;
import com.google.gson.Gson;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.rmi.CORBA.Util;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    Gson gson=new Gson();
    public Integer importQuestion(HSSFSheet sheet) {

        // 获取该工作表的第一行

        HSSFRow row = null;

        // 获取该工作表的第一个单元格

        HSSFCell cell = null;



        // 存放短号的List

        List<Question> questionsList = new ArrayList<>();

        for (int i = 2; i <= sheet.getLastRowNum(); i++) {
            System.out.println(sheet.getLastRowNum());

            // 在循环里面写，List保存的是引用，故在外边写会被覆盖，对象的地址相同
            row = sheet.getRow(i);
            if(row.getCell(2)==null || row.getCell(2).getStringCellValue()==null||row.getCell(2).getStringCellValue()==""){
                break;
            }
            Question qes = new Question();
            // 数字取整
            DecimalFormat df = new DecimalFormat("0");
            // 获取第I列 第一个单元格
            HSSFCell cell0=row.getCell(0);
            if (cell0.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
                String number = df.format(cell0.getNumericCellValue());
                qes.setNumber(Integer.parseInt(number));
            }
            String s=row.getCell(1).getStringCellValue();
            if(s.equals("单选"))
            qes.setType("radio");
            else if(s.equals("多选") || s.equals("不定向选"))
                qes.setType("checkbox");
            else qes.setType("text");
            if(row.getCell(2)==null) continue;
            if(row.getCell(2).getCellType()==HSSFCell.CELL_TYPE_STRING)
                qes.setTitle(row.getCell(2).getStringCellValue().getBytes());
            //....................................................................
            List<HSSFPictureData> pictures = sheet.getWorkbook().getAllPictures();;
            //题干图片

            for (HSSFShape shape : sheet.getDrawingPatriarch().getChildren()) {
                HSSFClientAnchor anchor = (HSSFClientAnchor) shape.getAnchor();
                if (shape instanceof HSSFPicture) {
                    HSSFPicture pic = (HSSFPicture) shape;
                    if(i==anchor.getRow2() && anchor.getCol2()==2){
                        System.out.println("--->" + anchor.getRow2() + ":"  + anchor.getCol2());
                        int pictureIndex = pic.getPictureIndex()-1;
                        System.out.println(pictureIndex+".....");
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        System.out.println("--->" + picData);
                        qes.setTitle(picData.getData());

                    }
                    //题干图片
                    List<byte[]> quesImagelist=new ArrayList<>();
                    if(row.getCell(3)!=null&&i==anchor.getRow2() && anchor.getCol2()==3  ){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        quesImagelist.add(picData.getData());
                    }
                    if(row.getCell(4)!=null&&i==anchor.getRow2() && anchor.getCol2()==4  ){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        quesImagelist.add(picData.getData());
                    }
                    if( row.getCell(5)!=null&&i==anchor.getRow2() && anchor.getCol2()==5 ){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        quesImagelist.add(picData.getData());
                    }
                    qes.setImagelist(gson.toJson(quesImagelist).getBytes());
                    //选项ABCD
                    List<byte[]> chooselist=new ArrayList<>();
                    if(row.getCell(6)!=null&&row.getCell(6).getStringCellValue()!=""&&row.getCell(6).getCellType()==HSSFCell.CELL_TYPE_STRING )
                        chooselist.add(row.getCell(6).getStringCellValue().getBytes());
                    if(  row.getCell(6)!=null && i==anchor.getRow2() && anchor.getCol2()==6){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        chooselist.add(picData.getData());
                    }
                    if(row.getCell(7)!=null&&row.getCell(7).getStringCellValue()!=""&&row.getCell(7).getCellType()==HSSFCell.CELL_TYPE_STRING )
                        chooselist.add(row.getCell(7).getStringCellValue().getBytes());
                    if( row.getCell(7)!=null&&i==anchor.getRow2() && anchor.getCol2()==7 ){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        chooselist.add(picData.getData());
                    }
                    if(row.getCell(8)!=null&&row.getCell(8).getStringCellValue()!=""&&row.getCell(8).getCellType()==HSSFCell.CELL_TYPE_STRING )
                        chooselist.add(row.getCell(8).getStringCellValue().getBytes());
                    if(row.getCell(8)!=null&&i==anchor.getRow2() && anchor.getCol2()==8 ){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        chooselist.add(picData.getData());
                    }
                    if(row.getCell(9)!=null &&row.getCell(9).getCellType()==HSSFCell.CELL_TYPE_STRING &&row.getCell(9).getStringCellValue()!="")
                        chooselist.add(row.getCell(9).getStringCellValue().getBytes());
                    if(i==anchor.getRow2() && anchor.getCol2()==9 && row.getCell(9)!=null){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        chooselist.add(picData.getData());
                    }
                    qes.setQuestionoption(gson.toJson(chooselist).getBytes());
                    if(row.getCell(10)!=null &&row.getCell(10).getCellType()==HSSFCell.CELL_TYPE_STRING &&row.getCell(10).getStringCellValue()!="")
                        qes.setAnswer(row.getCell(10).getStringCellValue().getBytes());
                    if( row.getCell(10)!=null&&i==anchor.getRow2() && anchor.getCol2()==10 ){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        qes.setAnswer(picData.getData());
                    }
                    if(row.getCell(11)!=null &&row.getCell(11).getCellType()==HSSFCell.CELL_TYPE_STRING &&row.getCell(11).getStringCellValue()!="")
                        qes.setResolves(row.getCell(11).getStringCellValue().getBytes());
                    if( row.getCell(11)!=null&&i==anchor.getRow2() && anchor.getCol2()==11 ){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        qes.setResolves(picData.getData());
                    }
                    //题干图片
                    List<byte[]> answerImagelist=new ArrayList<>();
                    if(i==anchor.getRow2() && anchor.getCol2()==12 && row.getCell(12)!=null){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        answerImagelist.add(picData.getData());
                    }
                    if(i==anchor.getRow2() && anchor.getCol2()==13 && row.getCell(13)!=null){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        answerImagelist.add(picData.getData());
                    }
                    if(i==anchor.getRow2() && anchor.getCol2()==14 && row.getCell(14)!=null){
                        int pictureIndex = pic.getPictureIndex()-1;
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        answerImagelist.add(picData.getData());
                    }
                    qes.setAnswerimagelist(gson.toJson(answerImagelist).getBytes());

                }
            }
            //获得关联视频名
            if(row.getCell(15)!=null&&row.getCell(15).getCellType()==HSSFCell.CELL_TYPE_STRING &&row.getCell(15).getStringCellValue()!=""){
                String vidioName=row.getCell(15).getStringCellValue();
//                        int id=selectVIdByVname(vidioName);
//                        qes.setVid(id);
                qes.setVname(vidioName);
            }
            //获得难度
            if(row.getCell(16)!=null&&row.getCell(16).getCellType()==HSSFCell.CELL_TYPE_STRING &&row.getCell(16).getStringCellValue()!=""){
                String diff=row.getCell(16).getStringCellValue();
                if(diff.equals("容易"))qes.setDifficulty(1);
                else if(diff.equals("困难"))qes.setDifficulty(3);
                else qes.setDifficulty(2);
            }
           qes.setId(MyUtil.getStrUUID()); ;
            questionsList.add(qes);




        }

        return questionMapper.insertQestion(questionsList);

    }



}
