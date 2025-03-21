package com.post.post.service;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.dto.CommentRequest;
import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.model.entity.dto.LikeResponse;

import java.util.List;
import java.util.Set;

public interface ICommentService {

    // Lista todos los comentarios existentes en la bd
    List<CommentResponse> getAllComments();

    // Guardar un nuevo comentario
    CommentResponse saveComment(CommentRequest commentRequest);

    // Actualizar el comentario existente por su ID
    CommentResponse updateComment(Integer id, CommentRequest commentRequest);

    // Buscar un comentario por su ID
    CommentResponse findById(Integer id);

    // Obtener comentarios hechos por un usuario específico usando su ID
    List<CommentResponse> getCommentsByUserId(Integer userId);

    // Obtener comentarios pertenecientes a un post específico usando su ID
    List<CommentResponse> getCommentsByPostId(Integer postId);

    // Eliminar un comentario de manera lógica por su ID
    void deleteCommentById(Integer id);

}
