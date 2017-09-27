package com.eloisance.istic.controller;

import com.eloisance.istic.model.Sport;
import com.eloisance.istic.service.SportService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SportController {

    private SportService sportService;

    public SportController(SportService sportService) {
        this.sportService = sportService;
    }

    /**
     * Endpoint to GET sport from place id
     * @param id sport id
     * @return sport
     */
    @RequestMapping(value="/sports/{id}", method= RequestMethod.GET)
    public Sport getSport(@PathVariable("id") Long id) {
        return sportService.findOne(id);
    }


    /**
     * Endpoint to GET list all sports
     * @return list sports
     */
    @RequestMapping(value="/sports", method= RequestMethod.GET)
    public List<Sport> getSports() {
        return sportService.findAll();
    }



}
