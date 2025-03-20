package com.post.post.service;

import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.model.entity.dto.PostRequest;
import com.post.post.model.entity.dto.PostResponse;

import java.util.List;

public interface IPostService {

    //Listar todos los post
    List<PostResponse> getAllPosts();

    //Guardar un nuevo post
    PostResponse savePost(PostRequest postRequest);

    //Editar un Post por Id
    PostResponse updatePost(Integer id, PostRequest postRequest);

    //Buscar un album por su ID
    PostResponse findById(Integer id);

    //Obtener Post por un conjunto de Ids por Usuario
    List<PostResponse> getPostsByUserId(Integer userId);

    //Obtener Post por un conjunto de Ids por Tags
    List<PostResponse> getPostsByTagId(Integer tagId);

    //Eliminar lógicamente por Id
    void deletePostById(Integer id);
}
