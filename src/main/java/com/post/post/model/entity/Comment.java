package com.post.post.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String content;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // Relación con User (Muchos comentarios pertenecen a un usuario)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Relación con Post (Muchos comentarios pertenecen a un post)
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
