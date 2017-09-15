package com.eloisance.istic.dao;

import com.eloisance.istic.model.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UserDAO implements DaoInterface<User> {

    private EntityManager manager;

    public UserDAO(EntityManager m) {
        manager = m;
    }

    public void create(User user) {
        manager.persist(user);
    }

    public User findById(Long id) {
        Query q = manager.createQuery("SELECT u FROM User u WHERE id = :id");
        q.setParameter("id", id);
        q.setMaxResults(1);
        return (User) q.getSingleResult();
    }

    public User findByEmail(Long email) {
        Query q = manager.createQuery("SELECT u FROM User u WHERE email = :email");
        q.setParameter("email", email);
        q.setMaxResults(1);
        return (User) q.getSingleResult();
    }

}
