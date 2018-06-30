/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.controller;

import com.gustavo.ejb.ProyectoFacadeLocal;
import com.gustavo.model.Proyecto;
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
public class ProyectoController implements Serializable{
    
    @EJB
    private ProyectoFacadeLocal proyectoEJB;
    private Proyecto proyecto;
    
    @PostConstruct
    public void init(){
        proyecto = new Proyecto();
    }
    
    public void registrar(){
        try{
            proyectoEJB.create(proyecto);
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    
    
}
