package com.post.post.mapper;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Like;
import com.post.post.model.entity.dto.CommentRequest;
import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.model.entity.dto.LikeRequest;
import com.post.post.model.entity.dto.LikeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring", uses = LikeMapper.class)
public interface LikeMapper {
    Like toEntity(LikeRequest likeRequest);

    @Mapping(target = "status", expression = "java(mapStatus(like))")
    public LikeResponse toLikeResponse(Like like);
}
