package br.edu.fafic.ppi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.UUID;

public class GenericDAOImpl<T> implements GenericDAO<T> {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("exemplo_heranca");

    private EntityManager em = emf.createEntityManager();

    @Override
    public void saveOrUpdate(T entity) {
      try{
          em.getTransaction().begin();
          em.merge(entity);
          em.getTransaction().commit();
      }catch (Exception ex){
          em.getTransaction().rollback();
      }
    }

    @Override
    public T findById(Class<T> cl, UUID id) {
       return em.find(cl, id);
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public List<T> findAll(String namedQuery) {
        Query query = em.createNamedQuery(namedQuery);
        return query.getResultList();
    }
}
