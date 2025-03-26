package com.post.post.service.impl;

import com.post.post.mapper.CommentMapper;
import com.post.post.model.entity.Comment;
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

        return commentRepository.findById(id);

    }

    @Override
    public CommentResponse findById(Integer id) {
        return null;
    }

    @Override
    public List<CommentResponse> getCommentsByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<CommentResponse> getCommentsByPostId(Integer postId) {
        return null;
    }

    @Override
    public void deleteCommentById(Integer id) {

    }


    //Haciendo la lista donde muestra todos los COMENTARIOS


}
