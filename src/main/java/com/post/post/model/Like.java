package com.post.post.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Like {

    private Integer id;

    private LocalDateTime createdAt;

    private Integer postId; // ID del Post relacionado

    private Integer userId; // ID del Usuario que dio Like

    public Like() {
    }

    public Like(Integer id, LocalDateTime createdAt, Integer postId, Integer userId) {
        this.id = id;
        this.createdAt = createdAt;
        this.postId = postId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", postId=" + postId +
                ", userId=" + userId +
                '}';
    }
}
