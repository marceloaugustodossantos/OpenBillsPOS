/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Kaique Candido
 */
@XmlType
public class DadosCandidatosPorMunicipio implements Serializable, Comparable<DadosCandidatosPorMunicipio> {

    private String nomeCandidato;
    private double vr_desp;
    private double totalDeGastos;

    public DadosCandidatosPorMunicipio() {
    }

    public DadosCandidatosPorMunicipio(String nomeCandidato, double vr_desp) {
        this.nomeCandidato = nomeCandidato;
        this.vr_desp = vr_desp;        
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public double getTotalDeGastos() {
        return totalDeGastos;
    }

    public void setTotalDeGastos(double totalDeGastos) {
        this.totalDeGastos = totalDeGastos;
    }

    public double getVr_desp() {
        return vr_desp;
    }

    public void setVr_desp(double vr_desp) {
        this.vr_desp = vr_desp;
    }

    public void implementarTotal(double valor) {
        this.totalDeGastos = this.totalDeGastos + valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nomeCandidato);
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
        final DadosCandidatosPorMunicipio other = (DadosCandidatosPorMunicipio) obj;
        if (!Objects.equals(this.nomeCandidato, other.nomeCandidato)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(DadosCandidatosPorMunicipio o) {
        if (this.totalDeGastos < o.totalDeGastos) {
            return 1;
        }
        if (this.totalDeGastos > o.totalDeGastos) {
            return -1;
        }
        return 0;
    }

}
