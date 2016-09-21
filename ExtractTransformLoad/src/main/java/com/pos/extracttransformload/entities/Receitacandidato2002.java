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
            name = "buscar.receitacandidato2002.pornome", 
            query = "SELECT r FROM Receitacandidato2002 r WHERE r.no_cand LIKE :nome"),
    @NamedQuery(
            name = "buscar.candidatoscommaioresdespesas.porano", 
            query = "SELECT d FROM DespesaCandidato d WHERE d.ano =:ano"),
    @NamedQuery(
            name = "buscar.candidatoscommaioresdespesas.porestadoeano", 
            query = "SELECT d FROM DespesaCandidato d WHERE d.sg_ue_superior =:estado AND d.ano =:ano"
    )
})
@Entity
@XmlRootElement
public class Receitacandidato2002 implements Serializable {
    
    @Id 
    private Integer id;
    private String sequencial_candidato;
    private String sg_uf;
    private String sg_part;
    private String ds_cargo;
    private String no_cand;
    private String nr_cand;
    private String dt_receita;
    private String cd_cpf_cgc;
    private String sg_uf_doador;
    private String no_doador;
    private double vr_receita;
    private String tp_recurso;

    public Receitacandidato2002() {
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

    public String getDt_receita() {
        return dt_receita;
    }

    public void setDt_receita(String dt_receita) {
        this.dt_receita = dt_receita;
    }

    public String getCd_cpf_cgc() {
        return cd_cpf_cgc;
    }

    public void setCd_cpf_cgc(String cd_cpf_cgc) {
        this.cd_cpf_cgc = cd_cpf_cgc;
    }

    public String getSg_uf_doador() {
        return sg_uf_doador;
    }

    public void setSg_uf_doador(String sg_uf_doador) {
        this.sg_uf_doador = sg_uf_doador;
    }

    public String getNo_doador() {
        return no_doador;
    }

    public void setNo_doador(String no_doador) {
        this.no_doador = no_doador;
    }

    public double getVr_receita() {
        return vr_receita;
    }

    public void setVr_receita(double vr_receita) {
        this.vr_receita = vr_receita;
    }

    public String getTp_recurso() {
        return tp_recurso;
    }

    public void setTp_recurso(String tp_recurso) {
        this.tp_recurso = tp_recurso;
    }

    
    
    
}
