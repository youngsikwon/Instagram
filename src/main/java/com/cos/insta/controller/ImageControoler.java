package com.cos.insta.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageControoler {

    
    @GetMapping("image/feed")
    public String imageFeed(){
        return "image/feed";
    }
}
