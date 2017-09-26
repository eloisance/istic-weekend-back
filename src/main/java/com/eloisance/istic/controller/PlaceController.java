package com.eloisance.istic.controller;

import com.eloisance.istic.model.Place;
import com.eloisance.istic.service.PlaceService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaceController {

    private PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    /**
     * Endpoint to GET running from place id
     * @param id place id
     * @return running
     */
    @RequestMapping(value="/places/{id}", method= RequestMethod.GET)
    public Place getPlace(@PathVariable("id") Long id) {
        return placeService.findOne(id);
    }


    /**
     * Endpoint to GET list all places
     * @return list places
     */
    @RequestMapping(value="/places", method= RequestMethod.GET)
    public List<Place> getPlaces() {
        return placeService.findAll();
    }



}
