package com.post.post.mapper;

import com.post.post.model.entity.Tag;
import com.post.post.model.entity.dto.TagRequest;
import com.post.post.model.entity.dto.TagResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring", uses = TagMapper.class)
public interface TagMapper {

    public Tag toEntity(TagRequest tagRequest);

    @Mapping(target = "status", expression = "java(mapStatus(posts))")
    public TagResponse toTagResponse(Tag tag);

}
