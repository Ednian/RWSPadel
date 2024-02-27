/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.service.impl;

import com.partidas.padel.RWSPadel.controler.PartidasController;
import com.partidas.padel.RWSPadel.domain.Pareja;
import com.partidas.padel.RWSPadel.repository.ParejaRepository;
import com.partidas.padel.RWSPadel.service.ParejaService;
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
public class ParejaServiceImpl implements ParejaService{
 private static final Logger logger = LoggerFactory.getLogger(PartidasController.class);
    
    public ParejaServiceImpl() {
    }
    @Autowired
    ParejaRepository repoPareja;
    
    
    @Override
    public List<Pareja> findAll() {
      return  repoPareja.findAll();
    }

    @Override
    public Pareja findById(int id) {
        Pareja pareja= repoPareja.findById(id).get();
       logger.info("Nombre del jugador1:"+pareja.getNombre_jugador1());
       logger.info("Nombre de la pareja 1 en service:"+pareja.getNombrePareja());
        return pareja;
    }

    @Override
    public boolean deletePareja(int id) {
       Boolean delete=false;
        try{
        repoPareja.deleteById(id);
        }catch(Exception e){
            delete=false;
        }
        return delete;
    }

    @Override
    public Pareja updatePareja(Pareja pareja) {
      return repoPareja.save(pareja);
    }

    @Override
    public Pareja insertPareja(Pareja pareja) {
       return repoPareja.save(pareja);
    }
    
    
}
