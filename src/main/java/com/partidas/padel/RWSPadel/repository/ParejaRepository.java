/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.repository;

import com.partidas.padel.RWSPadel.domain.Jugadores;
import com.partidas.padel.RWSPadel.domain.Pareja;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandro
 */
@Repository
public interface ParejaRepository extends CrudRepository<Pareja, Integer> {   
    @Autowired
    public List<Pareja> findAll();
    
    @Autowired
    public Pareja getReferenceById(int id);
    
    @Query("SELECT DISTINCT new Pareja(p.jugador1, p.jugador2, p.nombre_jugador1, p.nombre_jugador2) FROM Pareja p")
    List<Pareja> findDistinctParejas();
}
