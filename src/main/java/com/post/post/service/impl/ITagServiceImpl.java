package com.post.post.service.impl;

import com.post.post.mapper.TagMapper;
import com.post.post.model.entity.dto.TagRequest;
import com.post.post.model.entity.dto.TagResponse;
import com.post.post.repository.TagRepository;
import com.post.post.service.ITagService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ITagServiceImpl implements ITagService {

    public TagRepository tagRepository;
    public TagMapper tagMapper;

    @Override
    public List<TagResponse> getAllTags() {
        log.info("Fetching all Tags");
        return tagRepository.findAll()
                .stream()
                .map(tagMapper::toTagResponse)
                .collect(Collectors.toList());
    }

    @Override
    public TagResponse saveTag(TagRequest tagRequest) {
        return null;
    }

    @Override
    public TagResponse updateTag(Integer id, TagRequest tagRequest) {
        return null;
    }

    @Override
    public TagResponse findById(Integer id) {
        return null;
    }

    @Override
    public List<TagResponse> getTagsByPostId(Integer postId) {
        return null;
    }

    @Override
    public void deleteTagById(Integer id) {

    }
}
