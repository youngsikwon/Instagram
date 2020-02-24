package com.cos.insta.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data // Lombok
@Entity // JPA -> ORM
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //시퀀스
    private String username; // 사용자 아이디
    private String name; // 암호된 패스워드
    private String website; // 사용자 이름
    private String bio; // 자기소개
    private String email; // 이메일
    private String phone;
    private String gender;
    private String profileImage;



    // (1) findById () 때만 동작
    // (2) findByUserInfo () 제외
    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties({"user"})
    private List<Image> images = new ArrayList<>();


    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private Timestamp createDate;
    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private Timestamp updateDate;
}
