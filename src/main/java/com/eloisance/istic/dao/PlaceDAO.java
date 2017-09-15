package com.eloisance.istic.dao;

import com.eloisance.istic.model.Place;
import com.eloisance.istic.model.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PlaceDAO implements DaoInterface<Place> {

    private EntityManager manager;

    public PlaceDAO(EntityManager m) {
        manager = m;
    }

    public void create(Place place) {
        manager.persist(place);
    }

    public Place findById(Long id) {
        Query q = manager.createQuery("SELECT p FROM Place p WHERE id = :id");
        q.setParameter("id", id);
        q.setMaxResults(1);
        return (Place) q.getSingleResult();
    }

}
