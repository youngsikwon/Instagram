package com.cos.insta.controller;


import com.cos.insta.model.Follow;
import com.cos.insta.model.User;
import com.cos.insta.repository.FollowRepository;
import com.cos.insta.repository.UserRepository;
import com.cos.insta.service.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class FollowController {

    @Autowired
    private UserRepository mUserRepository;

    @Autowired
    private FollowRepository mFollowRepository;

    @PostMapping("/follow/{id}")
    public @ResponseBody Follow follow(
            @AuthenticationPrincipal MyUserDetail userDetail,
            @PathVariable int id){


        User fromUser = userDetail.getUser();

        Optional<User> oToUser =
                mUserRepository.findById(id);
        User toUser = oToUser.get();

        mFollowRepository.deleteByFromUserIdAndToUserId(fromUser.g);
        return follow;
    }

}
