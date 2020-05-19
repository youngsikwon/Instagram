package com.cos.insta.controller;

import com.cos.insta.model.Image;
import com.cos.insta.model.User;
import com.cos.insta.repository.FollowRepository;
import com.cos.insta.repository.LikesRepository;
import com.cos.insta.repository.UserRepository;
import com.cos.insta.service.MyUserDetail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private UserRepository mUserRepository;

    @Autowired
    private FollowRepository mFollowRespository;

    @GetMapping("/auth/login")
    public String authLogin() {
        return "auth/login";
    }

    @GetMapping("/auth/join")
    public String authJoin() {
        return "auth/join";
    }


    @PostMapping("/auth/joinProc")
    public String authJoinProc(User user) {
        String rawPassword = user.getPassword();
        String encPassword = encoder.encode(rawPassword);
        user.setPassword(encPassword);
        log.info("rawPassword : " + rawPassword);
        log.info("encPassword : " + encPassword);
        mUserRepository.save(user);
        return "redirect:/auth/login";
    }


    @GetMapping("user/{id}")
    public String profile(
            @PathVariable int id,
    @AuthenticationPrincipal MyUserDetail userDetail,
            Model model){
//        1. imageCount
//        2. followerCount
//        3. followingCOunt
//        4. User 오브젝트 (Image (likeCount) 컬렉션)
//        5. followCheck 유무

//        5번
        User user = userDetail.getUser();
        mFollowRespository.countByFromUserIdAndToUserId(user.getId(), id);
        return "user/profile";
    }
}
