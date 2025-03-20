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

    //Buscar Like por Id
    LikeResponse findById(Integer id);

    //Obtener Likes por un conjunto de Ids por Usuario
    List<LikeResponse> getLikesByUserId(Integer userId);

    //Obtener Likes por un conjunto de Ids por Post
    List<LikeResponse> getLikesByPostId(Integer postId);

    //Eliminar de manera lógica por su ID
    void deleteLikeById(Integer id);
}
