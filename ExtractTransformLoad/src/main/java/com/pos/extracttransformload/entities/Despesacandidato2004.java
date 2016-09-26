/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
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
            name = "buscar.despesacandidato2004.pornome", 
            query = "SELECT d FROM Despesacandidato2004 d WHERE d.no_cand LIKE UPPER(:nome)"),
    @NamedQuery(
            name = "buscar.municipios.pornome",
            query = "SELECT d FROM Despesacandidato2004 d WHERE d.no_ue LIKE UPPER(:nome)"),
    @NamedQuery(
            name = "buscar.candidatos.pormunicipio",
            query = "SELECT d FROM Despesacandidato2004 d WHERE d.no_ue LIKE UPPER(:nome)"),
    @NamedQuery(
            name = "buscar.partidosdecandidatos2004.pornome",
            query = "SELECT d FROM Despesacandidato2004 d WHERE d.sg_part LIKE UPPER(:nome)")
})
@Entity
@XmlRootElement
public class Despesacandidato2004 implements Serializable {

    @Id
    private Integer id;
    private String no_cand;
    private String ds_cargo;
    private String cd_cargo;
    private String nr_cand;
    private String sg_ue_sup;
    private String no_ue;
    private String sg_ue;
    private String nr_part;
    private String sg_part;
    private double vr_despesa;
    private String dt_doc_desp;
    private String ds_titulo;
    private String cd_titulo;
    private String tp_recurso;
    private String tp_recurso2;
    private String nr_doc_desp;
    private String ds_tipo_documento;
    private String cd_doc;
    private String no_for;
    private String cd_cpf_cgc;
    private String ds_munic;
    private String rv_meaning;

    public Despesacandidato2004() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo_cand() {
        return no_cand;
    }

    public void setNo_cand(String no_cand) {
        this.no_cand = no_cand;
    }

    public String getDs_cargo() {
        return ds_cargo;
    }

    public void setDs_cargo(String ds_cargo) {
        this.ds_cargo = ds_cargo;
    }

    public String getCd_cargo() {
        return cd_cargo;
    }

    public void setCd_cargo(String cd_cargo) {
        this.cd_cargo = cd_cargo;
    }

    public String getNr_cand() {
        return nr_cand;
    }

    public void setNr_cand(String nr_cand) {
        this.nr_cand = nr_cand;
    }

    public String getSg_ue_sup() {
        return sg_ue_sup;
    }

    public void setSg_ue_sup(String sg_ue_sup) {
        this.sg_ue_sup = sg_ue_sup;
    }

    public String getNo_ue() {
        return no_ue;
    }

    public void setNo_ue(String no_ue) {
        this.no_ue = no_ue;
    }

    public String getSg_ue() {
        return sg_ue;
    }

    public void setSg_ue(String sg_ue) {
        this.sg_ue = sg_ue;
    }

    public String getNr_part() {
        return nr_part;
    }

    public void setNr_part(String nr_part) {
        this.nr_part = nr_part;
    }

    public String getSg_part() {
        return sg_part;
    }

    public void setSg_part(String sg_part) {
        this.sg_part = sg_part;
    }

    public double getVr_despesa() {
        return vr_despesa;
    }

    public void setVr_despesa(double vr_despesa) {
        this.vr_despesa = vr_despesa;
    }

    public String getDt_doc_desp() {
        return dt_doc_desp;
    }

    public void setDt_doc_desp(String dt_doc_desp) {
        this.dt_doc_desp = dt_doc_desp;
    }

    public String getDs_titulo() {
        return ds_titulo;
    }

    public void setDs_titulo(String ds_titulo) {
        this.ds_titulo = ds_titulo;
    }

    public String getCd_titulo() {
        return cd_titulo;
    }

    public void setCd_titulo(String cd_titulo) {
        this.cd_titulo = cd_titulo;
    }

    public String getTp_recurso() {
        return tp_recurso;
    }

    public void setTp_recurso(String tp_recurso) {
        this.tp_recurso = tp_recurso;
    }

    public String getTp_recurso2() {
        return tp_recurso2;
    }

    public void setTp_recurso2(String tp_recurso2) {
        this.tp_recurso2 = tp_recurso2;
    }

    public String getNr_doc_desp() {
        return nr_doc_desp;
    }

    public void setNr_doc_desp(String nr_doc_desp) {
        this.nr_doc_desp = nr_doc_desp;
    }

    public String getDs_tipo_documento() {
        return ds_tipo_documento;
    }

    public void setDs_tipo_documento(String ds_tipo_documento) {
        this.ds_tipo_documento = ds_tipo_documento;
    }

    public String getCd_doc() {
        return cd_doc;
    }

    public void setCd_doc(String cd_doc) {
        this.cd_doc = cd_doc;
    }

    public String getNo_for() {
        return no_for;
    }

    public void setNo_for(String no_for) {
        this.no_for = no_for;
    }

    public String getCd_cpf_cgc() {
        return cd_cpf_cgc;
    }

    public void setCd_cpf_cgc(String cd_cpf_cgc) {
        this.cd_cpf_cgc = cd_cpf_cgc;
    }

    public String getDs_munic() {
        return ds_munic;
    }

    public void setDs_munic(String ds_munic) {
        this.ds_munic = ds_munic;
    }

    public String getRv_meaning() {
        return rv_meaning;
    }

    public void setRv_meaning(String rv_meaning) {
        this.rv_meaning = rv_meaning;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.no_cand);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Despesacandidato2004 other = (Despesacandidato2004) obj;
        if (!Objects.equals(this.no_cand, other.no_cand)) {
            return false;
        }
        return true;
    }
    
    
}
