/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.controler;

import com.partidas.padel.RWSPadel.domain.Ubicacion;
import com.partidas.padel.RWSPadel.service.UbicacionService;
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
@RequestMapping("api/ubicacion") 
@Tag(name = "Ubicacion", description = "Operaciones relacionadas con la ubicación")
public class UbicacionController {
    
     private static final Logger logger = LoggerFactory.getLogger(PartidasController.class);
     @Autowired 
    UbicacionService ubicacionService;
    
    @GetMapping("/findAll")
    public List<Ubicacion> ubicacion()   throws  IOException {
      logger.info("entra!!!");
      return ubicacionService.findAll();
        
    }
     
    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value = "/delete/{codi}")        
    public boolean deleteUbicacion(@PathVariable int codi)   throws  IOException {
      logger.info("Entra en delete ubicacion: " +codi);
      return ubicacionService.deleteUbicacion(codi);
        
    }


     @RequestMapping(method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE, value="/{codi}")  
    public @ResponseBody Ubicacion getUbicacion(@PathVariable int codi) {
        logger.info("Entra en buscar ubicacion: " +codi);
        Ubicacion ub= ubicacionService.findByID(codi);
        logger.info("Sale en buscar ubicacion: " +codi);
        return ub;
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value = "/update/{codi}")        
    public Ubicacion updateUbicacion(@RequestBody Ubicacion ubicacion)   throws  IOException {
      logger.info("Entra en update ubicacion: " +ubicacion.getId());
      return ubicacionService.updateUbicacion(ubicacion);
        
    }
   @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value="/insert")  
    public @ResponseBody Ubicacion insertUbicacion(@RequestBody Ubicacion ubicacion) {
        logger.info("Entra en insert ubicacion: " +ubicacion.getId());
         return this.ubicacionService.insertUbicacion(ubicacion);
         
    }
}
