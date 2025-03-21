package com.post.post.service;

import com.post.post.model.entity.dto.PostResponse;
import com.post.post.model.entity.dto.TagRequest;
import com.post.post.model.entity.dto.TagResponse;

import java.util.List;

public interface ITagService {

    //
    List<TagResponse> getAllTags();

    //
    TagResponse saveTag(TagRequest tagRequest);

    //
    TagResponse updateTag(Integer id, TagRequest tagRequest);


    //
    TagResponse findById(Integer id);


    //Listar tag por Post
    List<TagResponse> getTagsByPostId(Integer postId);

    //Eliminar
    void deleteTagById(Integer id);
}
