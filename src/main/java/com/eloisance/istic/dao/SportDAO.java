package com.eloisance.istic.dao;

import com.eloisance.istic.model.Sport;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class SportDAO implements DaoInterface<Sport> {

    private EntityManager manager;

    public SportDAO(EntityManager m) {
        manager = m;
    }

    public void create(Sport sport) {
        manager.persist(sport);
    }

    public Sport findById(Long id) {
        Query q = manager.createQuery("SELECT s FROM Sport s WHERE id = :id");
        q.setParameter("id", id);
        q.setMaxResults(1);
        return (Sport) q.getSingleResult();
    }

    public Sport findByName(String name) {
        Query q = manager.createQuery("SELECT s FROM Sport s WHERE name = :name");
        q.setParameter("name", name);
        q.setMaxResults(1);
        return (Sport) q.getSingleResult();
    }
}
