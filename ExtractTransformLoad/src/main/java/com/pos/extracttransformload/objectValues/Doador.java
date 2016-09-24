/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */
@XmlRootElement
public class Doador implements Serializable{


    
    private String nomeDoador;
    private String ufDoador;
    private String cpfDoador;
    private List<Doacao> doacoes;

    public Doador() {
    }

    
    public Doador(String nomeDoador, String ufDoador, String cpfDoador, List<Doacao> doacoes) {
        this.nomeDoador = nomeDoador;
        this.ufDoador = ufDoador;
        this.cpfDoador = cpfDoador;
        this.doacoes = doacoes;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public String getUfDoador() {
        return ufDoador;
    }

    public void setUfDoador(String ufDoador) {
        this.ufDoador = ufDoador;
    }

    public String getCpfDoador() {
        return cpfDoador;
    }

    public void setCpfDoador(String cpfDoador) {
        this.cpfDoador = cpfDoador;
    }

    @XmlElement
    public List<Doacao> getDoacoes() {
        return doacoes;
    }

    public void setDoacoes(List<Doacao> doacoes) {
        this.doacoes = doacoes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nomeDoador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doador other = (Doador) obj;
        if (!Objects.equals(this.nomeDoador, other.nomeDoador)) {
            return false;
        }
        return true;
    }
    
     
}
