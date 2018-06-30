/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.controller;

import com.gustavo.ejb.AsistenteFacadeLocal;
import com.gustavo.model.Asistente;
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
public class AsistenteController implements Serializable{
    
    @EJB
    private AsistenteFacadeLocal asistenteEJB;
    private Asistente asistente;
    
    @PostConstruct
    public void init(){
        asistente = new Asistente();
    }
    
    public void registrar(){
        try{
            asistenteEJB.create(asistente);
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }   
    
}
