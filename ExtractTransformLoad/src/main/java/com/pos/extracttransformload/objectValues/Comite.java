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
public class Comite  implements Serializable{
    
    private String sg_uf;
    private String sg_part;
    private String ds_orgao;
    private List<DespesaComite> despesas;
    private List<ReceitaComite> receitas;
    
    public Comite() {
    }

    public Comite(String sg_uf, String sg_part, String ds_orgao, List<DespesaComite> despesas, List<ReceitaComite> receitas) {
        this.sg_uf = sg_uf;
        this.sg_part = sg_part;
        this.ds_orgao = ds_orgao;
        this.despesas = despesas;
        this.receitas = receitas;
    }

    public String getSg_uf() {
        return sg_uf;
    }

    public void setSg_uf(String sg_uf) {
        this.sg_uf = sg_uf;
    }

    public String getSg_part() {
        return sg_part;
    }

    public void setSg_part(String sg_part) {
        this.sg_part = sg_part;
    }

    public String getDs_orgao() {
        return ds_orgao;
    }

    public void setDs_orgao(String ds_orgao) {
        this.ds_orgao = ds_orgao;
    }

    @XmlElement
    public List<DespesaComite> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<DespesaComite> despesas) {
        this.despesas = despesas;
    }

    @XmlElement
    public List<ReceitaComite> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<ReceitaComite> receitas) {
        this.receitas = receitas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.ds_orgao);
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
        final Comite other = (Comite) obj;
        if (!Objects.equals(this.ds_orgao, other.ds_orgao)) {
            return false;
        }
        return true;
    }
    

    
    
}
