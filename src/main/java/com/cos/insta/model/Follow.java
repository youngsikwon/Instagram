package com.cos.insta.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Follow {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 중간 테이블 생성
    // fromUser -> toUser를 following
    // toUser -> fromUser가 follwer
    @ManyToOne
    @JoinColumn(name = "fromUserId")
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "toUserId")
    @JsonIgnoreProperties({"images"})
    private User toUser;

    @Transient
    private boolean matpal;

    @CreationTimestamp
    private Timestamp createDate;
    @CreationTimestamp
    private Timestamp updateDate;

}
