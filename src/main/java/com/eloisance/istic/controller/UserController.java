package com.eloisance.istic.controller;

import com.eloisance.istic.helper.EnumRole;
import com.eloisance.istic.model.User;
import com.eloisance.istic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    /**
     * Endpoint to GET user from user id
     * @param authentication access_token
     * @return User
     */
    @RequestMapping(value="/user", method= RequestMethod.GET)
    public User getUser(OAuth2Authentication authentication) {
        org.springframework.security.core.userdetails.User u = (org.springframework.security.core.userdetails.User) authentication.getPrincipal();
        return userService.findByEmail(u.getUsername());
    }

    /**
     * Endpoint to GET list all users
     * @return list users
     */
    @RequestMapping(value="/users", method= RequestMethod.GET)
    public List<User> getUsers() {
        return userService.findAll();
    }

    /**
     * Endpoint to POST and save new user
     * @param u user information
     */
    @RequestMapping(value="/user", method= RequestMethod.POST)
    public void registerUser(@RequestBody User u) {
        User user = new User();
        user.setFirstname(u.getFirstname());
        user.setLastname(u.getLastname());
        user.setEmail(u.getEmail());
        user.setPassword(passwordEncoder.encode(u.getPassword()));
        user.setLat(u.getLat());
        user.setLng(u.getLng());
        user.setEnabled(true);
        user.setRole(EnumRole.ROLE_USER);
        userService.save(user);
    }


}
