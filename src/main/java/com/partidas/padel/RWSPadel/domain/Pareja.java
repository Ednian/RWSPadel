/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alejandro
 */
@Entity
@Table(name = "Pareja")
public class Pareja implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
     @Id 
    @NotNull
    @Column(name = "id")
    private int id;
    
    @Column(name = "jugador1")
    private int jugador1;
    
    @Column(name = "jugador2")
    private int jugador2;
    
    @Column(name = "P_jugadas")
    private int P_jugadas;

 
    @Column(name = "P_ganadas")
    private int P_ganadas;
    
    @Column(name = "P_perdidas")
    private int P_perdidas;
    @Column(name ="nombre_jugador1")
    private String nombre_jugador1;
    
     @Column(name ="nombre_jugador2")
    private String nombre_jugador2;
     
   
    public String getNombrePareja(){
        return  this.nombre_jugador1 + " - " + this.nombre_jugador2;
    }
     
       public int getP_jugadas() {
        return P_jugadas;
    }

    public void setP_jugadas(int P_jugadas) {
        this.P_jugadas = P_jugadas;
    }

    public int getP_ganadas() {
        return P_ganadas;
    }

    public void setP_ganadas(int P_ganadas) {
        this.P_ganadas = P_ganadas;
    }

    public int getP_perdidas() {
        return P_perdidas;
    }

    public void setP_perdidas(int P_perdidas) {
        this.P_perdidas = P_perdidas;
    }

    public String getNombre_jugador1() {
        return nombre_jugador1;
    }

    public void setNombre_jugador1(String nombre_jugador1) {
        this.nombre_jugador1 = nombre_jugador1;
    }

    public String getNombre_jugador2() {
        return nombre_jugador2;
    }

    public void setNombre_jugador2(String nombre_jugador2) {
        this.nombre_jugador2 = nombre_jugador2;
    }
 
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    
}
