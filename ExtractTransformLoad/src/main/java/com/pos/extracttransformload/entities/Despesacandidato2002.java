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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */
@NamedQueries({
    @NamedQuery(
            name = "buscar.despesacandidato2002.pornome",
            query = "SELECT d FROM Despesacandidato2002 d WHERE d.no_cand LIKE UPPER(:nome)"),
    @NamedQuery(
            name = "buscar.partidosdecandidatos2002.pornome",
            query = "SELECT d FROM Despesacandidato2002 d WHERE d.sg_part LIKE UPPER(:nome)"),
    @NamedQuery(
            name = "buscar.cargosdepartido2002.pornome",
            query = "SELECT d FROM Despesacandidato2002 d WHERE d.ds_cargo LIKE :cargo AND d.sg_part LIKE UPPER(:nome)")
})
@Entity
@XmlRootElement
public class Despesacandidato2002 implements Serializable {

    @Id
    private Integer id;
    private String sequencial_candidato;
    private String sg_uf;
    private String sg_part;
    private String ds_cargo;
    private String no_cand;
    private String nr_cand;
    private String dt_doc_desp;
    private String cd_cpf_cgc;
    private String sg_uf_fornecedor;
    private double vr_despesa;
    private String no_for;
    private String ds_titulo;

    public Despesacandidato2002() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSequencial_candidato() {
        return sequencial_candidato;
    }

    public void setSequencial_candidato(String sequencial_candidato) {
        this.sequencial_candidato = sequencial_candidato;
    }

    public String getSg_uf() {
        return sg_uf;
    }

    public void setSg_uf(String sg_uf) {
        this.sg_uf = sg_uf;
    }

    public String getSg_part() {
        return sg_part;
    }

    public void setSg_part(String sg_part) {
        this.sg_part = sg_part;
    }

    public String getDs_cargo() {
        return ds_cargo;
    }

    public void setDs_cargo(String ds_cargo) {
        this.ds_cargo = ds_cargo;
    }

    public String getNo_cand() {
        return no_cand;
    }

    public void setNo_cand(String no_cand) {
        this.no_cand = no_cand;
    }

    public String getNr_cand() {
        return nr_cand;
    }

    public void setNr_cand(String nr_cand) {
        this.nr_cand = nr_cand;
    }

    public String getDt_doc_desp() {
        return dt_doc_desp;
    }

    public void setDt_doc_desp(String dt_doc_desp) {
        this.dt_doc_desp = dt_doc_desp;
    }

    public String getCd_cpf_cgc() {
        return cd_cpf_cgc;
    }

    public void setCd_cpf_cgc(String cd_cpf_cgc) {
        this.cd_cpf_cgc = cd_cpf_cgc;
    }

    public String getSg_uf_fornecedor() {
        return sg_uf_fornecedor;
    }

    public void setSg_uf_fornecedor(String sg_uf_fornecedor) {
        this.sg_uf_fornecedor = sg_uf_fornecedor;
    }

    public double getVr_despesa() {
        return vr_despesa;
    }

    public void setVr_despesa(double vr_despesa) {
        this.vr_despesa = vr_despesa;
    }

    public String getNo_for() {
        return no_for;
    }

    public void setNo_for(String no_for) {
        this.no_for = no_for;
    }

    public String getDs_titulo() {
        return ds_titulo;
    }

    public void setDs_titulo(String ds_titulo) {
        this.ds_titulo = ds_titulo;
    }

}
