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
import com.pos.extracttransformload.entities.Despesacandidato2002;
import com.pos.extracttransformload.entities.Despesacandidato2004;
import com.pos.extracttransformload.entities.Despesacomite2002;
import com.pos.extracttransformload.entities.Despesacomite2004;
import com.pos.extracttransformload.entities.ReceitaCandidato;
import com.pos.extracttransformload.entities.Receitacandidato2002;
import com.pos.extracttransformload.entities.Receitacandidato2004;
import com.pos.extracttransformload.entities.Receitacomite2002;
import com.pos.extracttransformload.entities.Receitacomite2004;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.pos.extracttransformload.objectValues.DadosCandidato;
import com.pos.extracttransformload.objectValues.ListCandidatos;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author marcelo
 */
@WebService
public class CandidatoService {

    private DAO<Despesacandidato2002> daoDespesaCandidato2002 = new DAOJPA<>();

    private DAO<Receitacandidato2002> daoReceitaCandidato2002 = new DAOJPA<>();

    private DAO<Receitacandidato2004> daoReceitaCandidato2004 = new DAOJPA<>();

    private DAO<Despesacandidato2004> daoDespesaCandidato2004 = new DAOJPA<>();

    @WebMethod(operationName = "obterDadosDeCandidato")
    public DadosCandidato obterDadosDeCandidato(@WebParam(name = "nome") String nome) {

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("nome", nome);
        List<Despesacandidato2002> despesas2002 = daoDespesaCandidato2002.consultaLista("buscar.despesacandidato2002.pornome", parametros);
        List<Receitacandidato2002> receitas2002 = daoReceitaCandidato2002.consultaLista("buscar.receitacandidato2002.pornome", parametros);
        List<Despesacandidato2004> despesas2004 = daoDespesaCandidato2004.consultaLista("buscar.despesacandidato2004.pornome", parametros);
        List<Receitacandidato2004> receitas2004 = daoReceitaCandidato2004.consultaLista("buscar.receitacandidato2004.pornome", parametros);

        double valorTotalDespesas = 0;
        double valorTotalReceitas = 0;
        for (Receitacandidato2004 receitacandidato2004 : receitas2004) {
            valorTotalReceitas += receitacandidato2004.getVr_receita();
        }
        for (Despesacandidato2004 d : despesas2004) {
            valorTotalDespesas += d.getVr_despesa();
        }
        for (Receitacandidato2002 r : receitas2002) {
            valorTotalReceitas += r.getVr_receita();
        }
        for (Despesacandidato2002 d : despesas2002) {
            valorTotalDespesas += d.getVr_despesa();
        }
        Receitacandidato2004 r = receitas2004.get(0);
        DadosCandidato candidato = new DadosCandidato(r.getNo_cand(), r.getDs_cargo(), r.getNr_cand(),
                r.getNo_ue(), r.getSg_ue(), r.getSg_part(), valorTotalReceitas, valorTotalDespesas, "2004");
        return candidato;
    }

//    @WebMethod(operationName = "obterDadosDeCandidato")
//    public List<DadosCandidato> listarCandidatosPorNome(@WebParam(name = "nome") String nome) {
//
//        Map<String, Object> parametros = new HashMap<>();
//        parametros.put("nome", nome);
//        List<Despesacandidato2002> despesas2002 = daoDespesaCandidato2002.consultaLista("buscar.despesacandidato2002.pornome", parametros);
//        List<Receitacandidato2002> receitas2002 = daoReceitaCandidato2002.consultaLista("buscar.receitacandidato2002.pornome", parametros);
//        List<Despesacandidato2004> despesas2004 = daoDespesaCandidato2004.consultaLista("buscar.despesacandidato2004.pornome", parametros);
//        List<Receitacandidato2004> receitas2004 = daoReceitaCandidato2004.consultaLista("buscar.receitacandidato2004.pornome", parametros);
//
//        List<DadosCandidato> candidatos = new ArrayList<>();
//
//        for (Receitacandidato2004 r : receitas2004) {
//            DadosCandidato candidato = new DadosCandidato(r.getNo_cand(), r.getDs_cargo(), r.getNr_cand(),
//                    r.getNo_ue(), r.getSg_ue(), r.getSg_part(), 0, 0, "2004");
//            candidatos.add(candidato);
//        }
//        for (Despesacandidato2004 d : despesas2004) {
//            DadosCandidato candidato = new DadosCandidato(d.getNo_cand(), d.getDs_cargo(), d.getNr_cand(),
//                    d.getNo_ue(), d.getSg_ue(), d.getSg_part(), 0, 0, "2004");
//            candidatos.add(candidato);
//        }
//        for (Receitacandidato2002 r : receitas2002) {
//            DadosCandidato candidato = new DadosCandidato(r.getNo_cand(), r.getDs_cargo(), r.getNr_cand(),
//                    r.getSg_uf(), r.getSg_uf(), r.getSg_part(), 0, 0, "2002");
//            candidatos.add(candidato);
//        }
//        for (Despesacandidato2002 d : despesas2002) {
//            DadosCandidato candidato = new DadosCandidato(d.getNo_cand(), d.getDs_cargo(), d.getNr_cand(),
//                    d.getSg_uf(), d.getSg_uf(), d.getSg_part(), 0, 0, "2002");
//            candidatos.add(candidato);
//        }
//        return candidatos;
//    }

}
