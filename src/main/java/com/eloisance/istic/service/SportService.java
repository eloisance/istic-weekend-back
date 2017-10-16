package com.eloisance.istic.service;

import com.eloisance.istic.dao.SportDAO;
import com.eloisance.istic.model.Sport;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SportService implements ServiceInterface<Sport> {

    private SportDAO sportDAO;

    public SportService (SportDAO sportDAO) {
        this.sportDAO = sportDAO;
    }

    public Sport findOne(Long id) {
        return sportDAO.findOne(id);
    }

    public List<Sport> findAll() {
        return sportDAO.findAll();
    }

    public void save(Sport sport) {
        this.sportDAO.save(sport);
    }
}
