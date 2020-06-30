package com.demo.service.imp;

import com.demo.mapper.TestMapper;
import com.demo.model.ShortTel;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TestService {
@Autowired
    private TestMapper shortTelMapper;

    public Integer importShortTel(HSSFSheet sheet) {

        // 获取该工作表的第一行

        HSSFRow row = null;

        // 获取该工作表的第一个单元格

        HSSFCell cell = null;



        // 存放短号的List

        List<ShortTel> shortTelList = new ArrayList<>();

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            // 在循环里面写，List保存的是引用，故在外边写会被覆盖，对象的地址相同

            ShortTel tel = new ShortTel();

            row = sheet.getRow(i);



            // 数字取整

            DecimalFormat df = new DecimalFormat("0");



            // 获取第I列 第一个单元格

            cell = row.getCell(0);

            if (null == cell) {

                continue;

            }

            if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {

                String number = df.format(cell.getNumericCellValue());

                if (number.equals("")) {

                    continue;
                }

            } else {


                if (cell.getRichStringCellValue().getString().equals("")) {

                    continue;

                }

            }

            String shortTel = "";

            if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {

                shortTel = df.format(cell.getNumericCellValue());

            } else {

                shortTel = cell.getRichStringCellValue().getString();

            }
            //....................................................................
//            StringBuilder sb=new StringBuilder();
            List<HSSFPictureData> pictures = sheet.getWorkbook().getAllPictures();;
            for (HSSFShape shape : sheet.getDrawingPatriarch().getChildren()) {
                HSSFClientAnchor anchor = (HSSFClientAnchor) shape.getAnchor();
                if (shape instanceof HSSFPicture) {
                    HSSFPicture pic = (HSSFPicture) shape;
//                    int row = anchor.getRow2();
//                    int col = anchor.getCol2();
                    System.out.println("--->" + anchor.getRow2() + ":"  + anchor.getCol2()+"//////////////");
                    System.out.println(i+"]]]]]]]]]]]]]]]]]");
                    if(i==anchor.getRow2() && anchor.getCol2()==0){
                        System.out.println("--->" + anchor.getRow2() + ":"  + anchor.getCol2());
                        //map.put(row+":"+col, row+":"+col);
                        int pictureIndex = pic.getPictureIndex()-1;
                        System.out.println(pictureIndex+".....");
                        HSSFPictureData picData = pictures.get(pictureIndex);
                        System.out.println("--->" + picData);
                        tel.setPic(picData.getData());
                        break;
                    }

                }
            }
//
            //......................................................

            tel.setShortTel(shortTel);

            // 将放到list中

            shortTelList.add(tel);



        }



        return shortTelMapper.insertShortTelBatch(shortTelList);

    }

}
