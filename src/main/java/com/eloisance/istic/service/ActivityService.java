package com.eloisance.istic.service;

import com.eloisance.istic.dao.ActivityDAO;
import com.eloisance.istic.dao.PlaceDAO;
import com.eloisance.istic.model.Activity;
import com.eloisance.istic.model.Place;

import javax.persistence.EntityManager;

public class ActivityService implements ServiceInterface<Activity> {

    private ActivityDAO activityDAO;

    public ActivityService(EntityManager manager) {
        activityDAO = new ActivityDAO(manager);
    }

    public void create(Activity activity) {
        activityDAO.create(activity);
    }

    public Activity findById(Long id) {
        return activityDAO.findById(id);
    }
}
