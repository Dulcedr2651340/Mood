package com.post.post.model.entity.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class CommentResponse {

    private String content;

    private LocalDateTime createdAt;

    private Integer userId;

    private Integer postId;
}
