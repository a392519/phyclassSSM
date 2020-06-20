package com.demo.controller;


import com.demo.model.VideoClass;
import com.demo.service.PlayService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class PlayController {
    @Autowired
    PlayService playService;
    @RequestMapping("/toPlayPage")
    @CrossOrigin
    public String   toPlayPage(String gname , HttpServletRequest request, HttpServletResponse response){
        String x=gname.substring(0,2);
        VideoClass videoClass=new VideoClass();
        videoClass.setVgrade(x);
        List list=playService.selectByGrade(videoClass);
        return new Gson().toJson(list);

    }

}
