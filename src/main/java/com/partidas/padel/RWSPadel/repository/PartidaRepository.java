/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.repository;

import com.partidas.padel.RWSPadel.domain.Partida;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandro
 */
@Repository
public interface PartidaRepository extends CrudRepository<Partida, Integer>{
    
     @Override
     public List<Partida> findAll();
    public Optional<Partida> getReferenceById(int id);
      
}
