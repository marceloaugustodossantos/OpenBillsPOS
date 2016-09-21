package com.pos.extracttransformload.dao;

import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Marcelo Augusto
 * @param <T>
 */
//@Stateless
public class DAOJPA<T> implements DAO<T> {
    
    
    private EntityManager entityManager;


    
    public DAOJPA() {
        this("com.pos_ExtractTransformLoad_war_1.0-SNAPSHOTPU");
    }

    public DAOJPA(String unidadePersistencia) {
        entityManager = Persistence.createEntityManagerFactory(unidadePersistencia).createEntityManager();
    }

    @Override
    public boolean salvar(T obj) {
        EntityTransaction transacao = entityManager.getTransaction();

        try {
            transacao.begin();
            entityManager.persist(obj);
            transacao.commit();
            return true;
        } catch (Exception ex) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return false;
        }

    }

    @Override
    public boolean atualizar(T obj) {
        EntityTransaction transacao = entityManager.getTransaction();
//
        try {
            transacao.begin();
            entityManager.merge(obj);
            transacao.commit();
            return true;
        } catch (Exception ex) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return false;
        }
            }

    @Override
    public boolean excluir(T obj) {
        EntityTransaction transacao = entityManager.getTransaction();

        try {
            transacao.begin();
            entityManager.remove(obj);
            transacao.commit();
            return true;
        } catch (Exception ex) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return false;
        }
            }

    @Override
    public T buscar(Object chave, Class<T> entidade) {
        return entityManager.find(entidade, chave);
    }

    @Override
    public List<T> consultaLista(String consulta, Map<String, Object> parametros) {
        Query query = entityManager.createNamedQuery(consulta);
        if (parametros != null && !parametros.isEmpty()) {
            for (String parametro : parametros.keySet()) {
                query.setParameter(parametro, parametros.get(parametro));
            }
        }
        return query.getResultList();
    }
    @Override
    public List<T> consultaLista(String consulta, Map<String, Object> parametros, int qtdResults) {
        Query query = entityManager.createNamedQuery(consulta).setMaxResults(qtdResults);
        if (parametros != null && !parametros.isEmpty()) {
            for (String parametro : parametros.keySet()) {
                query.setParameter(parametro, parametros.get(parametro));
            }
        }
        return query.getResultList();
    }

    @Override
    public T consultaSimples(String consulta, Map<String, Object> parametros) {
        Query query = entityManager.createNamedQuery(consulta);
        if (parametros != null && !parametros.isEmpty()) {
            for (String parametro : parametros.keySet()) {
                query.setParameter(parametro, parametros.get(parametro));
            }
        }
        return (T) query.getSingleResult();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    

}
