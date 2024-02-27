/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.domain;

import java.io.Serializable;
import javax.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alejandro
 */
@Entity
@Table(name = "Partida")
public class Partida implements Serializable {
    
       private static final long serialVersionUID = 1L;
    
     
    @Id 
    @NotNull
    @Column(name = "id")
    private int id;

    @Column(name = "pareja1")
    @NotNull
    private int pareja1;

    @Column(name = "pareja2")
    @NotNull
    private int pareja2;

    @Column(name = "ubicacion")
    @NotNull
    private int ubicacion;
    
    @Column(name = "dia")
    private Date dia;
    
    @Column(name = "pareja_ganadora")
    @NotNull
    @Size(max = 100)
    private int pareja_ganadora;
    
    @Column(name = "resultado")
    @NotNull
    @Size(max = 100)
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

    public int getPareja1() {
        return pareja1;
    }

    public void setPareja1(int pareja1) {
        this.pareja1 = pareja1;
    }

    public int getPareja2() {
        return pareja2;
    }

    public void setPareja2(int pareja2) {
        this.pareja2 = pareja2;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public int getPareja_ganadora() {
        return pareja_ganadora;
    }

    public void setPareja_ganadora(int pareja_ganadora) {
        this.pareja_ganadora = pareja_ganadora;
    }

}
