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
public class ReceitaComite implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String sgUf;
    private String sgPart;
    private String dsOrgao;
    private String dtReceita;
    private String cdCpfCgcDoa;
    private String sgUfDoador;
    private String noDoador;
    private String vcReceita;
    private String tpRecurso;

    public ReceitaComite() {
    }

    public ReceitaComite(String sgUf, String sgPart, String dsOrgao, String dtReceita, String cdCpfCgcDoa, String sgUfDoador, String noDoador, String vcReceita, String tpRecurso) {
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsOrgao = dsOrgao;
        this.dtReceita = dtReceita;
        this.cdCpfCgcDoa = cdCpfCgcDoa;
        this.sgUfDoador = sgUfDoador;
        this.noDoador = noDoador;
        this.vcReceita = vcReceita;
        this.tpRecurso = tpRecurso;
    }

    public ReceitaComite(long id, String sgUf, String sgPart, String dsOrgao, String dtReceita, String cdCpfCgcDoa, String sgUfDoador, String noDoador, String vcReceita, String tpRecurso) {
        this.id = id;
        this.sgUf = sgUf;
        this.sgPart = sgPart;
        this.dsOrgao = dsOrgao;
        this.dtReceita = dtReceita;
        this.cdCpfCgcDoa = cdCpfCgcDoa;
        this.sgUfDoador = sgUfDoador;
        this.noDoador = noDoador;
        this.vcReceita = vcReceita;
        this.tpRecurso = tpRecurso;
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

    public String getDtReceita() {
        return dtReceita;
    }

    public void setDtReceita(String dtReceita) {
        this.dtReceita = dtReceita;
    }

    public String getCdCpfCgcDoa() {
        return cdCpfCgcDoa;
    }

    public void setCdCpfCgcDoa(String cdCpfCgcDoa) {
        this.cdCpfCgcDoa = cdCpfCgcDoa;
    }

    public String getSgUfDoador() {
        return sgUfDoador;
    }

    public void setSgUfDoador(String sgUfDoador) {
        this.sgUfDoador = sgUfDoador;
    }

    public String getNoDoador() {
        return noDoador;
    }

    public void setNoDoador(String noDoador) {
        this.noDoador = noDoador;
    }

    public String getVcReceita() {
        return vcReceita;
    }

    public void setVcReceita(String vcReceita) {
        this.vcReceita = vcReceita;
    }

    public String getTpRecurso() {
        return tpRecurso;
    }

    public void setTpRecurso(String tpRecurso) {
        this.tpRecurso = tpRecurso;
    }

    @Override
    public String toString() {
        return "ReceitasComite{" + "id=" + id + ", sgUf=" + sgUf + ", sgPart=" + sgPart + ", dsOrgao=" + dsOrgao + ", dtReceita=" + dtReceita + ", cdCpfCgcDoa=" + cdCpfCgcDoa + ", sgUfDoador=" + sgUfDoador + ", noDoador=" + noDoador + ", vcReceita=" + vcReceita + ", tpRecurso=" + tpRecurso + '}';
    }

}
