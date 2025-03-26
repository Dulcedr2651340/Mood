package com.post.post.repository;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Integer> {

    //Devuelve todos los likes cuyo estado es true(activo)
    List<Like> findAllByStatusTrue();

    List<Like> findByUserId(Integer userId);

    List<Like> findByPostId(Integer postId);
}
