/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.openbillsweb.controladores;

import com.pos.openbillsweb.webservicesCli.CandidatoNaoEncontradoExcetpion_Exception;
import com.pos.openbillsweb.webservicesCli.CandidatoService;
import com.pos.openbillsweb.webservicesCli.CandidatoServiceService;
import com.pos.openbillsweb.webservicesCli.DadosCompletosCandidato;
import com.pos.openbillsweb.webservicesCli.DadosResumidosCandidato;
import com.pos.openbillsweb.webservicesCli.Municipios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author marcelo
 */
@Named("gerenciadorConsulta")
@SessionScoped
public class GerenciadorConsulta implements Serializable {

    CandidatoService candidatoService;

    String nomeBusca = "";
    String anoBusca = "";
    String cidadeBusca = "";
    DadosCompletosCandidato dadosCandidato = new DadosCompletosCandidato();
    List<DadosResumidosCandidato> dadosCandidatos = new ArrayList<>();
    List<Municipios> listaMunicipios = new ArrayList<>();

    public String buscarCandidato() {
        return "candidatos.xhtml";
    }

    public String buscarDoador() {
        return "doadores.xhtml";
    }

    public String buscarCandidatosQueMaisGastaram() {
        return "candidatos_Que_Mais_Gastaram_Por_Cidade.xhtml";
    }

    public GerenciadorConsulta() {
        candidatoService = new CandidatoServiceService().getCandidatoServicePort();
    }

    public String listarCandidatosPorNome() {
        this.dadosCandidatos = candidatoService.listarCandidatosPorNome(nomeBusca);
        return "candidatos.xhtml";
    }

    public String listarMunicipiosPorNome() {
        System.out.println("Entrou No metodo!!!");
        this.listaMunicipios = candidatoService.listarMunicipiosPorNome(cidadeBusca);
        System.out.println("Pesquisou!!!");
        return "candidatos_Que_Mais_Gastaram_Por_Cidade.xhtml";
    }

    public String visualizarCandidato(String nome, String ano) {
        try {
            dadosCandidato = candidatoService.obterDadosDeCandidato(nome, ano);
        } catch (CandidatoNaoEncontradoExcetpion_Exception ex) {
            alertStatus("Nenhum candidato encontrado!");
        }
        return "candidato.xhtml";
    }

    public String visualizarMunicipio(String nomeMunicipio) {
        System.out.println("Entrou no Metodo");
        return "informacoes_de_cidade_selecionada.xhtml";
    }

    private void alertStatus(String m) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, m, "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getNomeBusca() {
        return nomeBusca;
    }

    public void setNomeBusca(String nomeBusca) {
        this.nomeBusca = nomeBusca;
    }

    public String getAnoBusca() {
        return anoBusca;
    }

    public void setAnoBusca(String anoBusca) {
        this.anoBusca = anoBusca;
    }

    public DadosCompletosCandidato getDadosCandidato() {
        return dadosCandidato;
    }

    public void setDadosCandidato(DadosCompletosCandidato dadosCandidato) {
        this.dadosCandidato = dadosCandidato;
    }

    public List<DadosResumidosCandidato> getDadosCandidatos() {
        return dadosCandidatos;
    }

    public void setDadosCandidatos(List<DadosResumidosCandidato> dadosCandidatos) {
        this.dadosCandidatos = dadosCandidatos;
    }

    public String getCidadeBusca() {
        return cidadeBusca;
    }

    public void setCidadeBusca(String cidadeBusca) {
        this.cidadeBusca = cidadeBusca;
    }

    public List<Municipios> getListaMunicipios() {
        return listaMunicipios;
    }

    public void setListaMunicipios(List<Municipios> listaMunicipios) {
        this.listaMunicipios = listaMunicipios;
    }

}
