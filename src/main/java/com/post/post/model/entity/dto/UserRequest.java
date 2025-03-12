package com.post.post.model.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Like;
import com.post.post.model.entity.Post;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest {

    @NotEmpty(message = "The name cannot be empty.")
    private String name;

    @NotEmpty(message = "The username cannot be empty.")
    private String username;

    @NotEmpty(message = "The email cannot be empty.")
    private String email;

    @NotEmpty(message = "The phone cannot be empty.")
    private String phone;

    @NotEmpty(message = "The role cannot be empty.")
    private String role;

    @NotEmpty(message = "The password cannot be empty.")
    private String password;

    private Set<Integer> postIds;

    private Set<Integer> commentIds;

    private Set<Integer> likeIds;
}
