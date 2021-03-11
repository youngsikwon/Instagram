package com.cos.insta.util;

import java.util.ArrayList;
import java.util.List;

public class Utils {


    //Tag 파싱
    public static List<String> tagParser(String tags){
        String temp[] = tags.split("#");

        List<String> tagList = new ArrayList<String>();

        for(String tag: temp){
            tagList.add(tag);
        }

        return tagList;
    }

}
