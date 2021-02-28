package com.cos.insta;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testContrller {

    @GetMapping("/test/home")
    public String home (){
        return "home";
    }
    }
