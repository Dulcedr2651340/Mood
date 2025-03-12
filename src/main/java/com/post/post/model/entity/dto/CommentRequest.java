package com.post.post.model.entity.dto;
import com.post.post.model.entity.User;
import jakarta.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentRequest {

    @NotEmpty(message = "The content cannot be empty.")
    private String content;

    @NotNull(message = "The update date cannot be null.")
    private LocalDateTime createdAt;

    @NotNull(message = "The userIds cannot be empty or null.")
    private Integer userId;

    @NotNull(message = "The postIds cannot be empty or null.")
    private Integer postId;

}
