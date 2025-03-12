package com.post.post.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring", uses = CommentMapper.class)
public interface TagMapper {
}
