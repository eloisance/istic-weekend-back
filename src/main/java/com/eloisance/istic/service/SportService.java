package com.eloisance.istic.service;

import com.eloisance.istic.model.Sport;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SportService implements ServiceInterface<Sport> {

    public Sport findOne(Long id) {
        return null;
    }

    public List<Sport> findAll() {
        return null;
    }
}
