/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.openbillsweb.rest;


import com.pos.openbillsweb.webservicesCli.CandidatoService;
import com.pos.openbillsweb.webservicesCli.CandidatoServiceService;
import com.pos.openbillsweb.webservicesCli.DespesaCandidato;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author marcelo
 */
@Path("despesascandidato")
public class ConsultaDespesasCandidato {

    CandidatoService candidatoServicePort = new CandidatoServiceService().getCandidatoServicePort();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesas() {
        List<DespesaCandidato> despCandidatos = candidatoServicePort.obterCandidatosComMaioresDespesas(2008, "todos", 10);
        JsonArrayBuilder despCandArray = Json.createArrayBuilder();

        for (DespesaCandidato r : despCandidatos) {
            JsonArrayBuilder arb = Json.createArrayBuilder();
            arb.add(r.getNoCand());
            arb.add(15000);
            despCandArray.add(arb);
        }

        return Response.ok(despCandArray.build()).build();
    }

    @GET
    @Path("{estado}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesasPorEstado(@PathParam("estado") String estado) {
        
        List<DespesaCandidato> despCandidatos = candidatoServicePort.obterCandidatosComMaioresDespesas(2008, estado, 10);
        JsonArrayBuilder despCandArray = Json.createArrayBuilder();

        for (DespesaCandidato r : despCandidatos) {
            JsonArrayBuilder arb = Json.createArrayBuilder();
            arb.add(r.getNoCand());
            arb.add(15000);
            despCandArray.add(arb);
        }

        return Response.ok(despCandArray.build()).build();
    }

    @GET
    @Path("{ano}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesasPorAno(@PathParam("ano") String ano) {

        List<DespesaCandidato> despCandidatos = candidatoServicePort.obterCandidatosComMaioresDespesas(2008, "todos", Integer.parseInt(ano));
        JsonArrayBuilder despCandArray = Json.createArrayBuilder();

        for (DespesaCandidato r : despCandidatos) {
            JsonArrayBuilder arb = Json.createArrayBuilder();
            arb.add(r.getNoCand());
            arb.add(15000);
            despCandArray.add(arb);
        }

        return Response.ok(despCandArray.build()).build();
    }

    @GET
    @Path("{ano, estado}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesasPorAnoeEstado(
            @PathParam("estado") String estado, @PathParam("ano") String ano) {

        List<DespesaCandidato> despCandidatos = candidatoServicePort.obterCandidatosComMaioresDespesas(2008, estado, Integer.parseInt(ano));
        JsonArrayBuilder despCandArray = Json.createArrayBuilder();

        for (DespesaCandidato r : despCandidatos) {
            JsonArrayBuilder arb = Json.createArrayBuilder();
            arb.add(r.getNoCand());
            arb.add(15000);
            despCandArray.add(arb);
        }

        return Response.ok(despCandArray.build()).build();
    }

}
