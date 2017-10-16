package com.eloisance.istic.service;

import com.eloisance.istic.dao.ActivityDAO;
import com.eloisance.istic.model.Activity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ActivityService implements ServiceInterface<Activity> {

    private ActivityDAO activityDAO;

    public ActivityService (ActivityDAO activityDAO) {
        this.activityDAO = activityDAO;
    }

    public Activity findOne(Long id) {
        return activityDAO.findOne(id);
    }

    public List<Activity> findAll() {
        return activityDAO.findAll();
    }

    public void save(Activity activity) {
        this.activityDAO.save(activity);
    }
}
