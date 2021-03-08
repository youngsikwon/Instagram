package com.cos.insta.repository;

import com.cos.insta.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Integer> {


    //unFollow
    void deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);
}
