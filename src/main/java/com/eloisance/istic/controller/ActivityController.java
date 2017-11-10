package com.eloisance.istic.controller;

import com.eloisance.istic.model.Activity;
import com.eloisance.istic.model.Level;
import com.eloisance.istic.model.User;
import com.eloisance.istic.service.ActivityService;
import com.eloisance.istic.service.LevelService;
import com.eloisance.istic.service.UserService;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ActivityController {

    private ActivityService activityService;
    private LevelService levelService;
    private UserService userService;

    public ActivityController(ActivityService activityService, LevelService levelService, UserService userService) {
        this.activityService = activityService;
        this.userService = userService;
        this.levelService = levelService;
    }

    /**
     * Endpoint to GET activity from activity id
     * @param id activity id
     * @return activity
     */
    @RequestMapping(value="/activities/{id}", method=RequestMethod.GET)
    public Activity getActivity(@PathVariable("id") Long id) {
        return activityService.findOne(id);
    }


    /**
     * Endpoint to GET list all activities
     * @return list activities
     */
    @RequestMapping(value="/activities", method=RequestMethod.GET)
    public List<Activity> getActivities() {
        return activityService.findAll();
    }


    @RequestMapping(value="/activity", method=RequestMethod.POST)
    public void saveActivity(OAuth2Authentication authentication, @RequestBody Level l) {
        org.springframework.security.core.userdetails.User u = (org.springframework.security.core.userdetails.User) authentication.getPrincipal();
        User user = userService.findByEmail(u.getUsername());
        Level level = levelService.findOne(l.getId());
        Activity a = new Activity(user, level);
        activityService.save(a);
    }

}
