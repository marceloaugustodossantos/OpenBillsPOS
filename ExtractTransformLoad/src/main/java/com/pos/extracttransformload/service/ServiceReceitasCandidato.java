/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.service;

import com.pos.extracttransformload.entities.ReceitaCandidato;
import java.util.List;

/**
 *
 * @author kaiqu
 */
public interface ServiceReceitasCandidato {

    public boolean addReceitaCandidato(ReceitaCandidato rc);

    public boolean removeReceitaCandidato(ReceitaCandidato rc);

    public boolean refreshReceitaCandidato(ReceitaCandidato rc);

    public ReceitaCandidato searchReceitaCandidato(Class<ReceitaCandidato> entidade, Object key);

    public List<ReceitaCandidato> listarReceitaCandidato();
}
