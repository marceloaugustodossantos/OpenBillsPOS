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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author marcelo
 */
@Path("despesascandidato")
public class ConsultaDespesasCandidato {
    
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterCandidatosComMaioresDespesas(){
        CandidatoService candidatoServicePort = new CandidatoServiceService().getCandidatoServicePort();
        List<DespesaCandidato> despCandidatos = candidatoServicePort.obterCandidatosComMaioresDespesas(2008, "todos", 10);
        JSONArray arrayDespesasJson = new JSONArray();
        for (DespesaCandidato c : despCandidatos) {
            try {
                JSONObject despCandidatoJson = new JSONObject();
                despCandidatoJson.put("candidato", c.getNoCand());
//                candidatosJson.put("valorDespesa", c.get);
                arrayDespesasJson.put(despCandidatoJson);
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        }
        return Response.ok(arrayDespesasJson).build();
    }
    
}
