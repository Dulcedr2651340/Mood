package com.post.post.service.impl;

import com.post.post.mapper.LikeMapper;
import com.post.post.model.entity.Like;
import com.post.post.model.entity.dto.LikeRequest;
import com.post.post.model.entity.dto.LikeResponse;
import com.post.post.repository.LikeRepository;
import com.post.post.repository.PostRepository;
import com.post.post.repository.UserRepository;
import com.post.post.service.ILikeService;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ILikeServiceImpl implements ILikeService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    private LikeRepository likeRepository;

    private LikeMapper likeMapper;
    @Override
    public List<LikeResponse> getAllLikes() {
        log.info("Fetching all Likes");
        return likeRepository.findAll()
                .stream()
                .map(likeMapper::toLikeResponse)
                .collect(Collectors.toList());
    }

    @Override
    public LikeResponse saveLike(LikeRequest likeRequest) {
        log.info("Saving Like: {}", likeRequest);

        // Convertimos el DTO en entidad (Like)
        Like like = likeMapper.toEntity(likeRequest);
        log.info("Mapped Like entity: {}", like);

        //Guardamos el Like en la base de datos
        Like savedLike = likeRepository.save(like);
        log.info("Like saved successfully with ID", savedLike.getId());

        //Devolvemos el DTO (LikeResponse) convertido desde la entidad guardada
        return likeMapper.toLikeResponse(savedLike);
    }

    @Override
    public LikeResponse findById(Integer id) {
        return null;
    }

    @Override
    public List<LikeResponse> getLikesByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<LikeResponse> getLikesByPostId(Integer postId) {
        return null;
    }

    @Override
    public void deleteLikeById(Integer id) {

    }
}
