/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.dao;

import com.pos.extracttransformload.entities.DespesaComite;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author kaiqu
 */
//@Stateless
public class DespesasComiteDao {

//    @PersistenceContext
//    EntityManager em;
//
//    public boolean addDespesaComite(DespesaComite dc) {
//        em.persist(dc);
//        return true;
//    }
//
//    public boolean removeDespesaComite(DespesaComite dc) {
//        em.remove(em.merge(dc));
//        return true;
//    }
//
//    public boolean refreshDespesaComite(DespesaComite dc) {
//        em.merge(dc);
//        return true;
//    }
//
//    public DespesaComite searchDespesaComite(Class<DespesaComite> entidade, Object key) {
//        return em.find(entidade, key);
//    }
//
//    public List<DespesaComite> listarDespesaComite() {
//        Query query = em.createQuery("SELECT dc FROM DespesaComite dc ORDER BY dc.dsTitulo", DespesaComite.class);
//        List<DespesaComite> despesaComites = query.getResultList();
//        if (despesaComites.size() > 0) {
//            return despesaComites;
//        }
//        return null;
//    }
}
