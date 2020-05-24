package com.cos.insta.controller;


import com.cos.insta.model.Follow;
import com.cos.insta.model.User;
import com.cos.insta.repository.FollowRepository;
import com.cos.insta.repository.UserRepository;
import com.cos.insta.service.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class FollowController {


    @Autowired
    private UserRepository mUserRepository;

    @Autowired
    private FollowRepository mFollowRepository;

    @PostMapping("/follow/{id}")
    public @ResponseBody String follow(@AuthenticationPrincipal MyUserDetail userDetail, @PathVariable int id) {
        User fromUser = userDetail.getUser();
        Optional<User> oToUser = mUserRepository.findById(id);
        User toUser = oToUser.get();

        Follow follow = new Follow();
        follow.setFromUser(fromUser);
        follow.setToUser(toUser);

        mFollowRepository.save(follow);

        return "ok";
    }

    @DeleteMapping("/follow/{id}")
    public @ResponseBody String unFollow(@AuthenticationPrincipal MyUserDetail userDetail, @PathVariable int id) {
        User fromUser = userDetail.getUser();
        Optional<User> oToUser = mUserRepository.findById(id);
        User toUser = oToUser.get();

        mFollowRepository.deleteByFromUserIdAndToUserId(fromUser.getId(), toUser.getId());

        List<Follow> follows = mFollowRepository.findAll();
        return "ok"; // ResponseEntity로 수정
    }


    @GetMapping("/follow/follower/{id}")
    public String followFollower(@PathVariable int id){

        // 팔로워 리스트
        return "follow/follow";
    }

    @GetMapping("/follow/follow/{id}")
    public String followFollow (@PathVariable int id){

        //팔로우 리스트

        return "follow/follow";
    }




}
