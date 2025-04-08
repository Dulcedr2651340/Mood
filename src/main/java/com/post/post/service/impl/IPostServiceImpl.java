package com.post.post.service.impl;

import com.post.post.mapper.PostMapper;
import com.post.post.model.entity.Post;
import com.post.post.model.entity.dto.PostRequest;
import com.post.post.model.entity.dto.PostResponse;
import com.post.post.repository.PostRepository;
import com.post.post.service.IPostService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
public class IPostServiceImpl implements IPostService {

    private  PostRepository postRepository;
    private  PostMapper postMapper;


    @Override
    public List<PostResponse> getAllPosts() {
        log.info("Fetching all Posts");
        return postRepository.findAll()
                .stream()
                .map(postMapper::toPostResponse)
                .collect(Collectors.toList());
    }

    @Override
    public PostResponse savePost(PostRequest postRequest) {
        log.info("Saving Post: {}", postRequest);

        //Convertimos el DTO en entidad (Post)
        Post post = postMapper.ToEntity(postRequest);
        log.info("Mapped post entity: {}", post);

        //Guardamos el Post en la base de datos
        Post savedPost = postRepository.save(post);
        log.info("Post saved successfully with ID", savedPost.getId());

        //Devolvemos el DTO(PostResponse) convertido desde la entidad guardada
        return postMapper.toPostResponse(savedPost);
    }

    @Override
    public PostResponse updatePost(Integer id, PostRequest postRequest) {
        return null;
    }

    @Override
    public PostResponse findById(Integer id) {
        return null;
    }

    @Override
    public List<PostResponse> getPostsByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<PostResponse> getPostsByTagId(Integer tagId) {
        return null;
    }

    @Override
    public void deletePostById(Integer id) {

    }
}
