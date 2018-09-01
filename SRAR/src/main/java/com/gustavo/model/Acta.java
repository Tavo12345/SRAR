/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gustavo
 */

@Entity
@Table(name="acta")
public class Acta implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String codigoActa;
    
    @Column(name="codigoProyecto")
    private String codigoProyecto;
    
    @Column(name="ubicacion")
    private String ubicacion;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fecha")
    private Date fecha;
    
    @Temporal(TemporalType.DATE)
    //@Temporal(TemporalType.TIME)
    @Column(name="horaInicio")
    private Date horaInicio;
    
    @Temporal(TemporalType.DATE)
    //@Temporal(TemporalType.TIME)
    @Column(name="horaFin")
    private Date horaFin;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fechaProximaReunion")
    private Date fechaProximaReunion;

    public String getCodigoActa() {
        return codigoActa;
    }

    public void setCodigoActa(String codigoActa) {
        this.codigoActa = codigoActa;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Date getFechaProximaReunion() {
        return fechaProximaReunion;
    }

    public void setFechaProximaReunion(Date fechaProximaReunion) {
        this.fechaProximaReunion = fechaProximaReunion;
    }
    
}
