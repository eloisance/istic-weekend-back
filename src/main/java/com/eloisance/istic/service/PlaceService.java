package com.eloisance.istic.service;

import com.eloisance.istic.dao.PlaceDAO;
import com.eloisance.istic.model.Place;

import javax.persistence.EntityManager;

public class PlaceService implements ServiceInterface<Place> {

    private PlaceDAO placeDAO;

    public PlaceService(EntityManager manager) {
        placeDAO = new PlaceDAO(manager);
    }

    public void create(Place place) {
        placeDAO.create(place);
    }

    public Place findById(Long id) {
        return placeDAO.findById(id);
    }
}
