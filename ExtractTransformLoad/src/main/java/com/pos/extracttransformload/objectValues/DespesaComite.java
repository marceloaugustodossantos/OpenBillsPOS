/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marcelo
 */
@XmlType
public class DespesaComite implements Serializable{
    
    private String no_for;
    private double vr_despesa;
    private String ds_titulo;
    private String dt_docreceita;
    private String cd_cpf_cgc;
    private String sg_uf_fornecedor;


    public DespesaComite() {
    }

    public DespesaComite(String no_for, double vr_despesa, String ds_titulo, String dt_docreceita, String cd_cpf_cgc, String sg_uf_fornecedor) {
        this.no_for = no_for;
        this.vr_despesa = vr_despesa;
        this.ds_titulo = ds_titulo;
        this.dt_docreceita = dt_docreceita;
        this.cd_cpf_cgc = cd_cpf_cgc;
        this.sg_uf_fornecedor = sg_uf_fornecedor;
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
