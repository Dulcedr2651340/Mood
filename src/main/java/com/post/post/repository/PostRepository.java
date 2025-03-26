package com.post.post.repository;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    //Devuelve todos los Post cuyo estado es true(activo)
    List<Post> findAllByStatusTrue();

    List<Post> findByUserId(Integer userId);
    List<Post> findByTagsId(Integer tagId);

}
