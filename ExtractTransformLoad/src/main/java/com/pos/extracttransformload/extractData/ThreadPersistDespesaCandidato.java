/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.extractData;

import com.pos.extracttransformload.dao.DAO;
import com.pos.extracttransformload.dao.DAOJPA;
import com.pos.extracttransformload.entities.DespesaCandidato;
import com.pos.extracttransformload.entities.DespesaComite;
import com.pos.extracttransformload.entities.ReceitaCandidato;
import com.pos.extracttransformload.entities.ReceitaComite;

/**
 *
 * @author marcelo
 */
public class ThreadPersistDespesaCandidato extends Thread {

    private String[] nextLine;
    private DAO<DespesaComite> daoDespesasComite = new DAOJPA<>();
    private DAO<ReceitaComite> daoReceitasComite = new DAOJPA<>();

    public ThreadPersistDespesaCandidato(String[] line) {
        this.nextLine = line;
    }

    @Override
    public void run() {
        persistirDespesa();
    }

    private void persistirDespesa() {
//        DespesaCandidato despesaCandidato = new DespesaCandidato(
//                "2008", line[0], line[1], line[2], line[4], line[5], line[7], line[8],
//                line[9], line[10], Double.parseDouble(line[11].replace(',', '.')), line[12], line[13], line[15], line[17], line[18],
//                line[20], line[21], line[22], line[24], line[26], line[27], line[28]);
//
//        daoDespesasCandidato.salvar(despesaCandidato);

//            DespesaComite despesaComite = new DespesaComite(
//                        "2008", nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], nextLine[6],
//                        Double.parseDouble(nextLine[7].replace(',', '.')), nextLine[8], nextLine[9], nextLine[10], nextLine[11], nextLine[12], nextLine[13], nextLine[14],
//                        nextLine[15], nextLine[16], nextLine[17], nextLine[18], nextLine[19], nextLine[20], nextLine[21],
//                        nextLine[22], nextLine[23],nextLine[24]);
//              
//                daoDespesasComite.salvar(despesaComite);

ReceitaComite receitaComite = new ReceitaComite(
                        "2008", nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], nextLine[6],
                        Double.parseDouble(nextLine[7].replace(',', '.')), nextLine[8], nextLine[9], nextLine[10], nextLine[11], nextLine[12], nextLine[13], nextLine[14],
                        nextLine[15], nextLine[16], nextLine[17], nextLine[18], nextLine[19],nextLine[20]);          
                   
                daoReceitasComite.salvar(receitaComite);

    }

}
