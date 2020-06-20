
package com.demo.controller;



import java.io.IOException;

import javax.servlet.http.HttpServletRequest;


import com.demo.model.VideoClass;
import com.demo.model.VideoPage;
import com.demo.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



/**

 * 文件上传控制类

 * @author Administrator

 */

@Controller

public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;


    @RequestMapping("/")

    public String index(){

        return "index";

    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(HttpServletRequest request,
                         @RequestParam("vid") String vid,
                         @RequestParam("videosrc") String videosrc,
                         @RequestParam("vname") String vname,
                         @RequestParam("vgrade") String[] vgrades,
                         @RequestParam("vbook") String vbook,
                         @RequestParam("vcapter") String vcapter,
                         @RequestParam("vsection") String vsection,
                         @RequestParam("vdescription") String vdescription,
                         @RequestParam("difficulty") String difficulty,
                         @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        StringBuilder sb = new StringBuilder();
        for (String vgrade : vgrades) {
            sb.append(vgrade + ",");
        }
        VideoClass videoClass = new VideoClass();
        videoClass.setVgrade(sb.toString());
        videoClass.setDifficulty(Integer.parseInt(difficulty));
        videoClass.setVbook(vbook);
        videoClass.setVcapter(vcapter);
        videoClass.setVdescription(vdescription);
        videoClass.setVname(vname);
        videoClass.setVsection(vsection);
        videoClass.setVideosrc(videosrc);
        //存到数据库中；

        int vids=Integer.parseInt(vid);
        if(vids>0){//修改
            videoClass.setVid(vids);
            if( !file.isEmpty()){
                String fianlPath = fileUploadService.savePath(file, request);
                videoClass.setVideosrc(fianlPath);
            }
            int count2= fileUploadService.updateVideo(videoClass);
            if(count2>0) return "修改 success";
            else return "修改 error";
        }else{//新增
            //上传文件
            String fianlPath = fileUploadService.savePath(file, request);
            videoClass.setVideosrc(fianlPath);
            int count=fileUploadService.insertAll(videoClass);
            if(count>0) return "新增 success";
            else return "新增 error";
        }
    }
    @RequestMapping("/vodeofind")
    @ResponseBody
    public VideoPage vodeofind(String search, VideoClass videoClass){
        VideoPage videoPage=new VideoPage(fileUploadService.videoCount(search,videoClass),fileUploadService.findvideoList(search,videoClass));
        return videoPage;
    }
    @RequestMapping("/delById")
    @ResponseBody
    public  String delById(Integer vid){
        int count=fileUploadService.delById(vid);
        return count+"";
    }
    @RequestMapping("/selById")
    @ResponseBody
    public VideoClass selById(String vid){
        System.out.println(vid+"\\\\");
        VideoClass videoClass= fileUploadService.selById(Integer.parseInt(vid));
        System.out.println(videoClass);
        return videoClass;
    }

}
