/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.service.impl;

import com.partidas.padel.RWSPadel.domain.Jugadores;
import com.partidas.padel.RWSPadel.repository.JugadoresRepository;
import com.partidas.padel.RWSPadel.repository.ParejaRepository;
import com.partidas.padel.RWSPadel.service.JugadoresService;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandro
 */
@Service
public class JugadoresServiceImpl implements JugadoresService {

      private static final Logger logger = LoggerFactory.getLogger(PartidaServiceImpl.class);
    @Autowired
    public JugadoresRepository jugadoresRepositorty;
    @Autowired
    public ParejaRepository parejaRepository;
    public JugadoresServiceImpl() {
    }
    @Override
    public List<Jugadores> findAll() {
          ArrayList<Jugadores> jugadores =  (ArrayList<Jugadores>)jugadoresRepositorty.findAll();
          return jugadores;
    }

    @Override
    public Jugadores findById(int id) {
        return jugadoresRepositorty.findById(id).get();
    }

    @Override
    public boolean deleteJugador(int id) {
       Boolean delete=false;
        try{
        jugadoresRepositorty.deleteById(id);
        }catch(Exception e){
            delete=false;
        }
        return delete;
    }

    @Override
    public Jugadores updateJugador(Jugadores jugadores) {
        return jugadoresRepositorty.save(jugadores);
    }

    @Override
    public Jugadores insertJugador(Jugadores jugadores) {
         return jugadoresRepositorty.save(jugadores);
    }

}
