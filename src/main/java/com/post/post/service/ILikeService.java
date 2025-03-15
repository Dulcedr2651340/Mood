package com.post.post.service;

import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.model.entity.dto.LikeRequest;
import com.post.post.model.entity.dto.LikeResponse;

import java.util.List;

public interface ILikeService {

    //Listar todos los likes
    List<LikeResponse> getAllLikes();

    //Guardar un nuevo like
    LikeResponse saveLike(LikeRequest likeRequest);

    //Obtener Comentarios por un conjunto de Ids
    List<CommentResponse> getLikesByUserId(Integer userId);

    //Obtener Comentarios por un conjunto de Ids
    List<CommentResponse> getLikesByPostId(Integer postId);

    //Eliminar de manera logica por su ID
    void deleteLikeById(Integer id);
}
