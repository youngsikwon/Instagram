package com.cos.insta;


import com.cos.insta.model.Follow;
import com.cos.insta.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestContrller {


    @GetMapping("/test/follows")
    public @ResponseBody List<Follow> getLike(){

        User user = new User();
        user.setId(1);
        user.setUsername("youngsik");
        user.setName("영식");
        user.setEmail("youngsik@gmail.com");
        user.setProfileImage("my.jpg");

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("youngsik3200");
        user2.setName("영식이");
        user2.setEmail("youngsik@gmail.com");
        user2.setProfileImage("my.jpg");

        User user3 = new User();
        user3.setId(3);
        user3.setUsername("youngsik3200");
        user3.setName("영쉬기");
        user3.setEmail("youngsik3200@gmail.com");
        user3.setProfileImage("my.jpg");

        Follow follow = new Follow();
        follow.setId(1);
        follow.setFromUser(user);
        follow.setToUser(user2);

        Follow follow2 = new Follow();
        follow2.setId(2);
        follow2.setFromUser(user);
        follow2.setToUser(user2);

        Follow follow3 = new Follow();
        follow3.setId(3);
        follow3.setFromUser(user2);
        follow3.setToUser(user);

        List<Follow> follows = new ArrayList<Follow>();
        follows.add(follow);
        follows.add(follow2);
        follows.add(follow3);

        return follows;
    }
}
