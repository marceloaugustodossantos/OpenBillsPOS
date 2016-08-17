/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.service;

import com.pos.extracttransformload.entities.ReceitaComite;
import java.util.List;

/**
 *
 * @author kaiqu
 */
public interface ServiceReceitaComite {

    public boolean addReceitaComite(ReceitaComite rc);

    public boolean removeReceitaComite(ReceitaComite rc);

    public boolean refreshReceitaComite(ReceitaComite rc);

    public ReceitaComite searchReceitaComite(Class<ReceitaComite> entidade, Object key);

    public List<ReceitaComite> listarReceitaComite();
}
