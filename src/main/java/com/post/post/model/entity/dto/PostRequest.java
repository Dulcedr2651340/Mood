package com.post.post.model.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Like;
import com.post.post.model.entity.Tag;
import com.post.post.model.entity.User;
import jakarta.validation.constraints.NotEmpty;
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
public class PostRequest {

    @NotEmpty(message = "The title cannot be empty.")
    private String title;

    @NotEmpty(message = "The content cannot be empty.")
    private String content;

    @NotEmpty(message = "The image URL cannot be empty.")
    private String image;

    @NotEmpty(message = "The media URL cannot be empty.")
    private String mediaUrl;

    @NotNull(message = "The creation date cannot be null.")
    private LocalDateTime createdAt;

    @NotNull(message = "The update date cannot be null.")
    private LocalDateTime updatedAt;

    @NotNull(message = "User ID cannot be null.")
    private Integer userId;

    private Set<Integer> commentIds;

    private Set<Integer> likeIds;

    private Set<Integer> tagIds;
}
