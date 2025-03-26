package com.post.post.repository;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    //Devuelve todos los Users cuyo estado es true(activo)
    List<User> findAllByStatusTrue();

    // Obtener usuarios asociados a un post específico
    List<User> findByPostsId(Integer postId);

    // Obtener usuarios asociados a comentarios específicos
    List<User> findByCommentsId(Integer commentId);

    // Obtener usuarios que dieron like específico
    List<User> findByLikesId(Integer likeId);
}
