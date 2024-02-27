/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.service.impl;



import com.partidas.padel.RWSPadel.domain.Partida;
import com.partidas.padel.RWSPadel.repository.PartidaRepository;
//import com.partidas.padel.repository.PartidaRepository;
import com.partidas.padel.RWSPadel.service.PartidaService;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PartidaServiceImpl implements PartidaService {

     private static final Logger logger = LoggerFactory.getLogger(PartidaServiceImpl.class);
    @Autowired
    public PartidaRepository partidaRepositorty;

    public PartidaServiceImpl() {
    }
    

    @Override
    public ArrayList<Partida> findAll() {
        ArrayList<Partida> partidas =  (ArrayList<Partida>)partidaRepositorty.findAll();
         logger.info("partidas:"+ partidas.size());
       return partidas;
    }

    @Override
    public Partida findByID(int id) {
      return partidaRepositorty.findById(id).get();
    }

    @Override
    public boolean deletePartida(int id) {
        Boolean delete=false;
        try{
        partidaRepositorty.deleteById(id);
        }catch(Exception e){
            delete=false;
        }
        return delete;
    }

    @Override
    public Partida updatePartida(Partida partida) {
       return partidaRepositorty.save(partida);
    }

    @Override
    public Partida insertPartida(Partida partida) {
         return partidaRepositorty.save(partida);
    }
    
}