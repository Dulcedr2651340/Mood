package com.post.post.model.entity.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
public class UserResponse {

    private String name;

    private String username;

    private String email;

    private String phone;

    private String role;

    private String password;

    private Set<Integer> postIds;

    private Set<Integer> commentIds;

    private Set<Integer> likeIds;
}
