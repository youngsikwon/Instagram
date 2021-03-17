package com.cos.insta.repository;

import com.cos.insta.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface FollowRepository extends JpaRepository<Follow, Integer> {


    // unFolow
    @Transactional
    int deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);

    // 팔로우 유무
    int countByFromUserIdAndToUserId(int fromUserId, int toUserId);

    // 팔로우 리스트
    List<Follow> findByFromUserId(int fromUserId);

    //팔로워 리스트(맞팔 체크 후 버튼 색깔 결정)
    List<Follow> findByToUserId(int toUserId);

    //팔로우 카운트
    int countByFromUserId(int fromUserId);

    // 팔로워 카운트
    int countByToUserId(int toUserId);
}
