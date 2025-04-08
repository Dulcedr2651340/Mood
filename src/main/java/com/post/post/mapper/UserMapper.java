package com.post.post.mapper;

import com.post.post.model.entity.User;
import com.post.post.model.entity.dto.TagResponse;
import com.post.post.model.entity.dto.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring", uses = UserMapper.class)
public interface UserMapper {

    User ToEntity(UserMapper userMapper);

    @Mapping(target = "status", expression = "java(mapStatus(posts))")
    public UserResponse toUserResponse(User user);
}
