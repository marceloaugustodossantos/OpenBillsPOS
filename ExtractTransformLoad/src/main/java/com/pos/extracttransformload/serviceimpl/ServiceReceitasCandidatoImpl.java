/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.serviceimpl;

import com.pos.extracttransformload.dao.ReceitasCandidatoDao;
import com.pos.extracttransformload.entities.ReceitaCandidato;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceReceitasCandidatoImpl {

    @EJB
    private ReceitasCandidatoDao receitasCandidatoDao;

    public boolean addReceitaCandidato(ReceitaCandidato rc) {
        return receitasCandidatoDao.addReceitaCandidato(rc);
    }

    public boolean removeReceitaCandidato(ReceitaCandidato rc) {
        return receitasCandidatoDao.removeReceitaCandidato(rc);
    }

    public boolean refreshReceitaCandidato(ReceitaCandidato rc) {
        return receitasCandidatoDao.refreshReceitaCandidato(rc);
    }

    public ReceitaCandidato searchReceitaCandidato(Class<ReceitaCandidato> entidade, Object key) {
        return receitasCandidatoDao.searchReceitaCandidato(entidade, key);

    }

    public List<ReceitaCandidato> listarReceitaCandidato() {
        return receitasCandidatoDao.listarReceitaCandidato();
    }
}
