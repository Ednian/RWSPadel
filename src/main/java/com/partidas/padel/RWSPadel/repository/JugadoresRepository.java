/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.repository;

import com.partidas.padel.RWSPadel.domain.Jugadores;
import com.partidas.padel.RWSPadel.domain.Partida;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandro
 */
@Repository
public interface JugadoresRepository extends CrudRepository<Jugadores, Integer>{   
    @Override
     public List<Jugadores> findAll();
     
   
}
