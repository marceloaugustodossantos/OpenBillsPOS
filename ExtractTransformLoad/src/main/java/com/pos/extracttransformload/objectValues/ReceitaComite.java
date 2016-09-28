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
public class ReceitaComite implements Serializable{
 
    private String dt_receita;
    private String cd_cpf_cgc_doa;
    private String sg_uf_doador;
    private String no_doador;
    private double vr_receita;
    private String tp_recurso;

    public ReceitaComite() {
    }

    public ReceitaComite(String dt_receita, String cd_cpf_cgc_doa, String sg_uf_doador, String no_doador, double vr_receita, String tp_recurso) {
        this.dt_receita = dt_receita;
        this.cd_cpf_cgc_doa = cd_cpf_cgc_doa;
        this.sg_uf_doador = sg_uf_doador;
        this.no_doador = no_doador;
        this.vr_receita = vr_receita;
        this.tp_recurso = tp_recurso;
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
