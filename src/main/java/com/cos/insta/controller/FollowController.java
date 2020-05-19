package com.cos.insta.controller;


import com.cos.insta.model.User;
import com.cos.insta.service.MyUserDetail;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class FollowController {


    @DeleteMapping("/follow/{id}")
    public @ResponseBody Follow unFollow(
        @AuthenticationPrincipal MyUserDetail userDetail,
                @PathVariable int id){
        User fromUser = userDetail.getUser();
        Optional<User> oToUser = mUserRepository.findById(id);
        User toUser = oToUser.get();

        mFollowRepository.deleteByFromUserIdANdToUserId(fromUser.getId(), toUser,getId());

    }


}
