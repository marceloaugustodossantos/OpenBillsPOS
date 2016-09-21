/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.objectValues;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marcelo
 */
@XmlType
public class ListCandidatos {
    
    private List<DadosCandidato> candidatos;

    @XmlElement
    public List<DadosCandidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<DadosCandidato> candidatos) {
        this.candidatos = candidatos;
    }
    
}
