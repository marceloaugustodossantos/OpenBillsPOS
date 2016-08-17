/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.extractData;

import com.opencsv.CSVReader;
import com.pos.extracttransformload.dao.DespesasCandidatoDao;
import com.pos.extracttransformload.entities.DespesaCandidato;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.ejb.EJB;

/**
 *
 * @author marcelo
 */
public class ExtractDataService {
    
    @EJB
    DespesasCandidatoDao despesasCandidatoDao;
    
    public void extrairDespesasCandidato() throws FileNotFoundException, IOException {
        
        CSVReader reader = new CSVReader(
                new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2008/2008/Candidato/Despesa/DespesaCandidato.csv"), ';');
        
        String[] nextLine;
        
        while ((nextLine = reader.readNext()) != null) {
            DespesaCandidato despesaCandidato = new DespesaCandidato(
                    "2008",     nextLine[0],nextLine[1],nextLine[2],nextLine[4],nextLine[5],nextLine[7],nextLine[8],
                    nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13],nextLine[15],nextLine[17],nextLine[18],
                    nextLine[20],nextLine[21],nextLine[22],nextLine[24],nextLine[26],nextLine[27],nextLine[28]);
            
            despesasCandidatoDao.addDespesaCandidato(despesaCandidato);
        }
        
        reader = new CSVReader(
                new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2006/2006/Candidato/Despesa/DespesaCandidato.csv"), ';');
        
        while ((nextLine = reader.readNext()) != null) {
            DespesaCandidato despesaCandidato = new DespesaCandidato(
                    "2006",     nextLine[1],nextLine[2],nextLine[3],nextLine[5],nextLine[6], null ,nextLine[7],
                    nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[14],nextLine[16],nextLine[17],
                    nextLine[19],nextLine[20],nextLine[21],null,nextLine[22],null,null);
            
            despesasCandidatoDao.addDespesaCandidato(despesaCandidato);
        }
        
        reader = new CSVReader(
                new FileReader("/home/marcelo/Documentos/prestacao de contas/2004/Candidato/Despesa/DespesaCandidato.CSV"), ';');
        
        while ((nextLine = reader.readNext()) != null) {
            DespesaCandidato despesaCandidato = new DespesaCandidato(
                    "2004",     null,nextLine[0],nextLine[1],nextLine[3],nextLine[4], nextLine[6],null,
                    nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[13], 
                    null, null, null, null, null, null, null, null, null);
            
            despesasCandidatoDao.addDespesaCandidato(despesaCandidato);
        }
        
        reader = new CSVReader(
                new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2002/2002/Candidato/Despesa/DespesaCandidato.csv"), ';');
        
        while ((nextLine = reader.readNext()) != null) {
            DespesaCandidato despesaCandidato = new DespesaCandidato(
                    "2002", nextLine[0],nextLine[4],nextLine[3],nextLine[5],nextLine[1], null ,null,
                    null,nextLine[2],nextLine[10],nextLine[6],nextLine[11],null, 
                    null, null, nextLine[9], nextLine[7], nextLine[8], null, null, null, null);
            
            despesasCandidatoDao.addDespesaCandidato(despesaCandidato);
        }
    }

}
