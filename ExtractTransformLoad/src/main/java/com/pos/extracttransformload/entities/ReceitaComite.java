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
public class ReceitaComite implements Serializable {
   
    @Id @GeneratedValue
    private long id;
    private String ano;                 //- ANO - Ano da campanha
    private String ds_orgao;            //- DS_ORGAO - Tipo de comitê;
    private String nr_partido;          //- NR_PARTIDO - Número do partido;
    private String sg_partido;          //- SG_PARTIDO - Sigla do partido;
    private String sg_ue_superior;      //- SG_UE_SUPERIOR - Unidade da federação;
    private String nm_ue;               //- NM_UE - Nome da unidade da federação;
    private String sg_ue;               //- SG_UE - Código do município;
    private String nr_cnpj;             //- NR_CNPJ - CNPJ de campanha;
    private String vr_receita;          //- VR_RECEITA - Valor da receita;
    private String dt_receita;          //- DT_RECEITA - Data da receita;
    private String ds_titulo;           //- DS_TITULO - Tipo de receita;
    private String cd_titulo;           //- CD_TITULO - Código do tipo de receita;
    private String ds_esp_recurso;      //- DS_ESP_RECURSO - Tipo de recurso (Em espécie, Cheque, Estimado, não informado);
    private String cd_esp_recurso;      //- CD_ESP_RECURSO - Código do tipo de recurso;
    private String nm_doador;           //- NM_DOADOR - Nome do doador;
    private String cd_cpf_cnpj_doador;  //- CD_CPF_CNPJ_DOADOR - CPF/CNPJ doador;
    private String sg_ue_superior1;     //- SG_UE_SUPERIOR1 - Unidade da federação do doador;
    private String nm_ue1;              //- NM_UE1 - Nome da unidade da federação;
    private String sg_ue1;              //- SG_UE1 - Código do município;
    private String situacaocadastral;   //- SITUACAOCADASTRAL - Batimento Receita Federal do Brasil;
    private String nm_membro;           //- NM_MEMBRO - Nome do presidente do comitê financeiro;
    private String nr_cpf;              //- NR_CPF - CPF do presidente do comitê.

//    "Data e hora";"UF";"Tipo comite";"Sigla Partido";"Tipo do documento";"Número do documento";
//    "CPF/CNPJ do doador";"Nome do doador";"Data da receita";"Valor receita";"Tipo receita";
//    "Fonte recurso";"Espécie recurso";"Descrição da receita" 

    public ReceitaComite() {
    }

    public ReceitaComite(String ano, String ds_orgao, String nr_partido, String sg_partido, String sg_ue_superior, 
            String nm_ue, String sg_ue, String nr_cnpj, String vr_receita, String dt_receita, String ds_titulo, 
            String cd_titulo, String ds_esp_recurso, String cd_esp_recurso, String nm_doador, String cd_cpf_cnpj_doador, 
            String sg_ue_superior1, String nm_ue1, String sg_ue1, String situacaocadastral, String nm_membro, String nr_cpf) {
        this.ano = ano;
        this.ds_orgao = ds_orgao;
        this.nr_partido = nr_partido;
        this.sg_partido = sg_partido;
        this.sg_ue_superior = sg_ue_superior;
        this.nm_ue = nm_ue;
        this.sg_ue = sg_ue;
        this.nr_cnpj = nr_cnpj;
        this.vr_receita = vr_receita;
        this.dt_receita = dt_receita;
        this.ds_titulo = ds_titulo;
        this.cd_titulo = cd_titulo;
        this.ds_esp_recurso = ds_esp_recurso;
        this.cd_esp_recurso = cd_esp_recurso;
        this.nm_doador = nm_doador;
        this.cd_cpf_cnpj_doador = cd_cpf_cnpj_doador;
        this.sg_ue_superior1 = sg_ue_superior1;
        this.nm_ue1 = nm_ue1;
        this.sg_ue1 = sg_ue1;
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

    public String getVr_receita() {
        return vr_receita;
    }

    public void setVr_receita(String vr_receita) {
        this.vr_receita = vr_receita;
    }

    public String getDt_receita() {
        return dt_receita;
    }

    public void setDt_receita(String dt_receita) {
        this.dt_receita = dt_receita;
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

    public String getNm_doador() {
        return nm_doador;
    }

    public void setNm_doador(String nm_doador) {
        this.nm_doador = nm_doador;
    }

    public String getCd_cpf_cnpj_doador() {
        return cd_cpf_cnpj_doador;
    }

    public void setCd_cpf_cnpj_doador(String cd_cpf_cnpj_doador) {
        this.cd_cpf_cnpj_doador = cd_cpf_cnpj_doador;
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
