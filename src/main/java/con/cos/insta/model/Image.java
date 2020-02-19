package con.cos.insta.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    private String fileName; // 사진 파일 이름
    private String filePath; // 사진 경로

    @ManyToOne
    @JoinColumn(name="userId")
    @JsonIgnoreProperties({"password"})
    private User user;
    // (1) Tag List

    // (2) Like List
    @OneToMany
    private List<Likes> likes = new ArrayList<>();


    @Transient // DB에 영향을 미치지 않는다.
    private int likeCount;


    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private Timestamp createDate;
    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private TImestamp updateDate;





}
