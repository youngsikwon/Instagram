package con.cos.insta.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //시퀀스

    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties({"password", "name", "website",
                        "bio", "email", "phone","gender","updateDate","createDate"})
    private User user; // user_id

    @ManyToOne
    @JoinColumn(name = "imageId")
    private Image image; // 기본 : image_id




    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private Timestamp createDate;
    @CreationTimestamp // 자동으로 현재 시간이 세팅
    private TImestamp updateDate;

}

