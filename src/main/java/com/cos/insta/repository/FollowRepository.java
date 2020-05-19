package com.cos.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface FollowRepository extends JpaRepository<Follow, Integer> {


    //unFollow
    @Transactional
    void deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);
}
