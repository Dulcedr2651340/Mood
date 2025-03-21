package com.post.post.repository;

import com.post.post.model.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Integer> {

    // Buscar etiquetas (tags) asociadas a un post específico
    List<Tag> findByPostsId(Integer postId);
}
