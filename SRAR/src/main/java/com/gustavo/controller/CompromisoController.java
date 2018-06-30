/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.controller;

import com.gustavo.ejb.CompromisoFacadeLocal;
import com.gustavo.model.Compromiso;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gustavo
 */

@Named
@ViewScoped
public class CompromisoController implements Serializable{
    
    @EJB
    private CompromisoFacadeLocal compromisoEJB;
    private Compromiso compromiso;
    
    @PostConstruct
    public void init(){
        compromiso = new Compromiso();
    }
    
    public void registrar(){
        try{
            compromisoEJB.create(compromiso);
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }

    public Compromiso getCompromiso() {
        return compromiso;
    }

    public void setCompromiso(Compromiso compromiso) {
        this.compromiso = compromiso;
    }
            
}
