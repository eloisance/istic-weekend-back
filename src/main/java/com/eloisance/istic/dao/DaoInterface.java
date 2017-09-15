package com.eloisance.istic.dao;

public interface DaoInterface<T> {

    void create(T t);

    T findById(Long id);
}
