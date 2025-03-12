package com.post.post.model.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.post.post.model.entity.Post;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagRequest {

    @NotEmpty(message = "The name cannot be empty")
    private String name;

    private Set<Integer> postIds;
}
