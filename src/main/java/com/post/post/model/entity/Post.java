package com.post.post.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "image_url")
    private String image;

    @Column(name = "media_url", length = 500)
    private String mediaUrl;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // Relación con User (Muchos posts pertenecen a un usuario)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Un Post tiene varios Comentarios
    @OneToMany(mappedBy = "post")
    private Set<Comment> comments = new HashSet<>();

    // Un Post tiene varios Likes
    @OneToMany(mappedBy = "post")
    private Set<Like> likes = new HashSet<>();

    // Un Post puede tener varios Tags (etiquetas)
    @ManyToMany
    @JoinTable(
            name = "post_tags",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )

    private Set<Tag> tags = new HashSet<>();
}
