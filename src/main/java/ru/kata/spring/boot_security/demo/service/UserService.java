package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.Set;

public interface UserService {
    public Set<User> allUsers();

    public User getUserById(Long id);

    public User findUserByUsername(String name);

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(Long id);


}
