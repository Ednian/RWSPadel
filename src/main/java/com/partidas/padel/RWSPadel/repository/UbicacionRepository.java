/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.partidas.padel.RWSPadel.repository;

import com.partidas.padel.RWSPadel.domain.Pareja;
import com.partidas.padel.RWSPadel.domain.Ubicacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alejandro
 */
public interface UbicacionRepository  extends CrudRepository<Ubicacion, Integer> {   
    @Autowired
    public List<Ubicacion> findAll();
       
}
    

