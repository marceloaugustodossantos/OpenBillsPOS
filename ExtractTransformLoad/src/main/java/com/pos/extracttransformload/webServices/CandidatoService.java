/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.webServices;

import com.pos.extracttransformload.dao.DAO;
import com.pos.extracttransformload.dao.DAOJPA;
import javax.jws.WebService;
import com.pos.extracttransformload.entities.DespesaCandidato;
import com.pos.extracttransformload.entities.DespesaComite;
import com.pos.extracttransformload.entities.ReceitaCandidato;
import com.pos.extracttransformload.entities.ReceitaComite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author marcelo
 */
@WebService
public class CandidatoService {

    @EJB
    private DAOJPA<ReceitaCandidato> daoReceitaCandidato;
    @EJB
    private DAOJPA<DespesaCandidato> daoDespesaCandidato;
    

    @WebMethod(operationName = "obterCandidatosComMaioresReceitas")
    public List<ReceitaCandidato> obterCandidatosComMaioresReceitas(
            @WebParam(name = "ano") Integer ano,
            @WebParam(name = "estado") String estado,
            @WebParam(name = "qtdeResul") Integer qtdeResult) {
        if (qtdeResult == null) {
            qtdeResult = 100;
        }
        if (ano != null && estado != null) {
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("ano", ano);
            parametros.put("estado", estado);
            return daoReceitaCandidato.consultaLista(
                    "buscar.candidatoscommaioresreceitas.porestadoeano",
                    parametros,
                    qtdeResult);
        } else {
            if (ano != null) {
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("ano", ano);
                return daoReceitaCandidato.consultaLista(
                        "buscar.candidatoscommaioresreceitas.porano",
                        parametros,
                        qtdeResult);
            }else{
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("estado", estado);
                return daoReceitaCandidato.consultaLista(
                        "buscar.candidatoscommaioresreceitas.porestado",
                        parametros,
                        qtdeResult);
            }
        }
    }

    @WebMethod(operationName = "obterCandidatosComMaioresDespesas")
    public List<DespesaCandidato> obterCandidatosComMaioresDespesas(
            @WebParam(name = "ano") Integer ano,
            @WebParam(name = "estado") String estado,
            @WebParam(name = "qtdeResul") Integer qtdeResult) {

        if (qtdeResult == null) {
            qtdeResult = 100;
        }
        if (ano != null && estado != null) {
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("ano", ano);
            parametros.put("estado", estado);
            return daoDespesaCandidato.consultaLista(
                    "buscar.candidatoscommaioresdespesas.porestadoeano",
                    parametros,
                    qtdeResult);
        } else {
            if (ano != null) {
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("ano", ano);
                return daoDespesaCandidato.consultaLista(
                        "buscar.candidatoscommaioresdespesas.porano",
                        parametros,
                        qtdeResult);
            }else{
                Map<String, Object> parametros = new HashMap<>();
                parametros.put("estado", estado);
                return daoDespesaCandidato.consultaLista(
                        "buscar.candidatoscommaioresdespesas.porestado",
                        parametros,
                        qtdeResult);
            }
        }
    }

}
