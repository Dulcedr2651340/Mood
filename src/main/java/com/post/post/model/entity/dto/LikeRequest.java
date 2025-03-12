package com.post.post.model.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.post.post.model.entity.Post;
import com.post.post.model.entity.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LikeRequest {

    @NotNull(message = "The update date cannot be null.")
    private LocalDateTime createdAt;

    @NotNull(message = "UserId cannot be null.")
    private Integer userId;

    @NotNull(message = "UserId cannot be null.")
    private Integer postId;



}
