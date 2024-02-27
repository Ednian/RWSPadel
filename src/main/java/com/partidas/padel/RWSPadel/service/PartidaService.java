/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.partidas.padel.RWSPadel.service;

import com.partidas.padel.RWSPadel.domain.Partida;
import com.partidas.padel.RWSPadel.domain.Ubicacion;
import com.partidas.padel.RWSPadel.model.PartidaDTO;
import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;


/**
 *
 * @author alejandro
 */

public interface PartidaService {

    public List<Partida> findAll();
    public Partida findByID(int id);
    public boolean deletePartida(int id);
    public Partida updatePartida(Partida partida);
    public Partida insertPartida(Partida partida);

}
