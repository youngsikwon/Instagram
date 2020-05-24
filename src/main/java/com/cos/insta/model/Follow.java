package com.cos.insta.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Follow {

        // 어노테이션 학습
    // @Transien :  데이터베이스에 저장하지 않고 조회하지도 않습니다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 중간 테이블 생성됨.
    // fromUser가 toUser를 following함.
    // toUser를 fromUser가 follower함.


    @ManyToOne
    @JoinColumn(name = "fromUserId")
    @JsonIgnoreProperties({"images"})
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "toUserId")
    @JsonIgnoreProperties({"images"})
    private User toUser;

    @Transient
    private boolean matpla;

    @Transient
    private boolean followState;


    @Transient
    private boolean principalMatpal;

    @CreationTimestamp
    private Timestamp createDate;

    @CreationTimestamp
    private Timestamp updateDate;


}
