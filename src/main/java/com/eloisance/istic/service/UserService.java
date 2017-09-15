package com.eloisance.istic.service;

import com.eloisance.istic.dao.UserDAO;
import com.eloisance.istic.model.User;

import javax.persistence.EntityManager;

public class UserService implements ServiceInterface<User> {

    private UserDAO userDAO;

    public UserService(EntityManager manager) {
        userDAO = new UserDAO(manager);
    }

    public void create(User user) {
        userDAO.create(user);
    }

    public User findById(Long id) {
        return userDAO.findById(id);
    }
}
