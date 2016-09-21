/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import com.pos.extracttransformload.entities.*;
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

@XmlRootElement
public class DadosCandidato  {
    
    private String no_cand;
    private String ds_cargo;
    private String nr_cand;
    private String no_ue;
    private String sg_ue;
    private String sg_part;
    private double vr_receitas;
    private double vr_despesas;
    private String anoCandidatura;

    public DadosCandidato() {
    }

    public DadosCandidato(String no_cand, String ds_cargo, String nr_cand, String no_ue, String sg_ue, String sg_part, double vr_receitas, double vr_despesas, String anoCandidatura) {
        this.no_cand = no_cand;
        this.ds_cargo = ds_cargo;
        this.nr_cand = nr_cand;
        this.no_ue = no_ue;
        this.sg_ue = sg_ue;
        this.sg_part = sg_part;
        this.vr_receitas = vr_receitas;
        this.vr_despesas = vr_despesas;
        this.anoCandidatura = anoCandidatura;
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

    public String getNr_cand() {
        return nr_cand;
    }

    public void setNr_cand(String nr_cand) {
        this.nr_cand = nr_cand;
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

    public String getSg_part() {
        return sg_part;
    }

    public void setSg_part(String sg_part) {
        this.sg_part = sg_part;
    }

    public double getVr_receitas() {
        return vr_receitas;
    }

    public void setVr_receitas(double vr_receitas) {
        this.vr_receitas = vr_receitas;
    }

    public double getVr_despesas() {
        return vr_despesas;
    }

    public void setVr_despesas(double vr_despesas) {
        this.vr_despesas = vr_despesas;
    }

    public String getAnoCandidatura() {
        return anoCandidatura;
    }

    public void setAnoCandidatura(String anoCandidatura) {
        this.anoCandidatura = anoCandidatura;
    }
    
}
