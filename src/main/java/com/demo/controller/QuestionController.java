package com.demo.controller;

import com.demo.service.QuestionService;
import com.demo.service.imp.TestService;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/fileDown", method = RequestMethod.GET)

    public void down(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //模拟文件，myfile.txt为需要下载的文件

        String fileName = request.getServletContext().getRealPath("/upload")+"/model.xls";

        System.out.println(fileName);

        //获取输入流

        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));

        //假如以中文名下载的话

        String filename = "习题导入模板.xls";

        //转码，免得文件名中文乱码

        filename = URLEncoder.encode(filename,"UTF-8");

        //设置文件下载头

        response.addHeader("Content-Disposition", "attachment;filename=" + filename);

        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型

        response.setContentType("multipart/form-data");

        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());

        int len = 0;

        while((len = bis.read()) != -1){

            out.write(len);

            out.flush();

        }

        out.close();

    }








    @RequestMapping(value = "/importQuestion")

    public String importQuestion(@RequestParam(value = "fileUser", required = false) MultipartFile file,

                            HttpServletRequest request, HttpServletResponse response) {

        if (file == null) {

            return "获取文件失败";

        }



        // 文件名

        String fileName = file.getOriginalFilename();

        // 路径

        String path = request.getSession().getServletContext().getRealPath("upload");

        // 长度

        long size = file.getSize();

        if (fileName == null || ("").equals(fileName) && size == 0) {

            return "空文件或者文件名字为空";

        }

        if (fileName.indexOf(".xls") > 0) {

            // 创建存放上传文件的文件夹

            File filePath = new File(path);

            if (!filePath.exists()) {

                filePath.mkdirs();

            }

            // 保存

            File targetFile = new File(path, fileName);

            try {

                file.transferTo(targetFile);

                InputStream in = new FileInputStream(targetFile);



                HSSFWorkbook workbook = new HSSFWorkbook(in);// 创建对Excel工作薄

                HSSFSheet sheet = workbook.getSheetAt(0);

                // 调用Service，将数据插入Excel

                int i = questionService.importQuestion(sheet);

                if (i > 0) {

                    return "导入成功";

                } else {

                    return "导入失败";

                }

            } catch (IOException e) {

                return "存在异常"+e.getMessage();

            }

        }

        return "空文件或者文件不是execl";

    }

}
