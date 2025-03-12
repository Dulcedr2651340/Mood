package com.post.post.model.entity.dto;

import com.post.post.model.entity.Post;
import com.post.post.model.entity.User;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class LikeResponse {

    private LocalDateTime createdAt;

    private User userId;

    private Post postId;
}
