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
            name = "buscar.receitacandidato2004.pornome", 
            query = "SELECT r FROM Receitacandidato2004 r WHERE r.no_cand LIKE UPPER(:nome)"),
    @NamedQuery(
            name = "buscar.receitacandidato2004.porDoador", 
            query = "SELECT r FROM Receitacandidato2004 r WHERE r.no_doador LIKE UPPER(:nome)")
   
})
@Entity
@XmlRootElement
public class Receitacandidato2004 implements Serializable {
    
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
    private double vr_receita;
    private String dt_receita;
    private String ds_titulo;
    private String cd_titulo;
    private String tp_recurso;
    private String tp_recurso2;
    private String no_doador;
    private String cd_cpf_cgc_doa;
    private String rv_meaning;

    public Receitacandidato2004() {
    }

    public Receitacandidato2004(String no_cand, String ds_cargo, String cd_cargo, String nr_cand, String sg_ue_sup, String no_ue, String sg_ue, String nr_part, String sg_part, double vr_receita, String dt_receita, String ds_titulo, String cd_titulo, String tp_recurso, String tp_recurso2, String no_doador, String cd_cpf_cgc_doa, String rv_meaning) {
        this.no_cand = no_cand;
        this.ds_cargo = ds_cargo;
        this.cd_cargo = cd_cargo;
        this.nr_cand = nr_cand;
        this.sg_ue_sup = sg_ue_sup;
        this.no_ue = no_ue;
        this.sg_ue = sg_ue;
        this.nr_part = nr_part;
        this.sg_part = sg_part;
        this.vr_receita = vr_receita;
        this.dt_receita = dt_receita;
        this.ds_titulo = ds_titulo;
        this.cd_titulo = cd_titulo;
        this.tp_recurso = tp_recurso;
        this.tp_recurso2 = tp_recurso2;
        this.no_doador = no_doador;
        this.cd_cpf_cgc_doa = cd_cpf_cgc_doa;
        this.rv_meaning = rv_meaning;
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

    public double getVr_receita() {
        return vr_receita;
    }

    public void setVr_receita(double vr_receita) {
        this.vr_receita = vr_receita;
    }

    public String getDt_receita() {
        return dt_receita;
    }

    public void setDt_receita(String dt_receita) {
        this.dt_receita = dt_receita;
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

    public String getNo_doador() {
        return no_doador;
    }

    public void setNo_doador(String no_doador) {
        this.no_doador = no_doador;
    }

    public String getCd_cpf_cgc_doa() {
        return cd_cpf_cgc_doa;
    }

    public void setCd_cpf_cgc_doa(String cd_cpf_cgc_doa) {
        this.cd_cpf_cgc_doa = cd_cpf_cgc_doa;
    }

    public String getRv_meaning() {
        return rv_meaning;
    }

    public void setRv_meaning(String rv_meaning) {
        this.rv_meaning = rv_meaning;
    }

    
    
}
