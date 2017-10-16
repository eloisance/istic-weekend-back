package com.eloisance.istic.service;

import java.util.List;

public interface ServiceInterface<T> {

    T findOne(Long id);

    List<T> findAll();

    void save(T t);
}
