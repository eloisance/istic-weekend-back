package com.eloisance.istic.controller;

import com.eloisance.istic.model.Level;
import com.eloisance.istic.service.LevelService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LevelController {

    private LevelService levelService;

    public LevelController(LevelService levelService) {
        this.levelService = levelService;
    }

    /**
     * Endpoint to GET level from level id
     * @param id level id
     * @return level
     */
    @RequestMapping(value="/levels/{id}", method= RequestMethod.GET)
    public Level getLevel(@PathVariable("id") Long id) {
        return levelService.findOne(id);
    }


    /**
     * Endpoint to GET list all levels
     * @return list levels
     */
    @RequestMapping(value="/levels", method= RequestMethod.GET)
    public List<Level> getLevels() {
        return levelService.findAll();
    }



}
