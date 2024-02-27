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

/**
 *
 * @author alejandro
 */
@Entity
@Table(name = "Jugadores")
public class Jugadores implements Serializable {
 
    private static final long serialVersionUID = 1L;
    @Id 
    @NotNull
    @Column(name = "id")
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "foto")
    private String foto;
    
    @Column(name = "edad")
    private int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
