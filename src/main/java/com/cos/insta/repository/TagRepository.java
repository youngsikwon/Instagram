package com.cos.insta.repository;

import com.cos.insta.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository  extends JpaRepository<Tag, Integer> {
}
