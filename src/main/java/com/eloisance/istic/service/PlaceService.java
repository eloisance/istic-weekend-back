package com.eloisance.istic.service;

import com.eloisance.istic.model.Place;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlaceService implements ServiceInterface<Place> {

    public Place findOne(Long id) {
        return null;
    }

    public List<Place> findAll() {
        return null;
    }
}
