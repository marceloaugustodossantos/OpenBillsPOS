/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.extractData;

import com.pos.extracttransformload.dao.DAO;
import com.pos.extracttransformload.dao.DAOJPA;
import com.pos.extracttransformload.entities.DespesaCandidato;

/**
 *
 * @author marcelo
 */
public class ThreadPersistDespesaCandidato extends Thread {

    private String[] line;
    private DAO<DespesaCandidato> daoDespesasCandidato = new DAOJPA<>();

    public ThreadPersistDespesaCandidato(String[] line) {
        this.line = line;
    }

    @Override
    public void run() {
        persistirDespesa();
    }

    private void persistirDespesa() {
        DespesaCandidato despesaCandidato = new DespesaCandidato(
                "2008", line[0], line[1], line[2], line[4], line[5], line[7], line[8],
                line[9], line[10], Double.parseDouble(line[11].replace(',', '.')), line[12], line[13], line[15], line[17], line[18],
                line[20], line[21], line[22], line[24], line[26], line[27], line[28]);

        daoDespesasCandidato.salvar(despesaCandidato);
    }

}
