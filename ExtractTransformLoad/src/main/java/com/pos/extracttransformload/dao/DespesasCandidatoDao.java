/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.dao;

import com.pos.extracttransformload.entities.DespesaCandidato;
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
public class DespesasCandidatoDao {

//    @PersistenceContext
//    EntityManager em;
//
//    public boolean addDespesaCandidato(DespesaCandidato dc) {
//        em.persist(dc);
//        return true;
//    }
//
//    public boolean removeDespesaCandidato(DespesaCandidato dc) {
//        em.remove(em.merge(dc));
//        return true;
//    }
//
//    public boolean refreshDespesaCandidato(DespesaCandidato dc) {
//        em.merge(dc);
//        return true;
//    }
//
//    public DespesaCandidato searchDespesaCandidato(Class<DespesaCandidato> entidade, Object key) {
//        return em.find(entidade, key);
//    }
//
//    public List<DespesaCandidato> listarDespesaCandidato() {
//        Query query = em.createQuery("SELECT dc FROM DespesaCandidato dc ORDER BY dc.dsTitulo", DespesaCandidato.class);
//        List<DespesaCandidato> despesaCandidatos = query.getResultList();
//        if (despesaCandidatos.size() > 0) {
//            return despesaCandidatos;
//        }
//        return null;
//    }
}
