/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.extractData;

import com.opencsv.CSVReader;
import com.pos.extracttransformload.dao.DAO;
import com.pos.extracttransformload.dao.DAOJPA;
import com.pos.extracttransformload.entities.DespesaCandidato;
import com.pos.extracttransformload.entities.DespesaComite;
import com.pos.extracttransformload.entities.ReceitaCandidato;
import com.pos.extracttransformload.entities.ReceitaComite;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author marcelo
 */

public class ExtractDataService {

//    public static void main(String[] args) throws FileNotFoundException, IOException {
//    CSVReader reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/2004/Candidato/Receita/ReceitaCandidato.CSV"));
//        System.out.println(reader.readNext()[0]);
//    
//    }
    
//    @EJB
//    private DespesasCandidatoDao despesasCandidatoDao;
//    @EJB
//    private ReceitasCandidatoDao receitasCandidatoDao;
//    @EJB
//    private DespesasComiteDao despesasComiteDao;
//    @EJB
//    private ReceitasComiteDao receitasComiteDao;

    DAO<DespesaCandidato> daoDespesasCandidato = new DAOJPA<>();
    DAO<ReceitaCandidato> daoReceitaCandidato = new DAOJPA<>();
    DAO<DespesaComite> daoDespesasComite = new DAOJPA<>();
    DAO<ReceitaComite> daoReceitasComite = new DAOJPA<>();
    
    public void extrairDespesasCandidato() {
        
        try {
            CSVReader reader = new CSVReader(
                    new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2008/2008/Candidato/Despesa/DespesaCandidato.csv"), ';');
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                System.out.println(nextLine.length);
//                ThreadPersistDespesaCandidato threadPersist = new ThreadPersistDespesaCandidato(nextLine);
//                threadPersist.start();
            }

//            reader = new CSVReader(
//                    new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2006/2006/Candidato/Despesa/DespesaCandidato.csv"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                DespesaCandidato despesaCandidato = new DespesaCandidato(
//                        "2006", nextLine[1], nextLine[2], nextLine[3], nextLine[5], nextLine[6], null, nextLine[7],
//                        nextLine[8], nextLine[9], Double.parseDouble(nextLine[10].replace(',', '.')), nextLine[11], nextLine[12], nextLine[14], nextLine[16], nextLine[17],
//                        nextLine[19], nextLine[20], nextLine[21], null, nextLine[22], null, null);
//                daoDespesasCandidato.salvar(despesaCandidato);
//
//
//            }
//
//            reader = new CSVReader(
//                    new FileReader("/home/marcelo/Documentos/prestacao de contas/2004/Candidato/Despesa/DespesaCandidato.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                DespesaCandidato despesaCandidato = new DespesaCandidato(
//                        "2004", null, nextLine[0], nextLine[1], nextLine[3], nextLine[4], nextLine[6], null,
//                        nextLine[7], nextLine[8], Double.parseDouble(nextLine[9].replace(',', '.')), nextLine[10], nextLine[11], nextLine[13],
//                        null,nextLine[16], nextLine[18], nextLine[21], null, null, nextLine[21], null, null);
//                daoDespesasCandidato.salvar(despesaCandidato);
//
//            }
//
//            reader = new CSVReader(
//                    new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2002/2002/Candidato/Despesa/DespesaCandidato.csv"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                DespesaCandidato despesaCandidato = new DespesaCandidato(
//                        "2002", nextLine[0], nextLine[4], nextLine[3], nextLine[5], nextLine[1], null, null,
//                        null, nextLine[2], Double.parseDouble(nextLine[10].replace(',', '.')), nextLine[6], nextLine[11], null,
//                        null, null, nextLine[9], nextLine[7], nextLine[8], null, null, null, null);
//                daoDespesasCandidato.salvar(despesaCandidato);
//
//            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    public void extrairReceitasCandidato() {
        
//        try {
////            String[] nextLine;
//            
//            CSVReader reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2008/2008/Candidato/Receita/ReceitaCandidato.csv"), ';');
//            reader.readNext();
//            while ((nextLine = reader.readNext()) != null) {
//                ThreadPersistDespesaCandidato threadPersist = new ThreadPersistDespesaCandidato(nextLine);
//                threadPersist.start();
//            }
//
//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2006/2006/Candidato/Receita/ReceitaCandidato.csv"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                ReceitaCandidato recetaCandidato = new ReceitaCandidato(
//                        "2006", nextLine[0], nextLine[1], null, nextLine[2], nextLine[4], nextLine[5], null,
//                        null, null, nextLine[6], nextLine[7], nextLine[8], Double.parseDouble(nextLine[9].replace(',', '.')), nextLine[10], nextLine[11],
//                        null , nextLine[13], nextLine[15], nextLine[16], null, nextLine[17],null, nextLine[18], null, null);
//              daoReceitaCandidato.salvar(recetaCandidato);
//            }
//
//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/2004/Candidato/Receita/ReceitaCandidato.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                ReceitaCandidato recetaCandidato = new ReceitaCandidato(
//                        "2004", null, nextLine[0], null, nextLine[1], nextLine[3], nextLine[4], nextLine[5],
//                        null, null, null, nextLine[7], nextLine[8], Double.parseDouble(nextLine[9].replace(',', '.')), nextLine[10], nextLine[11],
//                        nextLine[12], nextLine[13], nextLine[15], nextLine[16], null, null, null, nextLine[17], null, null);
//                daoReceitaCandidato.salvar(recetaCandidato);
//            }
//            
//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2002/2002/Candidato/Receita/ReceitaCandidato.csv"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                ReceitaCandidato receitaCandidato = new ReceitaCandidato(
//                        "2002", nextLine[0], nextLine[4], null, nextLine[3], nextLine[5], nextLine[1], null,
//                        null, null, null, null, nextLine[2], Double.parseDouble(nextLine[10].replace(',', '.')), nextLine[6], null,
//                        nextLine[11], nextLine[9], null, null, null, null, null, null, null, null);
//
//                     daoReceitaCandidato.salvar(receitaCandidato);
//            }
//            
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

    }
    
    public void extrarirDespesasComite() {
        
        try {
            String[] nextLine;
            
            CSVReader reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2008/2008/Comitê/Despesa/DespesasComitê.CSV"), ';');

            while ((nextLine = reader.readNext()) != null) {
//                ThreadPersistDespesaCandidato thread = new ThreadPersistDespesaCandidato(nextLine);
//                thread.start();
            }

//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2006/2006/Comitê/Despesa/DespesaComitê.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                DespesaComite despesaComite = new DespesaComite(
//                        "2006", nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[3], null, nextLine[4],
//                        Double.parseDouble(nextLine[5].replace(',', '.')), nextLine[6], nextLine[7], nextLine[8], nextLine[9], nextLine[10], nextLine[11], nextLine[12],
//                        nextLine[13], nextLine[14], nextLine[15], nextLine[16], null, null, null, nextLine[17], null,null);
//
//                daoDespesasComite.salvar(despesaComite);
//            }
//            
//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/2004/Comitê/Despesa/DespesaComitê.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                DespesaComite despesaComite = new DespesaComite(
//                        "2004", nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], null,
//                        Double.parseDouble(nextLine[6].replace(',', '.')), nextLine[7], nextLine[8], nextLine[9], nextLine[10], nextLine[11], nextLine[12], nextLine[13],
//                        nextLine[14], nextLine[15], nextLine[16], null, null, null, null, nextLine[17], null, null);
//
//                daoDespesasComite.salvar(despesaComite);
//            }
//
//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2002/2002/Comitê/Despesa/DespesaComitê.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                DespesaComite despesaComite = new DespesaComite(
//                        "2002", nextLine[2], null, nextLine[1], nextLine[0], nextLine[0], null, null, Double.parseDouble(nextLine[7].replace(',', '.')), 
//                        nextLine[3], nextLine[8], null, null, null, null, null, null, nextLine[6], nextLine[4], 
//                        nextLine[5], nextLine[5], null, null, null, null, null);
//
//                daoDespesasComite.salvar(despesaComite);
//            }        
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    public void extrairReceitasComite() {
        
        try {
            String[] nextLine;
            
            CSVReader reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2008/2008/Comitê/Receita/ReceitaComitê.CSV"), ';');

            while ((nextLine = reader.readNext()) != null) {
                System.out.println(nextLine.length);
//                ThreadPersistDespesaCandidato t = new ThreadPersistDespesaCandidato(nextLine);
//                t.start();
            }

//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2006/2006/Comitê/Receita/ReceitaComitê.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                ReceitaComite receitaComite = new ReceitaComite(
//                        "2006", nextLine[0], nextLine[1], nextLine[2], nextLine[3], null, null, nextLine[4],
//                        Double.parseDouble(nextLine[5].replace(',', '.')), nextLine[6], nextLine[7], nextLine[8], nextLine[9], nextLine[10], nextLine[11], nextLine[12],
//                        nextLine[13], nextLine[13], null, nextLine[14], null, null);
//
//                daoReceitasComite.salvar(receitaComite);
//            }
//
//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/2004/Comitê/Receita/ReceitaComitê.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                ReceitaComite receitaComite = new ReceitaComite(
//                        "2004", nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], null,
//                        Double.parseDouble(nextLine[6].replace(',', '.')), nextLine[7], nextLine[8], nextLine[9], nextLine[10], nextLine[11], nextLine[12], nextLine[13],
//                        null, null, null, nextLine[14], null, null);
//
//                daoReceitasComite.salvar(receitaComite);
//            }
//
//            reader = new CSVReader(new FileReader("/home/marcelo/Documentos/prestacao de contas/prestacao_contas_2002/2002/Comitê/Receita/ReceitaComitê.CSV"), ';');
//
//            while ((nextLine = reader.readNext()) != null) {
//                ReceitaComite receitaComite = new ReceitaComite(
//                        "2002", nextLine[2], null, nextLine[1], nextLine[0], null, null, null,
//                        Double.parseDouble(nextLine[7].replace(',', '.')), nextLine[3], null, null, nextLine[8], null, nextLine[6], nextLine[4],
//                        nextLine[5], null, null, null, null, null);
//
//                daoReceitasComite.salvar(receitaComite);
//            }
           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
