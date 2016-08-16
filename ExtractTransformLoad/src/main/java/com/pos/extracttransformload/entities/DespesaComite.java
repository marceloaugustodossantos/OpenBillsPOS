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
public class DespesaComite implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String sgUf;
    private String sgPart;
    private String dsOrgao;
    private String dtDocDesp;
    private String cdCpfCgc;
    private String sgUfFornecedor;
    private String noFor;
    private String vrDespesa;
    private String dsTitulo;

    public DespesaComite() {
    }

    public DespesaComite(String sgUf, String sgPart, String dsOrgao, String dtDocDesp, String cdCpfCgc, String sgUfFornecedor, String noFor, String vrDespesa, String dsTitulo) {
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsOrgao = dsOrgao;
        this.dtDocDesp = dtDocDesp;
        this.cdCpfCgc = cdCpfCgc;
        this.sgUfFornecedor = sgUfFornecedor;
        this.noFor = noFor;
        this.vrDespesa = vrDespesa;
        this.dsTitulo = dsTitulo;
    }

    public DespesaComite(long id, String sgUf, String sgPart, String dsOrgao, String dtDocDesp, String cdCpfCgc, String sgUfFornecedor, String noFor, String vrDespesa, String dsTitulo) {
        this.id = id;
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsOrgao = dsOrgao;
        this.dtDocDesp = dtDocDesp;
        this.cdCpfCgc = cdCpfCgc;
        this.sgUfFornecedor = sgUfFornecedor;
        this.noFor = noFor;
        this.vrDespesa = vrDespesa;
        this.dsTitulo = dsTitulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getDsOrgao() {
        return dsOrgao;
    }

    public void setDsOrgao(String dsOrgao) {
        this.dsOrgao = dsOrgao;
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
        return "DespesasComite{" + "id=" + id + ", sgUf=" + sgUf + ", sgPart=" + sgPart + ", dsOrgao=" + dsOrgao + ", dtDocDesp=" + dtDocDesp + ", cdCpfCgc=" + cdCpfCgc + ", sgUfFornecedor=" + sgUfFornecedor + ", noFor=" + noFor + ", vrDespesa=" + vrDespesa + ", dsTitulo=" + dsTitulo + '}';
    }
}
