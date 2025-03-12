package com.post.post.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table( name = "likes")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp  // Asigna la fecha de creación automáticamente
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public Like() {
    }

    public Like(Integer id, LocalDateTime createdAt) {
        this.id = id;
        this.createdAt = createdAt;

    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}
