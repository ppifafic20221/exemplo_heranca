package br.edu.fafic.ppi.dao;

import java.util.List;
import java.util.UUID;

public interface GenericDAO <T> {

    void saveOrUpdate(T entity);
    T findById(Class<T> cl, UUID id);
    void delete(T entity);
    List<T> findAll(String namedQuery);
}
