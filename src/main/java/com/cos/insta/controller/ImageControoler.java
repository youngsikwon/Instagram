package com.cos.insta.controller;


import com.cos.insta.service.MyUserDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageControoler {

    private static final Logger log = LoggerFactory.getLogger(ImageControoler.class);

    @GetMapping({"/","image/feed"})
    public String imageFeed(@AuthenticationPrincipal MyUserDetail userDetail ){
        log.info("Username : "+userDetail.getUsername());
        return "image/feed";
    }
}
