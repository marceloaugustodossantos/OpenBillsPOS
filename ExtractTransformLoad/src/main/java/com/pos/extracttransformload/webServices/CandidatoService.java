/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.webServices;

import com.pos.extracttransformload.dao.DAO;
import javax.jws.WebService;
import com.pos.extracttransformload.entities.DespesaCandidato;
import com.pos.extracttransformload.entities.ReceitaCandidato;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author marcelo
 */
@WebService
@Stateless
public class CandidatoService {

    @EJB
    private DAO<ReceitaCandidato> daoReceitaCandidato;
    @EJB
    private DAO<DespesaCandidato> daoDespesaCandidato;

    @WebMethod(operationName = "obterCandidatosComMaioresReceitas")
    public List<ReceitaCandidato> obterCandidatosComMaioresReceitas(
            @WebParam(name = "ano") Integer ano,
            @WebParam(name = "estado") String estado,
            @WebParam(name = "qtdeResul") Integer qtdeResult) {
//        if (qtdeResult == null) {
//            qtdeResult = 100;
//        }
//        if (ano != null && estado != null) {
//            Map<String, Object> parametros = new HashMap<>();
//            parametros.put("ano", ano);
//            parametros.put("estado", estado);
//            return daoReceitaCandidato.consultaLista(
//                    "buscar.candidatoscommaioresreceitas.porestadoeano",
//                    parametros,
//                    qtdeResult);
//        } else {
//            if (ano != null) {
//                Map<String, Object> parametros = new HashMap<>();
//                parametros.put("ano", ano);
//                return daoReceitaCandidato.consultaLista(
//                        "buscar.candidatoscommaioresreceitas.porano",
//                        parametros,
//                        qtdeResult);
//            }else{
//                Map<String, Object> parametros = new HashMap<>();
//                parametros.put("estado", estado);
//                return daoReceitaCandidato.consultaLista(
//                        "buscar.candidatoscommaioresreceitas.porestado",
//                        parametros,
//                        qtdeResult);
//            }
//        }
        List<ReceitaCandidato> receitas = new ArrayList<>();
        estado = "teste";
        receitas.add(new ReceitaCandidato(estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, 0, estado, estado, 
                estado, estado, estado, estado, estado, estado, estado, estado, estado, estado));
        estado = "teste 2";
        receitas.add(new ReceitaCandidato(estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, estado, 0, estado, estado, 
                estado, estado, estado, estado, estado, estado, estado, estado, estado, estado));

        return receitas;
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
        } else if (ano != null) {
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("ano", ano);
            return daoDespesaCandidato.consultaLista(
                    "buscar.candidatoscommaioresdespesas.porano",
                    parametros,
                    qtdeResult);
        } else {
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("estado", estado);
            return daoDespesaCandidato.consultaLista(
                    "buscar.candidatoscommaioresdespesas.porestado",
                    parametros,
                    qtdeResult);
        }
    }

}
