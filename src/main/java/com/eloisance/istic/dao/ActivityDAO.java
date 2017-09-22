package com.eloisance.istic.dao;

import com.eloisance.istic.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityDAO extends JpaRepository<Activity, Long> {

}
