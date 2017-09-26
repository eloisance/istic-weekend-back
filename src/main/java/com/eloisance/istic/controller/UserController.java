package com.eloisance.istic.controller;

import com.eloisance.istic.model.User;
import com.eloisance.istic.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    /**
     * Endpoint to GET user from user id
     * @param id user id
     * @return user
     */
    @RequestMapping(value="/users/{id}", method= RequestMethod.GET)
    public User getUser(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }


    /**
     * Endpoint to GET list all users
     * @return list users
     */
    @RequestMapping(value="/users", method= RequestMethod.GET)
    public List<User> getUsers() {
        return userService.findAll();
    }



}
