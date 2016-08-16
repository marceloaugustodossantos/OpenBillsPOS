/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Marcelo Augusto
 * @param <T>
 */
public interface DAO<T> {
    
    public boolean salvar(T obj);
    
    public boolean atualizar(T obj);
    
    public boolean excluir(T obj);
    
    public T buscar(Object chave, Class<T> entidade);
    
    public List<T> consultaLista(String consulta,Map<String,Object> parametros);
    
    public T consultaSimples(String consulta,Map<String,Object> parametros);
    
}
