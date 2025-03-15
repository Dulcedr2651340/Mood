package com.post.post.repository;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Integer> {

    List<Like> findByUserId(Integer userId);

    List<Like> findByPostId(Integer postId);
}
