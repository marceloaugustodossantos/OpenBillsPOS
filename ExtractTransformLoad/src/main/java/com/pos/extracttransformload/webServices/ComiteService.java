/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.webServices;

import com.pos.extracttransformload.dao.DAO;
import com.pos.extracttransformload.dao.DAOJPA;
import com.pos.extracttransformload.entities.Despesacomite2002;
import com.pos.extracttransformload.entities.Despesacomite2004;
import com.pos.extracttransformload.entities.Receitacandidato2002;
import com.pos.extracttransformload.entities.Receitacandidato2004;
import com.pos.extracttransformload.entities.Receitacomite2002;
import com.pos.extracttransformload.entities.Receitacomite2004;
import com.pos.extracttransformload.objectValues.Comite;
import com.pos.extracttransformload.objectValues.DespesaComite;
import com.pos.extracttransformload.objectValues.Doacao;
import com.pos.extracttransformload.objectValues.Doador;
import com.pos.extracttransformload.objectValues.ReceitaComite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

/**
 *
 * @author marcelo
 */
@WebService(serviceName = "ComiteService")
public class ComiteService {

    private DAO<Receitacomite2002> daoReceitaComite2002 = new DAOJPA<>();
    private DAO<Receitacomite2004> daoReceitaComite2004 = new DAOJPA<>();
    private DAO<Despesacomite2002> daoDespesaComite2002 = new DAOJPA<>();
    private DAO<Despesacomite2004> daoDespesaComite2004 = new DAOJPA<>();

    @WebMethod(operationName = "listarComites")
    @WebResult(name = "comites")
    public Set<Comite> listarComites(String estado, String ano) {
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("estado", estado);
        List<Receitacomite2002> receitas2002 = daoReceitaComite2002.consultaLista("buscar.receitascomite2002.porestado", parametros);
//        List<Receitacomite2004> receitas2004 = daoReceitaComite2004.consultaLista("buscar.receitascomite2004.porestado", parametros);
        List<Despesacomite2002> despesas2002 = daoDespesaComite2002.consultaLista("buscar.despesascomite2002.porestado", parametros);
//        List<Despesacomite2004> despesas2004 = daoDespesaComite2004.consultaLista("buscar.despesascomite2004.porestado", parametros);

        Set<Comite> comites = new HashSet<>();
        Map<String, List<DespesaComite>> despesas = new HashMap<>();
        Map<String, List<ReceitaComite>> receitas = new HashMap<>();

//        if (ano.equals("2004")) {
//            for (Despesacomite2004 d : despesas2004) {
//                List<DespesaComite> listDespesas = despesas.get(d.getDs_orgao());
//                if (listDespesas == null) {
//                    listDespesas = new ArrayList<>();
//                }
//                listDespesas.add(new DespesaComite(d.getNo_for(), d.getVr_despesa(), d.getDs_titulo(), d.getDt_doc_desp(), d.getCd_cpf_cgc(), d.getNo_ue()));
//                despesas.put(d.getDs_orgao(), listDespesas);
//            }
//            for (Receitacomite2004 r : receitas2004) {
//                List<ReceitaComite> listReceitas = receitas.get(r.getDs_orgao());
//                if (listReceitas == null) {
//                    listReceitas = new ArrayList<>();
//                }
//                listReceitas.add(new ReceitaComite(r.getDt_receita(), r.getCd_cpf_cgc_doa(), r.getSg_ue(), r.getNo_doador(), r.getVr_receita(), r.getTp_recurso()));
//                receitas.put(r.getDs_orgao(), listReceitas);
//            }
//        } else if (ano.equals("2002")) {
        for (Receitacomite2002 r : receitas2002) {
            List<ReceitaComite> listReceitas = receitas.get(r.getNo_doador());
            if (listReceitas == null) {
                listReceitas = new ArrayList<>();
            }
            listReceitas.add(new ReceitaComite(r.getNo_doador(), r.getCd_cpf_cgc_doa(), r.getSg_uf_doador(), r.getNo_doador(), r.getVr_receita(), r.getTp_recurso()));
            receitas.put(r.getDs_orgao(), listReceitas);
        }
        for (Despesacomite2002 d : despesas2002) {
            List<DespesaComite> listDespesas = despesas.get(d.getDs_org_desp());
            if (listDespesas == null) {
                listDespesas = new ArrayList<>();
            }
            listDespesas.add(new DespesaComite(d.getNo_for(), d.getVr_despesa(), d.getDs_titulo(), d.getDt_docreceita(), d.getCd_cpf_cgc(), d.getSg_uf_fornecedor()));
            despesas.put(d.getDs_org_desp(), listDespesas);
        }
//        }
        for (Receitacomite2002 r : receitas2002) {
            comites.add(new Comite(r.getSg_uf(), r.getSg_part(), r.getDs_orgao(), despesas.get(r.getDs_orgao()), receitas.get(r.getDs_orgao())));
        }
//        for (Receitacomite2004 r : receitas2004) {
//            comites.add(new Comite(r.getSg_ue_sup(), r.getSg_part(), r.getDs_orgao(), despesas.get(r.getDs_orgao()), receitas.get(r.getDs_orgao())));
//        }

        return comites;
    }

}
