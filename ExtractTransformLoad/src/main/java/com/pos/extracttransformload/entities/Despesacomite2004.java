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
            name = "buscar.despesascomite2004.porestado", 
            query = "SELECT d FROM Despesacomite2004 d WHERE d.sg_ue_sup =:estado")
})
@Entity
@XmlRootElement
public class Despesacomite2004 implements Serializable {
    
    @Id 
    private Integer id;
    private String ds_orgao;
    private String nr_part;
    private String sg_part;
    private String sg_ue_sup;
    private String no_ue;
    private String sg_ue;
    private double vr_despesa;
    private String dt_doc_desp;
    private String ds_titulo;
    private double cd_titulo;
    private String tp_recurso;
    private String tp_recurso2;
    private String nr_doc_desp;
    private String ds_tipo_documento;
    private String cd_doc;
    private String no_for;
    private String cd_cpf_cgc;
    private String rv_meaning;

    public Despesacomite2004() {
    }

    public Despesacomite2004(String ds_orgao, String nr_part, String sg_part, String sg_ue_sup, String no_ue, String sg_ue, double vr_despesa, String dt_doc_desp, String ds_titulo, double cd_titulo, String tp_recurso, String tp_recurso2, String nr_doc_desp, String ds_tipo_documento, String cd_doc, String no_for, String cd_cpf_cgc, String rv_meaning) {
        this.ds_orgao = ds_orgao;
        this.nr_part = nr_part;
        this.sg_part = sg_part;
        this.sg_ue_sup = sg_ue_sup;
        this.no_ue = no_ue;
        this.sg_ue = sg_ue;
        this.vr_despesa = vr_despesa;
        this.dt_doc_desp = dt_doc_desp;
        this.ds_titulo = ds_titulo;
        this.cd_titulo = cd_titulo;
        this.tp_recurso = tp_recurso;
        this.tp_recurso2 = tp_recurso2;
        this.nr_doc_desp = nr_doc_desp;
        this.ds_tipo_documento = ds_tipo_documento;
        this.cd_doc = cd_doc;
        this.no_for = no_for;
        this.cd_cpf_cgc = cd_cpf_cgc;
        this.rv_meaning = rv_meaning;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDs_orgao() {
        return ds_orgao;
    }

    public void setDs_orgao(String ds_orgao) {
        this.ds_orgao = ds_orgao;
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

    public double getCd_titulo() {
        return cd_titulo;
    }

    public void setCd_titulo(double cd_titulo) {
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

    public String getRv_meaning() {
        return rv_meaning;
    }

    public void setRv_meaning(String rv_meaning) {
        this.rv_meaning = rv_meaning;
    }

    
    
}
