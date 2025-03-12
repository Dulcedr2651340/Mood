package com.post.post.model.entity.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
public class TagResponse {

    private String name;

    private Set<Integer> postIds;
}
