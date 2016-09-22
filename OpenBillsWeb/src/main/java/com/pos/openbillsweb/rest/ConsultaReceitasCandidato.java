/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.openbillsweb.rest;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONException;

/**
 *
 * @author marcelo
 */
@Path("receitascandidato")
public class ConsultaReceitasCandidato {

//    CandidatoService candidatoServicePort = new CandidatoServiceService().getCandidatoServicePort();
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response teste() throws JSONException {
        JsonArrayBuilder d1 = Json.createArrayBuilder();
        d1.add("Marcelo augusto dos Santos");
        d1.add(15000);
        JsonArrayBuilder d2 = Json.createArrayBuilder();
        d2.add("Augusto César dos Santos");
        d2.add(10000);
        JsonArrayBuilder d3 = Json.createArrayBuilder();
        d3.add("Marcelo augusto");
        d3.add(18000);
        JsonArrayBuilder d4 = Json.createArrayBuilder();
        d4.add("Augusto César Santos");
        d4.add(13000);
        
        JsonArrayBuilder receitas = Json.createArrayBuilder();
        receitas.add(d1);
        receitas.add(d2);
        receitas.add(d3);
        receitas.add(d4);
        return Response.ok(receitas.build()).build(); 
    }
    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response obterCandidatosComMaioresReceitas() throws JSONException {
//
//        List<ReceitaCandidato> recCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, "todos", 10);
//        JsonArrayBuilder despCandArray = Json.createArrayBuilder();
//
//        for (ReceitaCandidato r : recCandidatos) {
//            JsonArrayBuilder arb = Json.createArrayBuilder();
//            arb.add(r.getNmCandidato());
//            arb.add(15000);
//            despCandArray.add(arb);
//        }
//
//        return Response.ok(despCandArray.build()).build();
//    }
//
//    @GET
//    @Path("{estado}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response obterCandidatosComMaioresReceitasPorEstado(@PathParam("estado") String estado) {
//
//        List<ReceitaCandidato> recCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, estado, 10);
//        JsonArrayBuilder despCandArray = Json.createArrayBuilder();
//
//        for (ReceitaCandidato r : recCandidatos) {
//            JsonArrayBuilder arb = Json.createArrayBuilder();
//            arb.add(r.getNmCandidato());
//            arb.add(15000);
//            despCandArray.add(arb);
//        }
//
//        return Response.ok(despCandArray.build()).build();
//    }
//
//    @GET
//    @Path("{ano}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response obterCandidatosComMaioresReceitasPorAno(@PathParam("ano") String ano) {
//
//        List<ReceitaCandidato> recCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, "todos", 10);
//        JsonArrayBuilder recCandArray = Json.createArrayBuilder();
//
//        for (ReceitaCandidato r : recCandidatos) {
//            JsonArrayBuilder arb = Json.createArrayBuilder();
//            arb.add(r.getNmCandidato());
//            arb.add(15000);
//            recCandArray.add(arb);
//        }
//
//        return Response.ok(recCandArray.build()).build();
//    }
//
//    @GET
//    @Path("{ano, estado}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response obterCandidatosComMaioresReceitasPorAnoeEstado(
//            @PathParam("estado") String estado, @PathParam("ano") String ano) {
//
//        List<ReceitaCandidato> receitasCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, estado, 10);
//        JsonArrayBuilder despCand = Json.createArrayBuilder();
//
//        for (ReceitaCandidato r : receitasCandidatos) {
//            JsonArrayBuilder arb = Json.createArrayBuilder();
//            arb.add(r.getNmCandidato());
//            arb.add(15000);
//            despCand.add(arb);
//        }
//
//        return Response.ok(despCand.build()).build();
//    }
}
