/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */
@XmlRootElement
public class DadosResumidosCandidato implements Serializable{
    
    private String nome;
    private String anoCampanha;
    private String partido;
    private String cargo;

    public DadosResumidosCandidato() {
    }

    public DadosResumidosCandidato(String nome, String anoCampanha, String partido, String cargo) {
        this.nome = nome;
        this.anoCampanha = anoCampanha;
        this.partido = partido;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoCampanha() {
        return anoCampanha;
    }

    public void setAnoCampanha(String anoCampanha) {
        this.anoCampanha = anoCampanha;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nome);
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
        final DadosResumidosCandidato other = (DadosResumidosCandidato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }        
    
}
