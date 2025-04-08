package com.post.post.mapper;

import com.post.post.model.entity.Post;
import com.post.post.model.entity.dto.LikeResponse;
import com.post.post.model.entity.dto.PostRequest;
import com.post.post.model.entity.dto.PostResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring", uses = PostMapper.class)
public interface PostMapper {

    Post ToEntity(PostRequest postRequest);

    @Mapping(target = "status", expression = "java(mapStatus(posts))")
    public PostResponse toPostResponse(Post post);
}
