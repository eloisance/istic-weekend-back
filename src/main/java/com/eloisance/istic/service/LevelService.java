package com.eloisance.istic.service;

import com.eloisance.istic.dao.LevelDAO;
import com.eloisance.istic.dao.SportDAO;
import com.eloisance.istic.model.Level;
import com.eloisance.istic.model.Sport;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LevelService implements ServiceInterface<Level> {

    private LevelDAO levelDAO;

    public LevelService(LevelDAO levelDAO) {
        this.levelDAO = levelDAO;
    }

    public Level findOne(Long id) {
        return levelDAO.findOne(id);
    }

    public List<Level> findAll() {
        return levelDAO.findAll();
    }
}
