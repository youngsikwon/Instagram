package com.cos.insta.repository;

import com.cos.insta.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, Integer> {


    // 좋아요한 이미지 찾기 위해!!
    Likes findByUserIdAndImageId(int userId, int imageId);

}
