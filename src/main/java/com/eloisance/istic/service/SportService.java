package com.eloisance.istic.service;

import com.eloisance.istic.dao.SportDAO;
import com.eloisance.istic.model.Sport;

import javax.persistence.EntityManager;

public class SportService implements ServiceInterface<Sport> {

    private SportDAO sportDAO;

    public SportService(EntityManager manager) {
        sportDAO = new SportDAO(manager);
    }

    public void create(Sport sport) {
        sportDAO.create(sport);
    }

    public Sport findById(Long id) {
        return sportDAO.findById(id);
    }

    /** More methods **/

    public Sport findByName(String name) {
        return sportDAO.findByName(name);
    }

}
