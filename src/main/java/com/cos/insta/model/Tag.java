package com.cos.insta.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Tag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //시퀀스


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="imageId")
    @JsonBackReference
    private Image image;



    @CreationTimestamp
    private Timestamp createDate;
    @CreationTimestamp
    private Timestamp updateDate;


    }
