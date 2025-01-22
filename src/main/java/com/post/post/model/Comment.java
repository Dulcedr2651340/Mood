package com.post.post.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Comment {

    private Integer id;
    private String content;
    private LocalDateTime createdAt;
    private Integer postId;
    private Integer userId;

    public Comment() {
    }

    public Comment(Integer id, String content, LocalDateTime createdAt, Integer postId, Integer userId) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.postId = postId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", postId=" + postId +
                ", userId=" + userId +
                '}';
    }
}
