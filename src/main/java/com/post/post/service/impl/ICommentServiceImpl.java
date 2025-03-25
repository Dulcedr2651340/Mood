package com.post.post.service.impl;

import com.post.post.mapper.CommentMapper;
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
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class ICommentServiceImpl implements ICommentService{

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
        return null;
    }

    @Override
    public CommentResponse updateComment(Integer id, CommentRequest commentRequest) {
        return null;
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
