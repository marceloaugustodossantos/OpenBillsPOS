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
public class Despesacomite2002 implements Serializable {
    
    @Id 
    private Integer id;
    private String sg_uf;
    private String sg_part;
    private String ds_org_desp;
    private String dt_docreceita;
    private String cd_cpf_cgc;
    private String sg_uf_fornecedor;
    private String no_for;
    private double vr_despesa;
    private String ds_titulo;

    public Despesacomite2002() {
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

    public String getDs_org_desp() {
        return ds_org_desp;
    }

    public void setDs_org_desp(String ds_org_desp) {
        this.ds_org_desp = ds_org_desp;
    }

    public String getDt_docreceita() {
        return dt_docreceita;
    }

    public void setDt_docreceita(String dt_docreceita) {
        this.dt_docreceita = dt_docreceita;
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

    public String getNo_for() {
        return no_for;
    }

    public void setNo_for(String no_for) {
        this.no_for = no_for;
    }

    public double getVr_despesa() {
        return vr_despesa;
    }

    public void setVr_despesa(double vr_despesa) {
        this.vr_despesa = vr_despesa;
    }

    public String getDs_titulo() {
        return ds_titulo;
    }

    public void setDs_titulo(String ds_titulo) {
        this.ds_titulo = ds_titulo;
    }

    
    
}
