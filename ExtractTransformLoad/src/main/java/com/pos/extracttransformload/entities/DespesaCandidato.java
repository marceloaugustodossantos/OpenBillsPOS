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
public class DespesaCandidato implements Serializable {

    @Id
    @GeneratedValue
    private long sequencialCandidato;
    private String sgUf;
    private String sgPart;
    private String dsCargo;
    private String noCand;
    private String nrCand;
    private String dtDocDesp;
    private String cdCpfCgc;
    private String sgUfFornecedor;
    private String noFor;
    private String vrDespesa;
    private String dsTitulo;

    public DespesaCandidato() {
    }

    public DespesaCandidato(String sgUf, String sgPart, String dsCargo, String noCand, String nrCand, String dtDocDesp, String cdCpfCgc, String sgUfFornecedor, String noFor, String vrDespesa, String dsTitulo) {
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsCargo = dsCargo;
        this.noCand = noCand;
        this.nrCand = nrCand;
        this.dtDocDesp = dtDocDesp;
        this.cdCpfCgc = cdCpfCgc;
        this.sgUfFornecedor = sgUfFornecedor;
        this.noFor = noFor;
        this.vrDespesa = vrDespesa;
        this.dsTitulo = dsTitulo;
    }

    public DespesaCandidato(long sequencialCandidato, String sgUf, String sgPart, String dsCargo, String noCand, String nrCand, String dtDocDesp, String cdCpfCgc, String sgUfFornecedor, String noFor, String vrDespesa, String dsTitulo) {
        this.sequencialCandidato = sequencialCandidato;
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsCargo = dsCargo;
        this.noCand = noCand;
        this.nrCand = nrCand;
        this.dtDocDesp = dtDocDesp;
        this.cdCpfCgc = cdCpfCgc;
        this.sgUfFornecedor = sgUfFornecedor;
        this.noFor = noFor;
        this.vrDespesa = vrDespesa;
        this.dsTitulo = dsTitulo;
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

    public String getDtDocDesp() {
        return dtDocDesp;
    }

    public void setDtDocDesp(String dtDocDesp) {
        this.dtDocDesp = dtDocDesp;
    }

    public String getCdCpfCgc() {
        return cdCpfCgc;
    }

    public void setCdCpfCgc(String cdCpfCgc) {
        this.cdCpfCgc = cdCpfCgc;
    }

    public String getSgUfFornecedor() {
        return sgUfFornecedor;
    }

    public void setSgUfFornecedor(String sgUfFornecedor) {
        this.sgUfFornecedor = sgUfFornecedor;
    }

    public String getNoFor() {
        return noFor;
    }

    public void setNoFor(String noFor) {
        this.noFor = noFor;
    }

    public String getVrDespesa() {
        return vrDespesa;
    }

    public void setVrDespesa(String vrDespesa) {
        this.vrDespesa = vrDespesa;
    }

    public String getDsTitulo() {
        return dsTitulo;
    }

    public void setDsTitulo(String dsTitulo) {
        this.dsTitulo = dsTitulo;
    }

    @Override
    public String toString() {
        return "DespesasCandidato{" + "sequencialCandidato=" + sequencialCandidato + ", sgUf=" + sgUf + ", sgPart=" + sgPart + ", dsCargo=" + dsCargo + ", noCand=" + noCand + ", nrCand=" + nrCand + ", dtDocDesp=" + dtDocDesp + ", cdCpfCgc=" + cdCpfCgc + ", sgUfFornecedor=" + sgUfFornecedor + ", noFor=" + noFor + ", vrDespesa=" + vrDespesa + ", dsTitulo=" + dsTitulo + '}';
    }
}
