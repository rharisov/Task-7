package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;
import ru.itmentor.spring.boot_security.demo.model.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();

    User getUserById(Long id);

    void addUser(UserDTO user);

    void deleteUser(User user);

    void updateUser(User user);

    User findByName(String name);}
