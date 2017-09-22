package com.eloisance.istic.dao;

import com.eloisance.istic.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportDAO extends JpaRepository<Sport, Long> {

}
