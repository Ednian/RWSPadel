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
@Table(name = "Ubicacion")
public class Ubicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
     @Id 
    @NotNull
    @Column(name = "id")
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "CP")
    private int CP;
    
    @Column(name = "Direccion")
    private String direccion;
    
    @Column(name = "enlaceMaps")
    private String enlaceMaps;
    
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

    public int getCodigoPostal() {
        return CP;
    }

    public void setCodigoPostal(int CP) {
        this.CP = CP;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEnlaceMaps() {
        return enlaceMaps;
    }

    public void setEnlaceMaps(String enlaceMaps) {
        this.enlaceMaps = enlaceMaps;
    }
   
}
