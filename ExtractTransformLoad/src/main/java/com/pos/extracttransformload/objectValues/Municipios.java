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
public class Municipios implements Serializable {

    private String nomeMunicipio;

    public Municipios() {
    }

    public Municipios(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nomeMunicipio);
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
        final Municipios other = (Municipios) obj;
        if (!Objects.equals(this.nomeMunicipio, other.nomeMunicipio)) {
            return false;
        }
        return true;
    }

}
