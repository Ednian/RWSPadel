/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.partidas.padel.RWSPadel.service;

import com.partidas.padel.RWSPadel.domain.Ubicacion;
import java.util.List;

/**
 *
 * @author alejandro
 */
public interface UbicacionService {
    public List<Ubicacion> findAll();
    public Ubicacion findByID(int id);
    public boolean deleteUbicacion(int id);
    public Ubicacion updateUbicacion(Ubicacion ubicacion);
    public Ubicacion insertUbicacion(Ubicacion ubicacion);
    
}
