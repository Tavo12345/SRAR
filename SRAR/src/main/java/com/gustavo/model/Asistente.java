/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */

@Entity
@Table(name="asistente")
public class Asistente implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int codigo;
    
    @Column(name="codigoPersona")
    private String codigoPersona;
    
    @Column(name="codigoActa")
    private String codigoActa;
    
    @Column(name="asistio")
    private boolean asistio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getCodigoActa() {
        return codigoActa;
    }

    public void setCodigoActa(String codigoActa) {
        this.codigoActa = codigoActa;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
    
    
    
    
}
