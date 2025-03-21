package com.post.post.model.entity;

import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Like;
import com.post.post.model.entity.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String username;
    private String email;

    private String phone;
    private String role;
    private String password;

    //Relación
    @OneToMany(mappedBy = "user")
    private final Set<Post> posts = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private final Set<Comment> comments = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private final Set<Like> likes = new HashSet<>();

}
