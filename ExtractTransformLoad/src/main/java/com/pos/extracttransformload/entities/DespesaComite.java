/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author marcelo
 */
@Entity
public class DespesaComite implements Serializable {
    
    @Id @GeneratedValue
    private long id;
    private String ano;                     //- ANO - Ano da campanha
    private String ds_orgao;                //- DS_ORGAO - Tipo de comitê;
    private String nr_partido;              //- NR_PARTIDO - Número do partido;
    private String sg_partido;              //- SG_PARTIDO - Sigla do partido;
    private String sg_ue_superior;          //- SG_UE_SUPERIOR - Unidade da federação;
    private String nm_ue;                   //- NM_UE - Nome da unidade da federação;
    private String sg_ue;                   //- SG_UE - Código do município;
    private String nr_cnpj;                 //- NR_CNPJ - CNPJ de campanha;
    private String vr_despesa;              //- VR_DESPESA - Valor da despesa;
    private String dt_despesa;              //- DT_DESPESA - Data da despesa;
    private String ds_titulo;               //- DS_TITULO - Tipo de despesa;
    private String cd_titulo;               //- CD_TITULO - Código do tipo de despesa;
    private String ds_esp_recurso;          //- DS_ESP_RECURSO - Forma de pagamento (EM ESPÉCIE, CHEQUE, ESTIMADO, NÃO INFORMADO);
    private String cd_esp_recurso;          //- CD_ESP_RECURSO - Código da forma de pagamento;
    private String ds_nr_documento;         //- DS_NR_DOCUMENTO - Número do documento;
    private String ds_tipo_documento;       //- DS_TIPO_DOCUMENTO - Tipo de documento (Nota Fiscal, Recibo, Outros);
    private String cd_tipo_documento;       //- CD_TIPO_DOCUMENTO - Código do tipo de documento;
    private String nm_fornecedor;           //- NM_FORNECEDOR - Nome do fornecedor;
    private String cd_cpf_cnpj_fornecedor;  //- CD_CPF_CNPJ_FORNECEDOR - CPF/CNPJ do fornecedor;
    private String sg_ue_superior1;         //- SG_UE_SUPERIOR1 - Unidade da federação do fornecedor;
    private String nm_ue1;                  //- NM_UE1 - Nome da unidade da federação do fornecedor;
    private String sg_ue1;                  //- SG_UE1 - Código do município do fornecedor;
    private String no_ue;                   //- NO_UE - Unidade da federação do fornecedor;
    private String situacaocadastral;       //- SITUACAOCADASTRAL - Batimento Receita Federal do Brasil;
    private String nm_membro;               //- NM_MEMBRO - Nome do presidente do comitê;
    private String nr_cpf;                  //- NR_CPF - Número do CPF do presidente do comitê.

    //"Data e hora";"UF";"Tipo comite";"Sigla Partido";"Tipo do documento";"Número do documento";
//    "CPF/CNPJ do fornecedor";"Nome do fornecedor";"Data da despesa";"Valor despesa";"Tipo despesa";
//    "Fonte recurso";"Espécie recurso";"Descrição da despesa"

    public DespesaComite() {
    }

    public DespesaComite(String ano, String ds_orgao, String nr_partido, String sg_partido, String sg_ue_superior, String nm_ue, 
            String sg_ue, String nr_cnpj, String vr_despesa, String dt_despesa, String ds_titulo, String cd_titulo, 
            String ds_esp_recurso, String cd_esp_recurso, String ds_nr_documento, String ds_tipo_documento, 
            String cd_tipo_documento, String nm_fornecedor, String cd_cpf_cnpj_fornecedor, String sg_ue_superior1, 
            String nm_ue1, String sg_ue1, String no_ue, String situacaocadastral, String nm_membro, String nr_cpf) {
        this.ano = ano;
        this.ds_orgao = ds_orgao;
        this.nr_partido = nr_partido;
        this.sg_partido = sg_partido;
        this.sg_ue_superior = sg_ue_superior;
        this.nm_ue = nm_ue;
        this.sg_ue = sg_ue;
        this.nr_cnpj = nr_cnpj;
        this.vr_despesa = vr_despesa;
        this.dt_despesa = dt_despesa;
        this.ds_titulo = ds_titulo;
        this.cd_titulo = cd_titulo;
        this.ds_esp_recurso = ds_esp_recurso;
        this.cd_esp_recurso = cd_esp_recurso;
        this.ds_nr_documento = ds_nr_documento;
        this.ds_tipo_documento = ds_tipo_documento;
        this.cd_tipo_documento = cd_tipo_documento;
        this.nm_fornecedor = nm_fornecedor;
        this.cd_cpf_cnpj_fornecedor = cd_cpf_cnpj_fornecedor;
        this.sg_ue_superior1 = sg_ue_superior1;
        this.nm_ue1 = nm_ue1;
        this.sg_ue1 = sg_ue1;
        this.no_ue = no_ue;
        this.situacaocadastral = situacaocadastral;
        this.nm_membro = nm_membro;
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

    public String getDs_orgao() {
        return ds_orgao;
    }

    public void setDs_orgao(String ds_orgao) {
        this.ds_orgao = ds_orgao;
    }

    public String getNr_partido() {
        return nr_partido;
    }

    public void setNr_partido(String nr_partido) {
        this.nr_partido = nr_partido;
    }

    public String getSg_partido() {
        return sg_partido;
    }

    public void setSg_partido(String sg_partido) {
        this.sg_partido = sg_partido;
    }

    public String getSg_ue_superior() {
        return sg_ue_superior;
    }

    public void setSg_ue_superior(String sg_ue_superior) {
        this.sg_ue_superior = sg_ue_superior;
    }

    public String getNm_ue() {
        return nm_ue;
    }

    public void setNm_ue(String nm_ue) {
        this.nm_ue = nm_ue;
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

    public String getCd_titulo() {
        return cd_titulo;
    }

    public void setCd_titulo(String cd_titulo) {
        this.cd_titulo = cd_titulo;
    }

    public String getDs_esp_recurso() {
        return ds_esp_recurso;
    }

    public void setDs_esp_recurso(String ds_esp_recurso) {
        this.ds_esp_recurso = ds_esp_recurso;
    }

    public String getCd_esp_recurso() {
        return cd_esp_recurso;
    }

    public void setCd_esp_recurso(String cd_esp_recurso) {
        this.cd_esp_recurso = cd_esp_recurso;
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

    public String getCd_tipo_documento() {
        return cd_tipo_documento;
    }

    public void setCd_tipo_documento(String cd_tipo_documento) {
        this.cd_tipo_documento = cd_tipo_documento;
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

    public String getNm_ue1() {
        return nm_ue1;
    }

    public void setNm_ue1(String nm_ue1) {
        this.nm_ue1 = nm_ue1;
    }

    public String getSg_ue1() {
        return sg_ue1;
    }

    public void setSg_ue1(String sg_ue1) {
        this.sg_ue1 = sg_ue1;
    }

    public String getNo_ue() {
        return no_ue;
    }

    public void setNo_ue(String no_ue) {
        this.no_ue = no_ue;
    }

    public String getSituacaocadastral() {
        return situacaocadastral;
    }

    public void setSituacaocadastral(String situacaocadastral) {
        this.situacaocadastral = situacaocadastral;
    }

    public String getNm_membro() {
        return nm_membro;
    }

    public void setNm_membro(String nm_membro) {
        this.nm_membro = nm_membro;
    }

    public String getNr_cpf() {
        return nr_cpf;
    }

    public void setNr_cpf(String nr_cpf) {
        this.nr_cpf = nr_cpf;
    }
    
}
