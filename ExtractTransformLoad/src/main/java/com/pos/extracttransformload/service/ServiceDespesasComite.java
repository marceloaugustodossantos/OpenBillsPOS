/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.service;

import com.pos.extracttransformload.entities.DespesaComite;
import java.util.List;

/**
 *
 * @author kaiqu
 */
public interface ServiceDespesasComite {

    public boolean addDespesasComite(DespesaComite dc);

    public boolean removeDespesaComite(DespesaComite dc);

    public boolean refreshDespesaComite(DespesaComite dc);

    public DespesaComite searchDespesaComite(Class<DespesaComite> entidade, Object key);

    public List<DespesaComite> listarDespesaComite();
}
