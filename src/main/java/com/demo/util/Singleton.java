package com.demo.util;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
    static Map<String,Object> bookMap;

    /**
     * 获得新的map

     * @return
     */
    public static Map<String,Object> getBookMap(){
        if(bookMap==null){
            return  new HashMap<>();
        }
        return  bookMap;
    }
    public static void addBookMap(Map<String,Object> bookMap){
        Singleton.bookMap=bookMap;
    }
}
