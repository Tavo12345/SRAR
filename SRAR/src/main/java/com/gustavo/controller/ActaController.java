/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.controller;

/**
 *
 * @author Gustavo
 */

import com.gustavo.ejb.ActaFacadeLocal;
import com.gustavo.model.Acta;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class ActaController implements Serializable{
    
    @EJB
    private ActaFacadeLocal actaEJB;
    private Acta acta;
    
    @PostConstruct
    public void init(){
        acta = new Acta();
    }
    
    public void registrar(){
        try{
            actaEJB.create(acta);
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }

    public Acta getActa() {
        return acta;
    }

    public void setActa(Acta acta) {
        this.acta = acta;
    }
    
    
}
