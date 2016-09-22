/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.dao;

import java.util.List;
import java.util.Map;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Marcelo Augusto
 * @param <T>
 */
//@Remote
public interface DAO<T> {
    
    public boolean salvar(T obj);
    
    public boolean atualizar(T obj);
    
    public boolean excluir(T obj);
    
    public T buscar(Object chave, Class<T> entidade);
    
    public List<T> consultaLista(String consulta,Map<String,Object> parametros);
    
    public List<T> consultaLista(String consulta,Map<String,Object> parametros, int qtdeResults);
    
    public T consultaSimples(String consulta,Map<String,Object> parametros);
    
}
