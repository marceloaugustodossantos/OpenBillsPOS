/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.dao;

import com.pos.extracttransformload.entities.ReceitaCandidato;
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
public class ReceitasCandidatoDao {
//
//    @PersistenceContext
//    EntityManager em;
//
//    public boolean addReceitaCandidato(ReceitaCandidato rc) {
//        em.persist(rc);
//        return true;
//    }
//
//    public boolean removeReceitaCandidato(ReceitaCandidato rc) {
//        em.remove(em.merge(rc));
//        return true;
//    }
//
//    public boolean refreshReceitaCandidato(ReceitaCandidato rc) {
//        em.merge(rc);
//        return true;
//    }
//
//    public ReceitaCandidato searchReceitaCandidato(Class<ReceitaCandidato> entidade, Object key) {
//        return em.find(entidade, key);
//    }
//
//    public List<ReceitaCandidato> listarReceitaCandidato() {
//        Query query = em.createQuery("SELECT rc FROM ReceitaCandidato rc ORDER BY rc.cdUfDoador", ReceitaCandidato.class);
//        List<ReceitaCandidato> receitaCandidatos = query.getResultList();
//        if (receitaCandidatos.size() > 0) {
//            return receitaCandidatos;
//        }
//        return null;
//    }
}
