/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author marcelo
 */
@Entity
public class ReceitaCandidato implements Serializable {

    @Id
    @GeneratedValue
    private long sequencialCandidato;
    private String sgUf;
    private String sgPart;
    private String dsCargo;
    private String noCand;
    private String nrCand;
    private String dtReceita;
    private String cdUfDoador;
    private String noDoador;
    private String vrreceita;
    private String tpRecurso;

    public ReceitaCandidato() {
    }

    public ReceitaCandidato(String sgUf, String sgPart, String dsCargo, String noCand, String nrCand, String dtReceita, String cdUfDoador, String noDoador, String vrreceita, String tpRecurso) {
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsCargo = dsCargo;
        this.noCand = noCand;
        this.nrCand = nrCand;
        this.dtReceita = dtReceita;
        this.cdUfDoador = cdUfDoador;
        this.noDoador = noDoador;
        this.vrreceita = vrreceita;
        this.tpRecurso = tpRecurso;
    }

    public ReceitaCandidato(long sequencialCandidato, String sgUf, String sgPart, String dsCargo, String noCand, String nrCand, String dtReceita, String cdUfDoador, String noDoador, String vrreceita, String tpRecurso) {
        this.sequencialCandidato = sequencialCandidato;
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsCargo = dsCargo;
        this.noCand = noCand;
        this.nrCand = nrCand;
        this.dtReceita = dtReceita;
        this.cdUfDoador = cdUfDoador;
        this.noDoador = noDoador;
        this.vrreceita = vrreceita;
        this.tpRecurso = tpRecurso;
    }

    public long getSequencialCandidato() {
        return sequencialCandidato;
    }

    public void setSequencialCandidato(long sequencialCandidato) {
        this.sequencialCandidato = sequencialCandidato;
    }

    public String getSgUf() {
        return sgUf;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    public String getSgPart() {
        return sgPart;
    }

    public void setSgPart(String sgPart) {
        this.sgPart = sgPart;
    }

    public String getDsCargo() {
        return dsCargo;
    }

    public void setDsCargo(String dsCargo) {
        this.dsCargo = dsCargo;
    }

    public String getNoCand() {
        return noCand;
    }

    public void setNoCand(String noCand) {
        this.noCand = noCand;
    }

    public String getNrCand() {
        return nrCand;
    }

    public void setNrCand(String nrCand) {
        this.nrCand = nrCand;
    }

    public String getDtReceita() {
        return dtReceita;
    }

    public void setDtReceita(String dtReceita) {
        this.dtReceita = dtReceita;
    }

    public String getCdUfDoador() {
        return cdUfDoador;
    }

    public void setCdUfDoador(String cdUfDoador) {
        this.cdUfDoador = cdUfDoador;
    }

    public String getNoDoador() {
        return noDoador;
    }

    public void setNoDoador(String noDoador) {
        this.noDoador = noDoador;
    }

    public String getVrreceita() {
        return vrreceita;
    }

    public void setVrreceita(String vrreceita) {
        this.vrreceita = vrreceita;
    }

    public String getTpRecurso() {
        return tpRecurso;
    }

    public void setTpRecurso(String tpRecurso) {
        this.tpRecurso = tpRecurso;
    }

    @Override
    public String toString() {
        return "ReceitasCandidato{" + "sequencialCandidato=" + sequencialCandidato + ", sgUf=" + sgUf + ", sgPart=" + sgPart + ", dsCargo=" + dsCargo + ", noCand=" + noCand + ", nrCand=" + nrCand + ", dtReceita=" + dtReceita + ", cdUfDoador=" + cdUfDoador + ", noDoador=" + noDoador + ", vrreceita=" + vrreceita + ", tpRecurso=" + tpRecurso + '}';
    }
}
