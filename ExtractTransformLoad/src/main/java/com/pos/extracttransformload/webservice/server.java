/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.extracttransformload.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author kaiqu
 */
@WebService
public class server {
    
    @WebMethod 
    public String hello(){
        return "Hello World";
    }
}
