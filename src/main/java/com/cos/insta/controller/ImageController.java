package com.cos.insta.controller;


import com.cos.insta.model.Image;
import com.cos.insta.model.Tag;
import com.cos.insta.model.User;
import com.cos.insta.repository.ImageRepository;
import com.cos.insta.repository.TagRepository;
import com.cos.insta.service.MyUserDetail;
import com.cos.insta.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Controller
public class ImageController {

    private static Logger log = LoggerFactory.getLogger(ImageController.class);

    @Autowired
    private ImageRepository mImageRepository;

    @Autowired
    private TagRepository mTagRepository;


    @Value("${file.path}")
    private String fileRealPath;

    @GetMapping({"/","/image/feed"})
    public String imageFeed(
            @AuthenticationPrincipal MyUserDetail userDetai){
        log.info("username : " + userDetai.getUsername());

        return "image/feed";
    }


    @GetMapping({"/","/image/uploadProc"})
    public String imageUploadProc(
            @AuthenticationPrincipal MyUserDetail userDetail,
            @RequestParam("file")MultipartFile file,
            @RequestParam("caption") String caption,
            @RequestParam("location") String location,
            @RequestParam("tags") String tags){

        log.info("username : "+ userDetail.getUsername());

        //업로드
        UUID uuid = UUID.randomUUID();
        String uuidFilename = file.getOriginalFilename() + "_" + uuid;

        String fileRealPath = "";

        Path filePath = Paths.get(fileRealPath+uuidFilename);

        try{
            Files.write(filePath, file.getBytes()); // 하드디스크 기
        }  catch (IOException e){
            e.printStackTrace();
        }
        User principal = userDetail.getUser();

       Image image = new Image();

       image.setCaption(caption);
       image.setLocation(location);
       image.setUser(principal);
       image.setPostImage(filePath.toString());

        mImageRepository.save(image);

       // Tag 객체

        List<String> tagList = Utils.tagParser(tags);

            for(String tag: tagList){
                Tag t = new Tag();
                t.setName(tag);
                t.setImage(image);
                mTagRepository.save(t);
                image.getTags().add(t);
            }

        return "redirect:/";
    }


    @GetMapping("/image./upload")
    public String imageUpload(){
        return "image/image_upload";
    }





}
