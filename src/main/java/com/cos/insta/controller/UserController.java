package com.cos.insta.controller;

import com.cos.insta.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {


    @Autowired
    private BCryptPasswordEncoder encoder;




    @GetMapping("/auth/login")
    public String authLogin(){
        return "auth/login";
    }

    @GetMapping("/auth/join")
    public String authJoin(){
        return "auth/join";
    }

    @PostMapping("/auth/joinProc")
    public String authJoinProc(User user){
        String rawPassword = user.getPassword();
        String encPassword = encoder.encode(user.getPassword());
        user.setPassword(encPassword);


    }
}
