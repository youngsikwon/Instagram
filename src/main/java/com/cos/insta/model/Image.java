package com.cos.insta.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Image {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //시퀀스
    private String location; // 사진 찍은 위치
    private String caption; // 사진 설명
    private String postImage; // 포스팅 사진 경로 + 이름

    @ManyToOne
    @JoinColumn(name="userId")
    @JsonIgnoreProperties({"password"})
    private User user;


    // (1) Tag List
    @OneToMany(mappedBy = "image")
    @JsonManagedReference
    private List<Tag> tags = new ArrayList<>();
    // (2) Like List
    @OneToMany(mappedBy = "image")
    private List<Likes> likes = new ArrayList<>();


    @Transient // DB에 영향을 미치지 않는다.
    private int likeCount;


    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private Timestamp createDate;
    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private Timestamp updateDate;





}
