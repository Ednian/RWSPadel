/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.service.impl;

import com.partidas.padel.RWSPadel.controler.PartidasController;
import com.partidas.padel.RWSPadel.domain.Pareja;
import com.partidas.padel.RWSPadel.domain.Ubicacion;
import com.partidas.padel.RWSPadel.repository.ParejaRepository;
import com.partidas.padel.RWSPadel.repository.UbicacionRepository;
import com.partidas.padel.RWSPadel.service.UbicacionService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandro
 */
@Service
public class UbicacionServiceImpl implements UbicacionService{
     private static final Logger logger = LoggerFactory.getLogger(UbicacionServiceImpl.class);
     public UbicacionServiceImpl() {
    }
    
    @Autowired
    UbicacionRepository ubicacionRepository;
    
    
    @Override
    public List<Ubicacion> findAll() {
      return  ubicacionRepository.findAll();
    }

    @Override
    public Ubicacion findByID(int id) {
       logger.info("Entra en buscar ubicacion service impl: " +id);
         Optional<Ubicacion> ubicacion =  ubicacionRepository.findById(id);
       logger.info("Sale en buscar ubicacion service impl: " +ubicacion.get().getNombre());
       return ubicacion.get();
    }

    @Override
    public boolean deleteUbicacion(int id) {
        Boolean delete=false;
        try{
        ubicacionRepository.deleteById(id);
        }catch(Exception e){
            delete=false;
        }
        return delete;
    }

    @Override
    public Ubicacion updateUbicacion(Ubicacion ubicacion) {
     return  ubicacionRepository.save(ubicacion);
    }

    @Override
    public Ubicacion insertUbicacion(Ubicacion ubicacion) {
      return  ubicacionRepository.save(ubicacion);
    }
   
}
