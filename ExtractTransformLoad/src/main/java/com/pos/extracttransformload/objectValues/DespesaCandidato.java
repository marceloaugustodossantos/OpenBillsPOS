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
public class DespesaCandidato implements Serializable{
    
    private double valorDespesa;
    private String dataDespesa;
    private String tipoDespesa;
    private String nomeFornecedor;
    private String ufFornecedor;
    private String cpfDoFornecedor;

    public DespesaCandidato(double valorDespesa, String dataDespesa, String tipoDespesa, String nomeFornecedor, String ufFornecedor, String cpfDoFornecedor) {
        this.valorDespesa = valorDespesa;
        this.dataDespesa = dataDespesa;
        this.tipoDespesa = tipoDespesa;
        this.nomeFornecedor = nomeFornecedor;
        this.ufFornecedor = ufFornecedor;
        this.cpfDoFornecedor = cpfDoFornecedor;
    }

    public double getValorDespesa() {
        return valorDespesa;
    }

    public void setValorDespesa(double valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    public String getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(String dataDespesa) {
        this.dataDespesa = dataDespesa;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getUfFornecedor() {
        return ufFornecedor;
    }

    public void setUfFornecedor(String ufFornecedor) {
        this.ufFornecedor = ufFornecedor;
    }

    public String getCpfDoFornecedor() {
        return cpfDoFornecedor;
    }

    public void setCpfDoFornecedor(String cpfDoFornecedor) {
        this.cpfDoFornecedor = cpfDoFornecedor;
    }
    
    
}
