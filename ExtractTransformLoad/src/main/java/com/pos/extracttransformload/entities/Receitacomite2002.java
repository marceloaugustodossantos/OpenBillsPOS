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
            name = "buscar.candidatoscommaioresdespesas.porestado", 
            query = "SELECT d FROM DespesaCandidato d WHERE d.sg_ue_superior =:estado"),
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
public class Receitacomite2002 implements Serializable {
    
    @Id 
    private Integer id;
    private String sg_uf;
    private String sg_part;
    private String ds_orgao;
    private String dt_receita;
    private String cd_cpf_cgc_doa;
    private String sg_uf_doador;
    private String no_doador;
    private double vr_receita;
    private String tp_recurso;

    public Receitacomite2002() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDs_orgao() {
        return ds_orgao;
    }

    public void setDs_orgao(String ds_orgao) {
        this.ds_orgao = ds_orgao;
    }

    public String getDt_receita() {
        return dt_receita;
    }

    public void setDt_receita(String dt_receita) {
        this.dt_receita = dt_receita;
    }

    public String getCd_cpf_cgc_doa() {
        return cd_cpf_cgc_doa;
    }

    public void setCd_cpf_cgc_doa(String cd_cpf_cgc_doa) {
        this.cd_cpf_cgc_doa = cd_cpf_cgc_doa;
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
