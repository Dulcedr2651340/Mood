package com.post.post.model.entity;

import com.post.post.model.entity.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    // Relación con Post (Un tag puede pertenecer a muchos posts)
    @ManyToMany(mappedBy = "tags")
    private final Set<Post> posts = new HashSet<>();
}
