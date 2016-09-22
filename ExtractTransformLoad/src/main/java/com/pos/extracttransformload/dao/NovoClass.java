/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.dao;

import com.pos.extracttransformload.entities.Receitacandidato2004;

/**
 *
 * @author marcelo
 */
public class NovoClass {
    public static void main(String[] args) {
        
        DAO<Receitacandidato2004> dao = new DAOJPA<>();
        Receitacandidato2004 buscar = dao.buscar(10, Receitacandidato2004.class);
        System.out.println(buscar.getNo_cand());
    }
}
