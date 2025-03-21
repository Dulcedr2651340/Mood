package com.post.post.service;

import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.model.entity.dto.PostRequest;
import com.post.post.model.entity.dto.PostResponse;

import java.util.List;

public interface IPostService {

    // Listar todos los posts existentes
    List<PostResponse> getAllPosts();

    // Guardar un nuevo post
    PostResponse savePost(PostRequest postRequest);

    // Editar un post existente usando su ID
    PostResponse updatePost(Integer id, PostRequest postRequest);

    // Buscar un post por su ID
    PostResponse findById(Integer id);

    // Obtener posts creados por un usuario específico usando su ID
    List<PostResponse> getPostsByUserId(Integer userId);

    // Obtener posts asociados a un tag específico usando su ID
    List<PostResponse> getPostsByTagId(Integer tagId);

    // Eliminar un post de manera lógica usando su ID
    void deletePostById(Integer id);
}
