package com.post.post.mapper;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.dto.CommentRequest;
import com.post.post.model.entity.dto.CommentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring", uses = CommentMapper.class)
public interface CommentMapper {

    Comment toEntity(CommentRequest commentRequest);

    @Mapping(target = "status", expression = "java(mapStatus(comment))")
    public CommentResponse toCommentResponse(Comment comment);



}
