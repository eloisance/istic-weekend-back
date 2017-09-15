package com.eloisance.istic.dao;

import com.eloisance.istic.model.Activity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ActivityDAO implements DaoInterface<Activity> {

    private EntityManager manager;

    public ActivityDAO(EntityManager m) {
        manager = m;
    }

    public void create(Activity activity) {
        manager.persist(activity);
    }

    public Activity findById(Long id) {
        Query q = manager.createQuery("SELECT a FROM Activity a WHERE id = :id");
        q.setParameter("id", id);
        q.setMaxResults(1);
        return (Activity) q.getSingleResult();
    }

}
