/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.webServices;

import com.pos.extracttransformload.dao.DAOJPA;
import com.pos.extracttransformload.entities.DespesaComite;
import com.pos.extracttransformload.entities.ReceitaComite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author marcelo
 */
@WebService
public class ComiteService {

    @EJB
    private DAOJPA<DespesaComite> daoDespesaComite;
    @EJB
    private DAOJPA<ReceitaComite> daoReceitaComite;
    
    @WebMethod(operationName = "obterComiteComMaioresReceitas")
    public List<ReceitaComite> obterComiteComMaioresReceitas(
            @WebParam(name = "ano") Integer ano,
            @WebParam(name = "estado") String estado,
            @WebParam(name = "qtdeResul")Integer qtdeResult) {
        
        if (qtdeResult == null) {
            qtdeResult = 100;
        }
        if (ano != null && estado != null) {
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("ano", ano);
            parametros.put("estado", estado);
            return daoReceitaComite.consultaLista(
                    "buscar.comitescommaioresreceitas.porestadoeano",
                    parametros,
                    qtdeResult);
        } else {
            if (ano != null) {
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("ano", ano);
                return daoReceitaComite.consultaLista(
                        "buscar.comitescommaioresreceitas.porano",
                        parametros,
                        qtdeResult);
            }else{
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("estado", estado);
                return daoReceitaComite.consultaLista(
                        "buscar.comitescommaioresreceitas.porestado",
                        parametros,
                        qtdeResult);
            }
        }
    }
    
    @WebMethod(operationName = "obterComiteComMaioresDispesas")
    public List<DespesaComite> obterComiteComMaioresDespesas(
            @WebParam(name = "ano") Integer ano,
            @WebParam(name = "estado") String estado,
            @WebParam(name = "qtdeResul")Integer qtdeResult) {
        
        if (qtdeResult == null) {
            qtdeResult = 100;
        }
        if (ano != null && estado != null) {
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("ano", ano);
            parametros.put("estado", estado);
            return daoDespesaComite.consultaLista(
                    "buscar.comitescommaioresdespesas.porestadoeano",
                    parametros,
                    qtdeResult);
        } else {
            if (ano != null) {
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("ano", ano);
                return daoDespesaComite.consultaLista(
                        "buscar.comitescommaioresdespesas.porano",
                        parametros,
                        qtdeResult);
            }else{
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("estado", estado);
                return daoDespesaComite.consultaLista(
                        "buscar.comitescommaioresdespesas.porestado",
                        parametros,
                        qtdeResult);
            }
        }
    }
    
    
    
    
}
