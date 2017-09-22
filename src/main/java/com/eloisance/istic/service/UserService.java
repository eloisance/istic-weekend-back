package com.eloisance.istic.service;

import com.eloisance.istic.dao.UserDAO;
import com.eloisance.istic.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class UserService implements ServiceInterface<User> {

    private static final Logger logger = Logger.getLogger(UserService.class.getName());

    private UserDAO userDAO;

    public UserService (UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public User findOne(Long id) {
        return userDAO.findOne(id);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }
}
