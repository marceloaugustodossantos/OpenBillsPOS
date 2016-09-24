/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marcelo
 */
@XmlType
public class Doacao implements Serializable{
    
    private String nomeCandidato;
    private String partidoCandidato;
    private double valorDoado;
    private String dataDoacao;

    public Doacao() {
    }

    
    public Doacao(String nomeCandidato, String partidoCandidato, double valorDoado, String dataDoacao) {
        this.nomeCandidato = nomeCandidato;
        this.partidoCandidato = partidoCandidato;
        this.valorDoado = valorDoado;
        this.dataDoacao = dataDoacao;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getPartidoCandidato() {
        return partidoCandidato;
    }

    public void setPartidoCandidato(String partidoCandidato) {
        this.partidoCandidato = partidoCandidato;
    }

    public double getValorDoado() {
        return valorDoado;
    }

    public void setValorDoado(double valorDoado) {
        this.valorDoado = valorDoado;
    }

    public String getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(String dataDoacao) {
        this.dataDoacao = dataDoacao;
    }
    
    
    
}
