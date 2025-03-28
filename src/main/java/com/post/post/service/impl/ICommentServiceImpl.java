package com.post.post.service.impl;

import com.post.post.mapper.CommentMapper;
import com.post.post.model.entity.Comment;
import com.post.post.model.entity.Post;
import com.post.post.model.entity.User;
import com.post.post.model.entity.dto.CommentRequest;
import com.post.post.model.entity.dto.CommentResponse;
import com.post.post.repository.CommentRepository;
import com.post.post.repository.PostRepository;
import com.post.post.repository.UserRepository;
import com.post.post.service.ICommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class ICommentServiceImpl implements ICommentService {

    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;
    private final UserRepository userRepository;
    private final PostRepository postRepository;


    //Lista toda la lista activa pero debe ver que tambien tengas estados
    @Override
    public List<CommentResponse> getAllComments() {
        log.info("Fetching all comments");
        return commentRepository.findAll()
                .stream()
                .map(commentMapper::toCommentResponse)
                .collect(Collectors.toList());
    }

    @Override
    public CommentResponse saveComment(CommentRequest commentRequest) {
        log.info("Saving comment: {}", commentRequest); // Indicando que se está intentando guardar un comment


        // Convertimos el DTO en entidad (Comment)
        Comment comment = commentMapper.toEntity(commentRequest);
        log.debug("Mapped comment entity: {}", comment); // Registro del comment mapeado desde CommentRequest

        // Guardamos el comentario en la base de datos
        Comment savedComment = commentRepository.save(comment);
        log.info("Comment saved successfully with ID: {}", savedComment.getId()); // Confirmamos que se guardó

        // Devolvemos el DTO (CommentResponse) convertido desde la entidad guardada
        return commentMapper.toCommentResponse(savedComment);
    }


    @Override
    public CommentResponse updateComment(Integer id, CommentRequest commentRequest) {
        log.info("Attempting to update Comment with ID: {}", id);
        return commentRepository.findById(id)
                .map(existingComment -> {
                    log.info("Comment found with ID: {}. Updating content...", id);

                    // Actualizar contenido
                    existingComment.setContent(commentRequest.getContent());
                    log.debug("Updated content to: {}", commentRequest.getContent());

                    //Actualizar la relación con el usuario
                    if (commentRequest.getUserId() != null) {
                        User user = userRepository.findById(commentRequest.getUserId())
                                .orElseThrow(() -> new RuntimeException("User not found"));
                        existingComment.setUser(user);
                    }

                    // Actualizar la relación con el post
                    if (commentRequest.getPostId() != null) {
                        Post post = postRepository.findById(commentRequest.getPostId())
                                .orElseThrow(() -> new RuntimeException("Post not found"));
                        existingComment.setPost(post);
                    }

                    // Guardar el comentario actualizado
                    Comment updatedComment = commentRepository.save(existingComment);
                    log.info("Comment with ID: {} updated successfully", id);

                    return updatedComment;
                })
                .map(commentMapper::toCommentResponse)
                .orElseThrow(() -> {
                    log.error("Comment with ID: {} not found", id);
                    return new RuntimeException("Comment with ID " + id + " not found");
                });
    }

    @Override
    public CommentResponse findById(Integer id) {
        log.info("Searching for Comment with ID: {}", id);

        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Comment with ID" + id + "not found"));
        log.debug("Found Comment: {}", comment);

        return commentMapper.toCommentResponse(comment);
    }

    @Override
    public List<CommentResponse> getCommentsByUserId(Integer userId) {
        log.info("Fetching comments for user ID: {}", userId);

        List<Comment> comments = commentRepository.findByUserId(userId);
        return comments.stream()
                .map(commentMapper::toCommentResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<CommentResponse> getCommentsByPostId(Integer postId) {
        log.info("Fetching comments for post ID: {}", postId);

        // 1. Verificar que el post exista (opcional pero recomendado)
        postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found with ID: " + postId));

        // 2. Obtener los comentarios del repositorio
        List<Comment> comments = commentRepository.findByPostId(postId);

        // 3. Convertir cada Comment en CommentResponse
        return comments.stream()
                .map(commentMapper::toCommentResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCommentById(Integer id) {

    }

}
