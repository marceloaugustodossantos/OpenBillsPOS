/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcelo
 */
@Entity
public class DespesaCandidato implements Serializable {
    
    @Id @GeneratedValue
    private long id;
    private String ano;                     //- ANO - Ano da campanha
    private long sequencial_candidato;      //- SEQUENCIAL_CANDIDATO - Número Sequencial do Candidato
    private String no_cand;                 //- NO_CAND - Nome do candidato;
    private String ds_cargo;                //- DS_CARGO - Descrição do cargo;
    private String nr_cand;                 //- NR_CAND - Número do candidato;
    private String sg_ue_superior;          //- SG_UE_SUPERIOR - Unidade da federação;                      
    private String sg_ue;                   //- SG_UE - Código do município;
    private String nr_cnpj;                 //- NR_CNPJ - CNPJ de campanha;
    private String nr_partido;              //- NR_PARTIDO - Número do partido;
    private String sg_part;                 //- SG_PART - Sigla do partido;
    private String vr_despesa;              //- VR_DESPESA - Valor da despesa;
    private String dt_despesa;              //- DT_DESPESA - Data da despesa;
    private String ds_titulo;               //- DS_TITULO - Tipo de despesa;
    private String ds_esp_recurso;          //- DS_ESP_RECURSO - Forma de pagamento (EM ESPÉCIE, CHEQUE, ESTIMADO, NÃO INFORMADO);
    private String ds_nr_documento;         //- DS_NR_DOCUMENTO - Número do documento;
    private String ds_tipo_documento;       //- DS_TIPO_DOCUMENTO - Tipo de documento (Nota Fiscal, Recibo, Outros);
    private String nm_fornecedor;           //- NM_FORNECEDOR - Nome do fornecedor;
    private String cd_cpf_cnpj_fornecedor;  //- CD_CPF_CNPJ_FORNECEDOR - CPF/CNPJ do fornecedor;
    private String sg_ue_superior1;         //- SG_UE_SUPERIOR1 - Unidade da federação do fornecedor;
    private String sg_ue1;                  //- SG_UE1 - Código do município do fornecedor;
    private String situacaocadastral;       //- SITUACAOCADASTRAL - Batimento Receita Federal do Brasil;   
    private String nm_adm;                  //- NM_ADM - Nome do administrador financeiro de campanha;
    private String nr_cpf;                  //- NR_CPF - Número do CPF do administrador financeiro de campanha.

    
//    "Data e hora";"Sequencial Candidato";"UF";"Sigla Partido";"Número candidato";"Cargo";
//    "Nome candidato";"CPF do candidato";"Entrega em conjunto?";"Tipo do documento";
//    "Número do documento";"CPF/CNPJ do fornecedor";"Nome do fornecedor";"Data da despesa";
//    "Valor despesa";"Tipo despesa";"Fonte recurso";"Espécie recurso";"Descriçao da despesa"

    public DespesaCandidato() {
    }

    public DespesaCandidato(String ano, long sequencial_candidato, String no_cand, String ds_cargo, String nr_cand, 
            String sg_ue_superior, String sg_ue, String nr_cnpj, String nr_partido, String sg_part, String vr_despesa, 
            String dt_despesa, String ds_titulo, String ds_esp_recurso, String ds_nr_documento, 
            String ds_tipo_documento, String nm_fornecedor, String cd_cpf_cnpj_fornecedor, 
            String sg_ue_superior1, String sg_ue1, String situacaocadastral, String nm_adm, String nr_cpf) {

        this.ano = ano;
        this.sequencial_candidato = sequencial_candidato;
        this.no_cand = no_cand;
        this.ds_cargo = ds_cargo;
        this.nr_cand = nr_cand;
        this.sg_ue_superior = sg_ue_superior;
        this.sg_ue = sg_ue;
        this.nr_cnpj = nr_cnpj;
        this.nr_partido = nr_partido;
        this.sg_part = sg_part;
        this.vr_despesa = vr_despesa;
        this.dt_despesa = dt_despesa;
        this.ds_titulo = ds_titulo;
        this.ds_esp_recurso = ds_esp_recurso;
        this.ds_nr_documento = ds_nr_documento;
        this.ds_tipo_documento = ds_tipo_documento;
        this.nm_fornecedor = nm_fornecedor;
        this.cd_cpf_cnpj_fornecedor = cd_cpf_cnpj_fornecedor;
        this.sg_ue_superior1 = sg_ue_superior1;
        this.sg_ue1 = sg_ue1;
        this.situacaocadastral = situacaocadastral;
        this.nm_adm = nm_adm;
        this.nr_cpf = nr_cpf;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public long getSequencial_candidato() {
        return sequencial_candidato;
    }

    public void setSequencial_candidato(long sequencial_candidato) {
        this.sequencial_candidato = sequencial_candidato;
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

    public String getSg_ue_superior() {
        return sg_ue_superior;
    }

    public void setSg_ue_superior(String sg_ue_superior) {
        this.sg_ue_superior = sg_ue_superior;
    }

    public String getSg_ue() {
        return sg_ue;
    }

    public void setSg_ue(String sg_ue) {
        this.sg_ue = sg_ue;
    }

    public String getNr_cnpj() {
        return nr_cnpj;
    }

    public void setNr_cnpj(String nr_cnpj) {
        this.nr_cnpj = nr_cnpj;
    }

    public String getNr_partido() {
        return nr_partido;
    }

    public void setNr_partido(String nr_partido) {
        this.nr_partido = nr_partido;
    }

    public String getSg_part() {
        return sg_part;
    }

    public void setSg_part(String sg_part) {
        this.sg_part = sg_part;
    }

    public String getVr_despesa() {
        return vr_despesa;
    }

    public void setVr_despesa(String vr_despesa) {
        this.vr_despesa = vr_despesa;
    }

    public String getDt_despesa() {
        return dt_despesa;
    }

    public void setDt_despesa(String dt_despesa) {
        this.dt_despesa = dt_despesa;
    }

    public String getDs_titulo() {
        return ds_titulo;
    }

    public void setDs_titulo(String ds_titulo) {
        this.ds_titulo = ds_titulo;
    }

    public String getDs_esp_recurso() {
        return ds_esp_recurso;
    }

    public void setDs_esp_recurso(String ds_esp_recurso) {
        this.ds_esp_recurso = ds_esp_recurso;
    }

    public String getDs_nr_documento() {
        return ds_nr_documento;
    }

    public void setDs_nr_documento(String ds_nr_documento) {
        this.ds_nr_documento = ds_nr_documento;
    }

    public String getDs_tipo_documento() {
        return ds_tipo_documento;
    }

    public void setDs_tipo_documento(String ds_tipo_documento) {
        this.ds_tipo_documento = ds_tipo_documento;
    }

    public String getNm_fornecedor() {
        return nm_fornecedor;
    }

    public void setNm_fornecedor(String nm_fornecedor) {
        this.nm_fornecedor = nm_fornecedor;
    }

    public String getCd_cpf_cnpj_fornecedor() {
        return cd_cpf_cnpj_fornecedor;
    }

    public void setCd_cpf_cnpj_fornecedor(String cd_cpf_cnpj_fornecedor) {
        this.cd_cpf_cnpj_fornecedor = cd_cpf_cnpj_fornecedor;
    }

    public String getSg_ue_superior1() {
        return sg_ue_superior1;
    }

    public void setSg_ue_superior1(String sg_ue_superior1) {
        this.sg_ue_superior1 = sg_ue_superior1;
    }

    public String getSg_ue1() {
        return sg_ue1;
    }

    public void setSg_ue1(String sg_ue1) {
        this.sg_ue1 = sg_ue1;
    }

    public String getSituacaocadastral() {
        return situacaocadastral;
    }

    public void setSituacaocadastral(String situacaocadastral) {
        this.situacaocadastral = situacaocadastral;
    }

    public String getNm_adm() {
        return nm_adm;
    }

    public void setNm_adm(String nm_adm) {
        this.nm_adm = nm_adm;
    }

    public String getNr_cpf() {
        return nr_cpf;
    }

    public void setNr_cpf(String nr_cpf) {
        this.nr_cpf = nr_cpf;
    }
    
    
}
