package com.eloisance.istic.service;

import com.eloisance.istic.model.Activity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ActivityService implements ServiceInterface<Activity> {

    public Activity findOne(Long id) {
        return null;
    }

    public List<Activity> findAll() {
        return null;
    }
}
