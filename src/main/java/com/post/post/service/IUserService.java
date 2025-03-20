package com.post.post.service;

import com.post.post.model.entity.User;
import com.post.post.model.entity.dto.UserRequest;
import com.post.post.model.entity.dto.UserResponse;

import java.util.List;

public interface IUserService {

    //
    List<UserResponse> getAllUsers();

    //
    UserResponse saveUser(UserRequest userRequest);

    //
    UserResponse findById(Integer id);

    //
    UserResponse updateId(Integer id, UserRequest userRequest);

    //
    void deleteUserById(Integer id);

    //
    List<UserResponse> getAllUsersByPosts(Integer id);

    //
    List<UserResponse> getAllUserByComments(Integer id);

    //
    List<UserResponse> getAllUserBylikes(Integer id);

}
