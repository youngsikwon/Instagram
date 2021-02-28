package com.cos.insta;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestContrller {


    @GetMapping("/test/ home")
    public String testHome(){
        return "home";
    }
}
