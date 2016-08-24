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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */
@NamedQueries({
    @NamedQuery(
            name = "buscar.candidatoscommaioresreceitas.porestado", 
            query = "SELECT r FROM ReceitaCandidato r WHERE r.sg_ue_superior =:estado ORDER BY r.vr_receita DESC"),
    @NamedQuery(
            name = "buscar.candidatoscommaioresreceitas.porano", 
            query = "SELECT r FROM ReceitaCandidato r WHERE r.ano =:ano"),
    @NamedQuery(
            name = "buscar.candidatoscommaioresreceitas.porestadoeano", 
            query = "SELECT r FROM ReceitaCandidato r WHERE r.sg_ue_superior =:estado AND r.ano =:ano"
    )
})
@Entity
@XmlRootElement
public class ReceitaCandidato implements Serializable {
     
    @Id @GeneratedValue
    private long id;
    private String ano;                     //- ANO - Ano da campanha
    private String sequencial_candidato;    //- SEQUENCIAL_CANDIDATO - Número Sequencial do Candidato
    private String nm_candidato;            //- NM_CANDIDATO - Nome do candidato;    
    private String sexo;                    //- SEXO - Sexo do(a) candidato(a);
    private String ds_cargo;                //- DS_CARGO - Descrição do cargo;
    private String nr_candidato;            //- NR_CANDIDATO - Número do candidato;
    private String sg_ue_superior;          //- SG_UE_SUPERIOR - Unidade da federação do candidato;
    private String sg_ue;                   //- SG_UE - Código do município;
    private String ds_nr_titulo_eleitor;    //- DS_NR_TITULO_ELEITOR - Título eleitoral;
    private String cd_num_cpf;              //- CD_NUM_CPF - CPF do candidato;
    private String cd_num_cnpj;             //- CD_NUM_CNPJ - CNPJ de campanha;
    private String nr_partido;              //- NR_PARTIDO - Número do partido;
    private String sg_partido;              //- SG_PARTIDO - Sigla do partido;
    private double vr_receita;              //- VR_RECEITA - Valor da receita;
    private String dt_receita;              //- DT_RECEITA - Data da receita;
    private String ds_titulo;               //- DS_TITULO - Tipo de receita;
    private String cd_titulo;               //- CD_TITULO - Código do tipo de receita;
    private String ds_esp_recurso;          //- DS_ESP_RECURSO - Tipo de recurso (Em espécie, Cheque, Estimado, não informado);
    private String nm_doador;               //- NM_DOADOR - Nome do doador;
    private String cd_cpf_cnpj_doador;      //- CD_CPF_CNPJ_DOADOR - CPF/CNPJ doador;
    private String sg_ue_superior1;         //- SG_UE_SUPERIOR1 - Unidade da federação do doador;
    private String nm_ue1;                  //- NM_UE1 - Nome da unidade da federação;
    private String sg_ue1;                  //- SG_UE1 - Código do município;
    private String situacaocadastral;       //- SITUACAOCADASTRAL - Batimento Receita Federal do Brasil;
    private String nm_adm;                  //- NM_ADM - Nome do administrador financeiro de campanha;
    private String cd_cpf_adm;              //- CD_CPF_ADM - CPF do administrador financeiro de campanha.
    
    public ReceitaCandidato() {
    }

    public ReceitaCandidato(String ano, String sequencial_candidato, String nm_candidato, String sexo, String ds_cargo, 
            String nr_candidato, String sg_ue_superior, String sg_ue, String ds_nr_titulo_eleitor, String cd_num_cpf, 
            String cd_num_cnpj, String nr_partido, String sg_partido, double vr_receita, String dt_receita, 
            String ds_titulo, String cd_titulo, String ds_esp_recurso, String nm_doador, String cd_cpf_cnpj_doador, 
            String sg_ue_superior1, String nm_ue1, String sg_ue1, String situacaocadastral, String nm_adm, String cd_cpf_adm) {
        this.ano = ano;
        this.sequencial_candidato = sequencial_candidato;
        this.nm_candidato = nm_candidato;
        this.sexo = sexo;
        this.ds_cargo = ds_cargo;
        this.nr_candidato = nr_candidato;
        this.sg_ue_superior = sg_ue_superior;
        this.sg_ue = sg_ue;
        this.ds_nr_titulo_eleitor = ds_nr_titulo_eleitor;
        this.cd_num_cpf = cd_num_cpf;
        this.cd_num_cnpj = cd_num_cnpj;
        this.nr_partido = nr_partido;
        this.sg_partido = sg_partido;
        this.vr_receita = vr_receita;
        this.dt_receita = dt_receita;
        this.ds_titulo = ds_titulo;
        this.cd_titulo = cd_titulo;
        this.ds_esp_recurso = ds_esp_recurso;
        this.nm_doador = nm_doador;
        this.cd_cpf_cnpj_doador = cd_cpf_cnpj_doador;
        this.sg_ue_superior1 = sg_ue_superior1;
        this.nm_ue1 = nm_ue1;
        this.sg_ue1 = sg_ue1;
        this.situacaocadastral = situacaocadastral;
        this.nm_adm = nm_adm;
        this.cd_cpf_adm = cd_cpf_adm;
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

    public String getSequencial_candidato() {
        return sequencial_candidato;
    }

    public void setSequencial_candidato(String sequencial_candidato) {
        this.sequencial_candidato = sequencial_candidato;
    }

    public String getNm_candidato() {
        return nm_candidato;
    }

    public void setNm_candidato(String nm_candidato) {
        this.nm_candidato = nm_candidato;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDs_cargo() {
        return ds_cargo;
    }

    public void setDs_cargo(String ds_cargo) {
        this.ds_cargo = ds_cargo;
    }

    public String getNr_candidato() {
        return nr_candidato;
    }

    public void setNr_candidato(String nr_candidato) {
        this.nr_candidato = nr_candidato;
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

    public String getDs_nr_titulo_eleitor() {
        return ds_nr_titulo_eleitor;
    }

    public void setDs_nr_titulo_eleitor(String ds_nr_titulo_eleitor) {
        this.ds_nr_titulo_eleitor = ds_nr_titulo_eleitor;
    }

    public String getCd_num_cpf() {
        return cd_num_cpf;
    }

    public void setCd_num_cpf(String cd_num_cpf) {
        this.cd_num_cpf = cd_num_cpf;
    }

    public String getCd_num_cnpj() {
        return cd_num_cnpj;
    }

    public void setCd_num_cnpj(String cd_num_cnpj) {
        this.cd_num_cnpj = cd_num_cnpj;
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

    public double getVr_receita() {
        return vr_receita;
    }

    public void setVr_receita(double vr_receita) {
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

    public String getNm_adm() {
        return nm_adm;
    }

    public void setNm_adm(String nm_adm) {
        this.nm_adm = nm_adm;
    }

    public String getCd_cpf_adm() {
        return cd_cpf_adm;
    }

    public void setCd_cpf_adm(String cd_cpf_adm) {
        this.cd_cpf_adm = cd_cpf_adm;
    }
    
    
}
