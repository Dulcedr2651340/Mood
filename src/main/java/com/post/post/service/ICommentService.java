package com.post.post.service;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.dto.CommentRequest;
import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.model.entity.dto.LikeResponse;

import java.util.List;
import java.util.Set;

public interface ICommentService {

    //Listar todos los comentarios
    List<CommentResponse> getAllComments();

    //Guardar un nuevo comentario
    CommentResponse saveComment(CommentRequest commentRequest);

    //Actualizar el comentario existente
    CommentResponse updateComment(Integer id, CommentRequest commentRequest);

    //Buscar un album por su ID
    CommentResponse findById(Integer id);

    //Obtener Comentarios por un conjunto de Ids
    List<CommentResponse> getCommentsByUserId(Integer userId);

    //Obtener Comentarios por un conjunto de Ids
    List<CommentResponse> getCommentsByPostId(Integer postId);

    //Eliminar de manera lógica por su ID
    void deleteCommentById(Integer id);

}
