package com.eloisance.istic.dao;

import com.eloisance.istic.model.Place;
import com.eloisance.istic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public interface PlaceDAO extends JpaRepository<Place, Long> {

}
