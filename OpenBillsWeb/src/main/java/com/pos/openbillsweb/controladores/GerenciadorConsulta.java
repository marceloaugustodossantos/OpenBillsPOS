/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.openbillsweb.controladores;

import com.pos.openbillsweb.webserviceComiteCli.Comite;
import com.pos.openbillsweb.webserviceComiteCli.ComiteService;
import com.pos.openbillsweb.webserviceComiteCli.ComiteService_Service;
import com.pos.openbillsweb.webserviceComiteCli.DespesaComite;
import com.pos.openbillsweb.webserviceComiteCli.ReceitaComite;
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
    ComiteService comiteService;
    
    String nomeBusca = "";
    String anoBusca = "";
    String cidadeBusca = "";
    String estadoBusca = "";
    String nomeMunicipioPesquisado = "";
    DadosCompletosCandidato dadosCandidato = new DadosCompletosCandidato();
    List<DadosResumidosCandidato> dadosCandidatos = new ArrayList<>();
    List<Doador> doadores = new ArrayList<>();
    List<Comite> comites = new ArrayList<>();
    Comite comite = new Comite();
    Doador doador = new Doador();
    
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
    public String buscarInformacoesDeComites() {
        return "comites.xhtml";
    }

    public GerenciadorConsulta() {
        candidatoService = new CandidatoServiceService().getCandidatoServicePort();
        comiteService = new ComiteService_Service().getComiteServicePort();
    }

    public String listarCandidatosPorNome() {
        this.dadosCandidatos = candidatoService.listarCandidatosPorNome(nomeBusca);
        return "candidatos.xhtml";
    }
    public String listarDoadoresPorNome(){
        this.doadores = candidatoService.listarDoadoresPorNome(nomeBusca);
        return "doadores.xhtml";
    }
    public String listarComitesPorEstado(){
        this.comites = comiteService.listarComites(estadoBusca, anoBusca);
        estadoBusca = "";
        anoBusca ="";
        return "comites.xhtml";
    }
    public String visualizarDoador(Doador d){
        doador = d;
        return "doador.xhtml";
    }
    public String visualizarComite(Comite c){
        comite = c;
        return "comite.xhtml";
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
        RequestContext.getCurrentInstance().execute("buscarCandidatosPorCidade('" + nomeMunicipio + "')");
        this.nomeMunicipioPesquisado = nomeMunicipio;
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
    
    public int getPorcentagemDoacao(double valorDoado){
        double total = caucularValorTotalDoado();
        return  (int) ((valorDoado * 100) / total);
        
    }
    
    public int getPorcentagemDespesaCandidato(double valor){
        double total = caucularValorTotalDeDespesasCandidato();
        return  (int) ((valor * 100) / total);
    }
    
    public int getPorcentagemReceitaCandidato(double valor){
        double total = caucularValorTotalDeReceitasCandidato();
        return  (int) ((valor * 100) / total);   
    }
    
    public int getPorcentagemDespesaComite(double valor){
        double total = caucularValorTotalDeDespesasComite();
        return  (int) ((valor * 100) / total);
    }
    
    public int getPorcentagemReceitaComite(double valor){
        double total = caucularValorTotalDeReceitasComite();
        return  (int) ((valor * 100) / total);   
    }

    public double caucularValorTotalDoado() {
        double total = 0;
        for(Doacao d : doador.getDoacoes()){
            total += d.getValorDoado();
        }
        return total;
    }
    public double caucularValorTotalDeDespesasCandidato() {
        double total = 0;
        for(DespesaCandidato d : dadosCandidato.getDespesas()){
            total += d.getValorDespesa();
        }
        return total;
    }
    public double caucularValorTotalDeReceitasCandidato() {
        double total = 0;
        for(ReceitaCandidato r : dadosCandidato.getReceitas()){
            total += r.getValorReceita();
        }
        return total;
    }
    public double caucularValorTotalDeDespesasComite() {
        double total = 0;
        for(DespesaComite d : comite.getDespesas()){
            total += d.getVrDespesa();
        }
        return total;
    }
    public double caucularValorTotalDeReceitasComite() {
        double total = 0;
        for(ReceitaComite r : comite.getReceitas()){
            total += r.getVrReceita();
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

    public List<Comite> getComites() {
        return comites;
    }

    public void setComites(List<Comite> comites) {
        this.comites = comites;
    }

    public String getEstadoBusca() {
        return estadoBusca;
    }

    public void setEstadoBusca(String estadoBusca) {
        this.estadoBusca = estadoBusca;
    }

    public Comite getComite() {
        return comite;
    }

    public void setComite(Comite comite) {
        this.comite = comite;
    }

}
