/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.controller;

import com.gustavo.ejb.TemaFacadeLocal;
import com.gustavo.model.Tema;
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
public class TemaController implements Serializable {
    
    @EJB
    private TemaFacadeLocal temaEJB;
    private Tema tema;
    
    @PostConstruct
    public void init(){
        tema = new Tema();
    }
    
    public void registrar(){
        try{
            temaEJB.create(tema);
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }
    
}
