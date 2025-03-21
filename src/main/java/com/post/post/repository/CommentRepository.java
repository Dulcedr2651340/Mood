package com.post.post.repository;

import com.post.post.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    // Buscar comentarios por el ID del usuario
    List<Comment> findByUserId(Integer userId);

    // Buscar comentarios por el ID del post
    List<Comment> findByPostId(Integer postId);

}
