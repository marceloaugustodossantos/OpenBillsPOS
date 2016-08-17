/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.service;

import com.pos.extracttransformload.entities.DespesaCandidato;
import java.util.List;

/**
 *
 * @author kaiqu
 */
public interface ServiceDespesasCandidato {

    public boolean addDespesaCandidato(DespesaCandidato dc);

    public boolean removeDespesaCandidato(DespesaCandidato dc);

    public boolean refreshDespesaCandidato(DespesaCandidato dc);

    public DespesaCandidato searchDespesaCandidato(Class<DespesaCandidato> entidade, Object key);

    public List<DespesaCandidato> listarDespesaCandidato();
}
