/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */

@XmlRootElement
public class DadosCompletosCandidato  implements Serializable{
    
    private String no_cand;
    private String ds_cargo;
    private String nr_cand;
    private String no_ue;
    private String sg_ue;
    private String sg_part;
    private String anoCandidatura;
    private List<DespesaCandidato> despesas;
    private List<ReceitaCandidato> receitas;

    public DadosCompletosCandidato() {
    }

    public DadosCompletosCandidato(String no_cand, String ds_cargo, String nr_cand, String no_ue, String sg_ue, String sg_part, String anoCandidatura, List<DespesaCandidato> despesas, List<ReceitaCandidato> receitas) {
        this.no_cand = no_cand;
        this.ds_cargo = ds_cargo;
        this.nr_cand = nr_cand;
        this.no_ue = no_ue;
        this.sg_ue = sg_ue;
        this.sg_part = sg_part;
        this.anoCandidatura = anoCandidatura;
        this.despesas = despesas;
        this.receitas = receitas;
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

    public String getAnoCandidatura() {
        return anoCandidatura;
    }

    public void setAnoCandidatura(String anoCandidatura) {
        this.anoCandidatura = anoCandidatura;
    }

    @XmlElement
    public List<DespesaCandidato> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<DespesaCandidato> despesas) {
        this.despesas = despesas;
    }

    @XmlElement
    public List<ReceitaCandidato> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<ReceitaCandidato> receitas) {
        this.receitas = receitas;
    }

    
    
}
