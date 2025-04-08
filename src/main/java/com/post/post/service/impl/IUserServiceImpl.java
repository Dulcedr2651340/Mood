package com.post.post.service.impl;

import com.post.post.mapper.UserMapper;
import com.post.post.model.entity.User;
import com.post.post.model.entity.dto.UserRequest;
import com.post.post.model.entity.dto.UserResponse;
import com.post.post.repository.UserRepository;
import com.post.post.service.IUserService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class IUserServiceImpl implements IUserService {

    private UserRepository userRepository;
    private UserMapper userMapper;
    @Override
    public List<UserResponse> getAllUsers() {
        log.info("Fetching all Users");
        return userRepository.findAll()
                .stream()
                .map(userMapper::toUserResponse)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponse saveUser(UserRequest userRequest) {
        log.info("Saving User: {}", userRequest);

        //Convertimos el DTO a una entidad (User)
        User user = userMapper.toEntity(userRequest);
        log.info("Mapped entity User", user);

        //Guardamos la entidad user
        User saveUser = userRepository.save(user);
        log.info("User saved successfully with ID", saveUser.getId());

        return userMapper.toUserResponse(saveUser);
    }

    @Override
    public UserResponse findById(Integer id) {
        return null;
    }

    @Override
    public UserResponse updateId(Integer id, UserRequest userRequest) {
        return null;
    }

    @Override
    public void deleteUserById(Integer id) {

    }

    @Override
    public List<UserResponse> getAllUsersByPosts(Integer id) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUserByComments(Integer id) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUserBylikes(Integer id) {
        return null;
    }
}
