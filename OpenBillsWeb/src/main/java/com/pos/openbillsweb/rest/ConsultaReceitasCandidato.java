/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.openbillsweb.rest;

import com.pos.openbillsweb.webservicesCli.CandidatoService;
import com.pos.openbillsweb.webservicesCli.CandidatoServiceService;
import com.pos.openbillsweb.webservicesCli.ReceitaCandidato;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author marcelo
 */
@Path("receitascandidato")
public class ConsultaReceitasCandidato {

    CandidatoService candidatoServicePort = new CandidatoServiceService().getCandidatoServicePort();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesas() {
        List<ReceitaCandidato> receitaCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, "todos", 10);
        JSONArray arrayDespesasJson = new JSONArray();
        for (ReceitaCandidato r : receitaCandidatos) {
            try {
                JSONObject despCandidatoJson = new JSONObject();
                despCandidatoJson.put("candidato", r.getNmCandidato());
//                candidatosJson.put("valorDespesa", c.get);
                arrayDespesasJson.put(despCandidatoJson);
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        }
        return Response.ok(arrayDespesasJson).build();
    }

    @GET
    @Path("{estado}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesasPorEstado(@PathParam("estado") String estado) {
        
        List<ReceitaCandidato> receitasCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, estado, 10);
        JSONArray arrayDespesasJson = new JSONArray();
        for (ReceitaCandidato r : receitasCandidatos) {
            try {
                JSONObject despCandidatoJson = new JSONObject();
                despCandidatoJson.put("candidato", r.getNmCandidato());
//                candidatosJson.put("valorDespesa", c.get);
                arrayDespesasJson.put(despCandidatoJson);
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        }
        return Response.ok(arrayDespesasJson).build();
    }

    @GET
    @Path("{ano}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesasPorAno(@PathParam("ano") String ano) {

        List<ReceitaCandidato> receitasCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, "todos", 10);

        JSONArray arrayDespesasJson = new JSONArray();
        for (ReceitaCandidato r : receitasCandidatos) {
            try {
                JSONObject despCandidatoJson = new JSONObject();
                despCandidatoJson.put("candidato", r.getNmCandidato());
//                candidatosJson.put("valorDespesa", c.get);
                arrayDespesasJson.put(despCandidatoJson);
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        }
        return Response.ok(arrayDespesasJson).build();
    }

    @GET
    @Path("{ano, estado}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesasPorAnoeEstado(
            @PathParam("estado") String estado, @PathParam("ano") String ano) {

        List<ReceitaCandidato> receitasCandidatos = candidatoServicePort.obterCandidatosComMaioresReceitas(2008, estado, 10);

        JSONArray arrayDespesasJson = new JSONArray();
        for (ReceitaCandidato r : receitasCandidatos) {
            try {
                JSONObject despCandidatoJson = new JSONObject();
                despCandidatoJson.put("candidato", r.getNmCandidato());
//                candidatosJson.put("valorDespesa", c.get);
                arrayDespesasJson.put(despCandidatoJson);
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        }
        return Response.ok(arrayDespesasJson).build();
    }

}
