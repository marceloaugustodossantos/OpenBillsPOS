/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Kaique Candido
 */
@XmlType
public class Partidos implements Serializable {

    private String nomePartido;

    public Partidos() {
    }

    public Partidos(String nomePartido) {
        this.nomePartido = nomePartido;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) {
        this.nomePartido = nomePartido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.nomePartido);
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
        final Partidos other = (Partidos) obj;
        if (!Objects.equals(this.nomePartido, other.nomePartido)) {
            return false;
        }
        return true;
    }

}
