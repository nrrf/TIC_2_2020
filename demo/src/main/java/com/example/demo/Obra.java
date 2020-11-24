/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author inies
 */

@Entity
@Table(name = "obra")
public class Obra {
    @Id 
    @GeneratedValue 
    @Column(name="obr_id")
    private int obrId; 
    
    @Column(name="obr_nombre")
    private String obrNombre; 
    
    @Column(name="obr_tipo")
    private String obrTipo; 
    
    @Column(name="obr_costo")
    private double obrCosto; 
    
    @Column(name="exp_id")
    private int expId; 
    
    
    public int getObrId() {
        return obrId;
    }

    public void setObrId(int obrId) {
        this.obrId = obrId;
    }

    public String getObrNombre() {
        return obrNombre;
    }

    public void setObrNombre(String obrNombre) {
        this.obrNombre = obrNombre;
    }

    public String getObrTipo() {
        return obrTipo;
    }

    public void setObrTipo(String obrTipo) {
        this.obrTipo = obrTipo;
    }

    public double getObrCosto() {
        return obrCosto;
    }

    public void setObrCosto(double obrCosto) {
        this.obrCosto = obrCosto;
    }

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }
}
