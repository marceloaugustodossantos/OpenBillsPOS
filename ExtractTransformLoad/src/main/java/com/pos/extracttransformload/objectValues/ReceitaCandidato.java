/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marcelo
 */
@XmlType
public class ReceitaCandidato implements Serializable{
    
    private double valorReceita;
    private String dataReceita;
    private String tipoRecurso;
    private String nomeDoador;
    private String ufDoador;
    private String cpfDoDoador;

    public ReceitaCandidato() {
    }

    public ReceitaCandidato(double valorReceita, String dataReceita, String tipoRecurso, String nomeDoador, String ufDoador, String cpfDoDoador) {
        this.valorReceita = valorReceita;
        this.dataReceita = dataReceita;
        this.tipoRecurso = tipoRecurso;
        this.nomeDoador = nomeDoador;
        this.ufDoador = ufDoador;
        this.cpfDoDoador = cpfDoDoador;
    }

    public double getValorReceita() {
        return valorReceita;
    }

    public void setValorReceita(double valorReceita) {
        this.valorReceita = valorReceita;
    }

    public String getDataReceita() {
        return dataReceita;
    }

    public void setDataReceita(String dataReceita) {
        this.dataReceita = dataReceita;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public String getUfDoador() {
        return ufDoador;
    }

    public void setUfDoador(String ufDoador) {
        this.ufDoador = ufDoador;
    }

    public String getCpfDoDoador() {
        return cpfDoDoador;
    }

    public void setCpfDoDoador(String cpfDoDoador) {
        this.cpfDoDoador = cpfDoDoador;
    }

    
}
