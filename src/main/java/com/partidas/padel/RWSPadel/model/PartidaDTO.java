/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alejandro
 */

public class PartidaDTO implements Serializable {
    
       private static final long serialVersionUID = 1L;
   
    private int id;
    private String pareja1;
    private String pareja2;
    private String ubicacion;
    private Date dia;
    private String pareja_ganadora;
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
   
    @Override
    public String toString() {
        return "Partida{" + "id=" + id + ", pareja1=" + pareja1 + ", pareja2=" + pareja2 + ", ubicacion=" + ubicacion + ", dia=" + dia + ", pareja_ganadora=" + pareja_ganadora + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPareja1() {
        return pareja1;
    }

    public void setPareja1(String pareja1) {
        this.pareja1 = pareja1;
    }

    public String getPareja2() {
        return pareja2;
    }

    public void setPareja2(String pareja2) {
        this.pareja2 = pareja2;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getPareja_ganadora() {
        return pareja_ganadora;
    }

    public void setPareja_ganadora(String pareja_ganadora) {
        this.pareja_ganadora = pareja_ganadora;
    }

}
