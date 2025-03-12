package com.post.post.model.entity.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Builder
public class PostResponse {

    private String title;

    private String content;

    private String image;

    private String mediaUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer userId;

    private Set<Integer> commentIds;

    private Set<Integer> likeIds;

    private Set<Integer> tagIds;
}
