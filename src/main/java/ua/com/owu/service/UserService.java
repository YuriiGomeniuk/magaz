package ua.com.owu.service;

import ua.com.owu.entity.User;

import java.util.List;

public interface UserService {
    void save(String name);
    void save(User user);
    User findOne(int id);
    List<User> findAll();

}
