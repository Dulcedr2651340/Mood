package com.post.post.repository;

import com.post.post.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByUserId(Integer userId);

    List<Comment> findByPostId(Integer postId);

}
