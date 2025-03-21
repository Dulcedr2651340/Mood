package com.post.post.service;

import com.post.post.model.entity.User;
import com.post.post.model.entity.dto.UserRequest;
import com.post.post.model.entity.dto.UserResponse;

import java.util.List;

public interface IUserService {

    // Listar todos los usuarios existentes
    List<UserResponse> getAllUsers();

    // Guardar un nuevo usuario
    UserResponse saveUser(UserRequest userRequest);

    // Buscar un usuario por su ID
    UserResponse findById(Integer id);

    // Actualizar un usuario existente usando su ID
    UserResponse updateId(Integer id, UserRequest userRequest);

    // Eliminar un usuario de manera lógica usando su ID
    void deleteUserById(Integer id);

    // Obtener usuarios asociados a un post específico usando el ID del post
    List<UserResponse> getAllUsersByPosts(Integer id);

    // Obtener usuarios que realizaron comentarios específicos usando el ID del comentario
    List<UserResponse> getAllUserByComments(Integer id);

    // Obtener usuarios que dieron like a un post específico usando el ID del like
    List<UserResponse> getAllUserBylikes(Integer id);

}
