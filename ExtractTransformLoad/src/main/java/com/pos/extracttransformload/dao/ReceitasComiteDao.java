/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.dao;

import com.pos.extracttransformload.entities.ReceitaComite;
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
public class ReceitasComiteDao {

//    @PersistenceContext
//    EntityManager em;
//
//    public boolean addReceitaComite(ReceitaComite rc) {
//        em.persist(rc);
//        return true;
//    }
//
//    public boolean removeReceitaComite(ReceitaComite rc) {
//        em.remove(em.merge(rc));
//        return true;
//    }
//
//    public boolean refreshReceitaComite(ReceitaComite rc) {
//        em.merge(rc);
//        return true;
//    }
//
//    public ReceitaComite searchReceitaComite(Class<ReceitaComite> entidade, Object key) {
//        return em.find(entidade, key);
//    }
//
//    public List<ReceitaComite> listarReceitaComite() {
//        Query query = em.createQuery("SELECT rc FROM DespesaComite rc ORDER BY rc.dsTitulo", ReceitaComite.class);
//        List<ReceitaComite> receitaComites = query.getResultList();
//        if (receitaComites.size() > 0) {
//            return receitaComites;
//        }
//        return null;
//    }
}
