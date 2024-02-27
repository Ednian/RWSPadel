/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.partidas.padel.RWSPadel.service;

import com.partidas.padel.RWSPadel.domain.Jugadores;
import com.partidas.padel.RWSPadel.domain.Pareja;
import com.partidas.padel.RWSPadel.domain.Partida;
import java.util.List;

/**
 *
 * @author alejandro
 */
public interface JugadoresService {
     public List<Jugadores> findAll();
      public Jugadores findById(int id);
    public boolean deleteJugador(int id);
    public Jugadores updateJugador(Jugadores jugadores);
    public Jugadores insertJugador(Jugadores jugadores);
}

