package com.post.post.service;

import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.model.entity.dto.LikeRequest;
import com.post.post.model.entity.dto.LikeResponse;

import java.util.List;

public interface ILikeService {

    // Listar todos los likes existentes
    List<LikeResponse> getAllLikes();

    //Guardar un nuevo like
    LikeResponse saveLike(LikeRequest likeRequest);

    // Buscar un like por su ID
    LikeResponse findById(Integer id);

    // Obtener likes realizados por un usuario específico usando su ID
    List<LikeResponse> getLikesByUserId(Integer userId);

    // Obtener likes pertenecientes a un post específico usando su ID
    List<LikeResponse> getLikesByPostId(Integer postId);

    // Eliminar un like de manera lógica usando su ID
    void deleteLikeById(Integer id);
}
