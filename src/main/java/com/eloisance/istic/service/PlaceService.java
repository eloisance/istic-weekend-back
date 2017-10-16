package com.eloisance.istic.service;

import com.eloisance.istic.dao.PlaceDAO;
import com.eloisance.istic.model.Place;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlaceService implements ServiceInterface<Place> {

    private PlaceDAO placeDAO;

    public PlaceService (PlaceDAO placeDAO) {
        this.placeDAO = placeDAO;
    }

    public Place findOne(Long id) {
        return placeDAO.findOne(id);
    }

    public List<Place> findAll() {
        return placeDAO.findAll();
    }

    public void save(Place place) {
        this.placeDAO.save(place);
    }
}
