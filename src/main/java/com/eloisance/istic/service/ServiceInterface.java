package com.eloisance.istic.service;

public interface ServiceInterface<T> {

    void create(T t);

    T findById(Long id);
}
