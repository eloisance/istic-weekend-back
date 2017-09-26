package com.eloisance.istic.controller;

import com.eloisance.istic.model.Activity;
import com.eloisance.istic.service.ActivityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityController {

    private ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    /**
     * Endpoint to GET activity from activity id
     * @param id activity id
     * @return activity
     */
    @RequestMapping(value="/activities/{id}", method= RequestMethod.GET)
    public Activity getActivity(@PathVariable("id") Long id) {
        return activityService.findOne(id);
    }


    /**
     * Endpoint to GET list all activities
     * @return list activities
     */
    @RequestMapping(value="/activities", method= RequestMethod.GET)
    public List<Activity> getActivities() {
        return activityService.findAll();
    }



}
