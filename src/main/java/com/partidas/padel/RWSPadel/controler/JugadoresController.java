/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.controler;

import com.partidas.padel.RWSPadel.domain.Jugadores;
import com.partidas.padel.RWSPadel.service.JugadoresService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alejandro
 */
@RestController
@RequestMapping("api/jugador") 
@Tag(name = "Jugador", description = "Operaciones relacionadas con Jugadores")
public class JugadoresController {
    
    @Autowired 
    JugadoresService jugadoresService;
    private static final Logger logger = LoggerFactory.getLogger(PartidasController.class);
    
    @GetMapping("/findAll")
    public List<Jugadores> jugadores()   throws  IOException {
      logger.info("entra!!!");
      return jugadoresService.findAll();
        
    }
      
    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value = "/delete/{codi}")        
    public boolean deleteJugador(@PathVariable int codi)   throws  IOException {
      logger.info("Entra en delete jugador: " +codi);
      return jugadoresService.deleteJugador(codi);
        
    }


     @RequestMapping(method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE, value="/{codi}")  
    public @ResponseBody Jugadores getJugador(@PathVariable int codi) {
        logger.info("Entra en buscar jugador: " +codi);
        Jugadores ub= jugadoresService.findById(codi);
        logger.info("Sale en buscar jugador: " +codi);
        return ub;
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value = "/update/{codi}")        
    public Jugadores updateJugador(@RequestBody Jugadores jugador)   throws  IOException {
      logger.info("Entra en update jugador: " +jugador.getId());
      return jugadoresService.updateJugador(jugador);
        
    }
   @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value="/insert")  
    public @ResponseBody Jugadores insertJugador(@RequestBody Jugadores jugador) {
        logger.info("Entra en insert jugador: " +jugador.getId());
         return jugadoresService.insertJugador(jugador);
         
    }
}
