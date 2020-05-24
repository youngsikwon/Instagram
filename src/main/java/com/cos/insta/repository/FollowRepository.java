package com.cos.insta.repository;

import com.cos.insta.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface FollowRepository extends JpaRepository<Follow, Integer> {



    //un FOllow
    @Transactional
    void deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);
}
