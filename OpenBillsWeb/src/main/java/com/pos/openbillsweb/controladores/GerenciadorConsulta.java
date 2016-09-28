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
import com.pos.openbillsweb.webservicesCli.DespesaCandidato;
import com.pos.openbillsweb.webservicesCli.Doacao;
import com.pos.openbillsweb.webservicesCli.Doador;
import com.pos.openbillsweb.webservicesCli.ReceitaCandidato;
import com.pos.openbillsweb.webservicesCli.Municipios;
import com.pos.openbillsweb.webservicesCli.Partidos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.context.RequestContext;

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
    String nomeMunicipioPesquisado = "";
    String nomePartidoPesquisado = "";
    String partidoBusca = "";
    String partidoCargoBusca = "";
    int qtdePrefeitosPorPartido = 0;
    int qtdeVereadoresPorPartido = 0;
    DadosCompletosCandidato dadosCandidato = new DadosCompletosCandidato();
    List<DadosResumidosCandidato> dadosCandidatos = new ArrayList<>();
    List<Doador> doadores = new ArrayList<>();
    List<Municipios> listaMunicipios = new ArrayList<>();
    List<Partidos> listaPartidos = new ArrayList<>();
    Doador doador = new Doador();

    public String buscarCandidato() {
        return "candidatos.xhtml";
    }

    public String buscarDoador() {
        return "doadores.xhtml";
    }

    public String buscarCandidatosQueMaisGastaram() {
        return "candidatos_Que_Mais_Gastaram_Por_Cidade.xhtml";
    }

    public String buscarPartidos() {
        return "partidos.xhtml";
    }

    public GerenciadorConsulta() {
        candidatoService = new CandidatoServiceService().getCandidatoServicePort();
    }

    public String listarCandidatosPorNome() {
        this.dadosCandidatos = candidatoService.listarCandidatosPorNome(nomeBusca);
        return "candidatos.xhtml";
    }

    public String listarDoadoresPorNome() {
        this.doadores = candidatoService.listarDoadoresPorNome(nomeBusca);
        return "doadores.xhtml";
    }

    public String visualizarDoador(Doador d) {
        doador = d;
        return "doador.xhtml";
    }

    public String listarMunicipiosPorNome() {
        this.listaMunicipios = candidatoService.listarMunicipiosPorNome(cidadeBusca);
        return "candidatos_Que_Mais_Gastaram_Por_Cidade.xhtml";
    }

    public String listarPartidosPorNome() {
        this.listaPartidos = candidatoService.listarPartidosPorNome(partidoBusca);
        return "partidos.xhtml";
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
        RequestContext.getCurrentInstance().execute("buscarCandidatosPorCidade('" + nomeMunicipio + "')");
        this.nomeMunicipioPesquisado = nomeMunicipio;
        return "informacoes_de_cidade_selecionada.xhtml";
    }

    public String visualizarPartido(String nomePartido) {
        this.nomePartidoPesquisado = nomePartido;
        this.qtdePrefeitosPorPartido = candidatoService.listarQuantidadeDePrefeitosDeUmPartido(nomePartido);
        this.qtdeVereadoresPorPartido = candidatoService.listarQuantidadeDeVereadoresDeUmPartido(nomePartido);
        RequestContext.getCurrentInstance().execute("buscarQtdePrefeitosVereadoresporPartido('" + nomePartido + "')");
        return "partido.xhtml";
    }

    private void alertStatus(String m) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, m, "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public int getQtdePrefeitosPorPartido() {
        return qtdePrefeitosPorPartido;
    }

    public void setQtdePrefeitosPorPartido(int qtdePrefeitosPorPartido) {
        this.qtdePrefeitosPorPartido = qtdePrefeitosPorPartido;
    }

    public int getQtdeVereadoresPorPartido() {
        return qtdeVereadoresPorPartido;
    }

    public void setQtdeVereadoresPorPartido(int qtdeVereadoresPorPartido) {
        this.qtdeVereadoresPorPartido = qtdeVereadoresPorPartido;
    }

    public String getNomeBusca() {
        return nomeBusca;
    }

    public void setNomeBusca(String nomeBusca) {
        this.nomeBusca = nomeBusca;
    }

    public String getNomePartidoPesquisado() {
        return nomePartidoPesquisado;
    }

    public void setNomePartidoPesquisado(String nomePartidoPesquisado) {
        this.nomePartidoPesquisado = nomePartidoPesquisado;
    }

    public String getPartidoBusca() {
        return partidoBusca;
    }

    public void setPartidoBusca(String partidoBusca) {
        this.partidoBusca = partidoBusca;
    }

    public String getAnoBusca() {
        return anoBusca;
    }

    public void setAnoBusca(String anoBusca) {
        this.anoBusca = anoBusca;
    }

    public String getPartidoCargoBusca() {
        return partidoCargoBusca;
    }

    public void setPartidoCargoBusca(String partidoCargoBusca) {
        this.partidoCargoBusca = partidoCargoBusca;
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

    public List<Doador> getDoadores() {
        return doadores;
    }

    public void setDoadores(List<Doador> doadores) {
        this.doadores = doadores;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public List<Partidos> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(List<Partidos> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public int getPorcentagemDoacao(double valorDoado) {
        double total = caucularValorTotalDoado();
        return (int) ((valorDoado * 100) / total);

    }

    public int getPorcentagemDespesa(double valor) {
        double total = caucularValorTotalDeDespesas();
        return (int) ((valor * 100) / total);

    }

    public int getPorcentagemReceita(double valor) {
        double total = caucularValorTotalDeReceitas();
        return (int) ((valor * 100) / total);

    }

    public double caucularValorTotalDoado() {
        double total = 0;
        for (Doacao d : doador.getDoacoes()) {
            total += d.getValorDoado();
        }
        return total;
    }

    public double caucularValorTotalDeDespesas() {
        double total = 0;
        for (DespesaCandidato d : dadosCandidato.getDespesas()) {
            total += d.getValorDespesa();
        }
        return total;
    }

    public double caucularValorTotalDeReceitas() {
        double total = 0;
        for (ReceitaCandidato r : dadosCandidato.getReceitas()) {
            total += r.getValorReceita();
        }
        return total;
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

    public String getNomeMunicipioPesquisado() {
        return nomeMunicipioPesquisado;
    }

    public void setNomeMunicipioPesquisado(String nomeMunicipioPesquisado) {
        this.nomeMunicipioPesquisado = nomeMunicipioPesquisado;
    }

}
