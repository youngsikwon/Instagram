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
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Controller
public class ImageControoler {

   private static final Logger log = LoggerFactory.getLogger(ImageControoler.class);

   @Autowired
   private ImageRepository mImageRepository;

   @Autowired
   private TagRepository mTagRepository;

   @GetMapping({"/", "image/feed"})
   public String imageFeed(@AuthenticationPrincipal MyUserDetail userDetail) {

      log.info("Username : " + userDetail.getUsername());
      return "image/feed";
   }

   @PostMapping("/image/uploadProc")
   public String imageUploadProc(
          @AuthenticationPrincipal MyUserDetail userDetail,
          @RequestParam("file") MultipartFile file,
          @RequestParam("caption") String caption,
          @RequestParam("location") String location,
          @RequestParam("tags") String tags

   ){
       // 이미지 업로드 수행
       UUID uuid = UUID.randomUUID();
       String uuidFilename = file.getOriginalFilename()+"_"+uuid;

       Path filePath = Paths.get(fileRealPath+uuidFilename);


       try {
           Files.write(filePath, file.getBytes()); //하드디스크기록
       }catch (IOException e){
           e.printStackTrace();
       }

       User principal = userDetail.getUser();



       Image image = new Image();

       image.setCaption(caption);
       image.setLocation(location);
       image.setUser(principal);
       image.setPostImage(filePath.toString());

      mImageRepository.save(image);



       //Tag 객체 집어 넣겠음.

      List<String> tagList = Utils.tagParser(tags);


      for(String tag : tagList){
         Tag t = new Tag();
         t.setName(tag);
         t.setImage(image);
         mTagRepository.save(t)
      }
       return "redirect:/";






   }
}
