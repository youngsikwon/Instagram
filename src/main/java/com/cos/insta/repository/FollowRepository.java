package com.cos.insta.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.insta.model.Follow;

public interface FollowRepository extends JpaRepository<Follow, Integer>{

    // unFolow
    @Transactional
    int deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);

    // 팔로우 유무
    int countByFromUserIdAndToUserId(int fromUserId, int toUserId);

    // 팔로우 리스트
    int findByFromUserId(int fromUserId);

    // 팔로워 리스트
    List<Follow> findByToUserId(int toUser);

}
