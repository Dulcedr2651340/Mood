package com.post.post.service;

import com.post.post.model.entity.dto.PostResponse;
import com.post.post.model.entity.dto.TagRequest;
import com.post.post.model.entity.dto.TagResponse;

import java.util.List;

public interface ITagService {

    // Listar todos los tags existentes
    List<TagResponse> getAllTags();

    // Guardar un nuevo tag
    TagResponse saveTag(TagRequest tagRequest);

    // Actualizar un tag existente usando su ID
    TagResponse updateTag(Integer id, TagRequest tagRequest);

    // Buscar un tag por su ID
    TagResponse findById(Integer id);

    // Obtener tags asociados a un post específico usando su ID
    List<TagResponse> getTagsByPostId(Integer postId);

    // Eliminar un tag de manera lógica usando su ID
    void deleteTagById(Integer id);
}
