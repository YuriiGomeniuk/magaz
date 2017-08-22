package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    UserDAO userDAO;
    public void save(String name) {
        User user = new User();
        userDAO.save(user);
    }

    public void save(User user) {
    userDAO.save(user);
    }

    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }
}
