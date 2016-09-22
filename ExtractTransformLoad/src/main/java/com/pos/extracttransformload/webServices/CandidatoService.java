/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.webServices;

import com.pos.extracttransformload.dao.DAO;
import com.pos.extracttransformload.dao.DAOJPA;
import javax.jws.WebService;
import com.pos.extracttransformload.entities.Despesacandidato2002;
import com.pos.extracttransformload.entities.Despesacandidato2004;
import com.pos.extracttransformload.entities.Receitacandidato2002;
import com.pos.extracttransformload.entities.Receitacandidato2004;
import com.pos.extracttransformload.exceptions.CandidatoNaoEncontradoExcetpion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.pos.extracttransformload.objectValues.DadosCompletosCandidato;
import com.pos.extracttransformload.objectValues.DadosResumidosCandidato;
import com.pos.extracttransformload.objectValues.DespesaCandidato;
import com.pos.extracttransformload.objectValues.ReceitaCandidato;
import javax.jws.WebResult;

/**
 *
 * @author marcelo
 */
@WebService
public class CandidatoService {

    private DAO<Despesacandidato2002> daoDespesaCandidato2002;

    private DAO<Receitacandidato2002> daoReceitaCandidato2002;

    private DAO<Receitacandidato2004> daoReceitaCandidato2004;

    private DAO<Despesacandidato2004> daoDespesaCandidato2004;

    public CandidatoService() {
        daoDespesaCandidato2002 = new DAOJPA<>();
        daoReceitaCandidato2002 = new DAOJPA<>();
        daoReceitaCandidato2004 = new DAOJPA<>();
        daoDespesaCandidato2004 = new DAOJPA<>();
    }

    @WebMethod(operationName = "obterDadosDeCandidato")
    public DadosCompletosCandidato obterDadosDeCandidato(
            @WebParam(name = "nome") String nome,
            @WebParam(name = "ano") String ano) throws CandidatoNaoEncontradoExcetpion {

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("nome", nome);

        DadosCompletosCandidato candidato = null;
        if (ano.equals("2002")) {
            List<Despesacandidato2002> despesas2002 = daoDespesaCandidato2002.consultaLista("buscar.despesacandidato2002.pornome", parametros);
            List<Receitacandidato2002> receitas2002 = daoReceitaCandidato2002.consultaLista("buscar.receitacandidato2002.pornome", parametros);

            if (despesas2002.size() > 0) {
                List<DespesaCandidato> despesas = new ArrayList<>();
                List<ReceitaCandidato> receitas = new ArrayList<>();

                for (Receitacandidato2002 r : receitas2002) {
                    receitas.add(new ReceitaCandidato(r.getVr_receita(), r.getDt_receita(), r.getTp_recurso(), r.getNo_doador(), r.getSg_uf_doador(), r.getCd_cpf_cgc()));
                }
                for (Despesacandidato2002 d : despesas2002) {
                    despesas.add(new DespesaCandidato(d.getVr_despesa(), d.getDt_doc_desp(), d.getDs_titulo(), d.getNo_for(), d.getSg_uf_fornecedor(), d.getCd_cpf_cgc()));
                }

                Despesacandidato2002 d = despesas2002.get(0);
                candidato = new DadosCompletosCandidato(d.getNo_cand(), d.getDs_cargo(), d.getNr_cand(), d.getSg_uf(), d.getSg_uf(), d.getSg_part(), "2002", despesas, receitas);
            }

        } else if (ano.equals("2004")) {
            List<Despesacandidato2004> despesas2004 = daoDespesaCandidato2004.consultaLista("buscar.despesacandidato2004.pornome", parametros);
            List<Receitacandidato2004> receitas2004 = daoReceitaCandidato2004.consultaLista("buscar.receitacandidato2004.pornome", parametros);

            if (despesas2004.size() > 0) {
                List<DespesaCandidato> despesas = new ArrayList<>();
                List<ReceitaCandidato> receitas = new ArrayList<>();

                for (Receitacandidato2004 r : receitas2004) {
                    receitas.add(new ReceitaCandidato(r.getVr_receita(), r.getDt_receita(), r.getTp_recurso(), r.getNo_doador(), r.getSg_ue(), r.getCd_cpf_cgc_doa()));
                }
                for (Despesacandidato2004 d : despesas2004) {
                    despesas.add(new DespesaCandidato(d.getVr_despesa(), d.getDt_doc_desp(), d.getDs_titulo(), d.getNo_for(), d.getSg_ue(), d.getCd_cpf_cgc()));
                }

                Despesacandidato2004 d = despesas2004.get(0);
                candidato = new DadosCompletosCandidato(d.getNo_cand(), d.getDs_cargo(), d.getNr_cand(), d.getNo_ue(), d.getSg_ue(), d.getSg_part(), "2004", despesas, receitas);
            }else throw new CandidatoNaoEncontradoExcetpion("Nenhum candidato encontrado com o nome de: "+nome+ " para o ano especificado");
        }
        return candidato;
    }

    @WebMethod(operationName = "listarCandidatosPorNome")
    @WebResult(name = "candidatos")
    public List<DadosResumidosCandidato> listarCandidatosPorNome(@WebParam(name = "nome") String nome) {

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("nome", nome);
        List<Receitacandidato2002> receitas2002 = daoReceitaCandidato2002.consultaLista("buscar.receitacandidato2002.pornome", parametros);
        List<Receitacandidato2004> receitas2004 = daoReceitaCandidato2004.consultaLista("buscar.receitacandidato2004.pornome", parametros);

        List<DadosResumidosCandidato> candidatos = new ArrayList<>();

        String ultimo = "";
        for (Receitacandidato2004 r : receitas2004) {
            if (!ultimo.equals(r.getNo_cand())) {
                DadosResumidosCandidato candidato = new DadosResumidosCandidato(r.getNo_cand(), "2004", r.getSg_part(), r.getDs_cargo());
                ultimo = r.getNo_cand();
                candidatos.add(candidato);
            }
        }
        ultimo = "";
        for (Receitacandidato2002 r : receitas2002) {
            if (!ultimo.equals(r.getNo_cand())) {
                DadosResumidosCandidato candidato = new DadosResumidosCandidato(r.getNo_cand(), "2002", r.getSg_part(), r.getDs_cargo());
                ultimo = r.getNo_cand();
                candidatos.add(candidato);
            }
        }

        return candidatos;
    }

}
