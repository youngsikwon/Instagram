package com.cos.insta.test;


import java.util.ArrayList;
import java.util.List;

import com.cos.insta.model.Follow;
import com.cos.insta.model.Image;
import com.cos.insta.model.Likes;
import com.cos.insta.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

    @GetMapping("/test/home")
    public String testHome() {
        return "home";
    }

    @GetMapping("/test/user")
    public @ResponseBody
    User getUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("cos");
        user.setName("홍길동");
        user.setEmail("cos@nate.com");
        user.setProfileImage("my.jpg");

        Image img1 = new Image();
        img1.setId(1);
        img1.setCaption("음식 사진");
        img1.setLocation("food.jpg");
        img1.setLocation("부산 서면");
        img1.setUser(user);

        Image img2 = new Image();
        img2.setId(2);
        img2.setCaption("장난감 사진");
        img2.setLocation("game.jpg");
        img2.setLocation("서울 강남");
        img2.setUser(user);

        List<Image> images = new ArrayList<>();
        images.add(img1);
        images.add(img2);
        user.setImages(images);

        return user;
    }

    @GetMapping("/test/image")
    public @ResponseBody Image getImage() {
        User user = new User();
        user.setId(1);
        user.setUsername("cos");
        user.setName("홍길동");
        user.setEmail("cos@nate.com");
        user.setProfileImage("my.jpg");

        Image img1 = new Image();
        img1.setId(1);
        img1.setCaption("음식 사진");
        img1.setLocation("food.jpg");
        img1.setLocation("부산 서면");
        img1.setUser(user);

        return img1;
    }

    @GetMapping("/test/images")
    public @ResponseBody List<Image> getImages(){
        User user = new User();
        user.setId(1);
        user.setUsername("cos");
        user.setName("홍길동");
        user.setEmail("cos@nate.com");
        user.setProfileImage("my.jpg");

        Image img1 = new Image();
        img1.setId(1);
        img1.setCaption("음식 사진");
        img1.setLocation("food.jpg");
        img1.setLocation("부산 서면");
        img1.setUser(user);

        Image img2 = new Image();
        img2.setId(2);
        img2.setCaption("장난감 사진");
        img2.setLocation("game.jpg");
        img2.setLocation("서울 강남");
        img2.setUser(user);

        List<Image> images = new ArrayList<>();
        images.add(img1);
        images.add(img2);
        user.setImages(images);

        return images;
    }

    @GetMapping("/test/likes")
    public @ResponseBody
    Likes getLike() {
        User user = new User();
        user.setId(1);
        user.setUsername("cos");
        user.setName("홍길동");
        user.setEmail("cos@nate.com");
        user.setProfileImage("my.jpg");

        Image img1 = new Image();
        img1.setId(1);
        img1.setCaption("음식 사진");
        img1.setLocation("food.jpg");
        img1.setLocation("부산 서면");
        img1.setUser(user);

        Likes like = new Likes();
        like.setId(1);
        like.setUser(user);
        like.setImage(img1);

        return like;
    }

    @GetMapping("/test/follow")
    public @ResponseBody List<Follow> getFollows() {


        User user1 = new User();
        user1.setId(1);
        user1.setUsername("won");
        user1.setName("영식");
        user1.setEmail("Won@nate.com");
        user1.setProfileImage("won.jpg");

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("youngsik");
        user2.setName("제이슨");
        user2.setEmail("jason@nate.com");
        user2.setProfileImage("jason.jpg");

        User user3 = new User();
        user3.setId(3);
        user3.setUsername("king");
        user3.setName("킹");
        user3.setEmail("king@nate.com");
        user3.setProfileImage("king.jpg");

        Follow follow1 = new Follow();
        follow1.setId(1);
        follow1.setFromUser(user1);
        follow1.setToUser(user2);

        Follow follow2 = new Follow();
        follow2.setId(2);
        follow2.setFromUser(user1);
        follow2.setToUser(user3);

        Follow follow3 = new Follow();
        follow3.setId(3);
        follow3.setFromUser(user2);
        follow3.setToUser(user1);

        List<Follow> follows = new ArrayList<Follow>();
        follows.add(follow1);
        follows.add(follow2);
        follows.add(follow3);

        return follows;
    }

}