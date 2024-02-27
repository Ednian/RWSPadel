/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.controler;

import com.partidas.padel.RWSPadel.domain.Pareja;
import com.partidas.padel.RWSPadel.domain.Ubicacion;
import com.partidas.padel.RWSPadel.service.ParejaService;
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
@RequestMapping("/api/parejas") 
@Tag(name="Parejas", description="")
public class ParejasController {
    
    private static final Logger logger = LoggerFactory.getLogger(PartidasController.class);
    
    @Autowired 
    ParejaService parejaService;
    
    @GetMapping("/findAll")
    public List<Pareja> parejas()   throws  IOException {
      logger.info("entra!!!");
      return parejaService.findAll();
        
    }
     
    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value = "/delete/{codi}")        
    public boolean deletePareja(@PathVariable int codi)   throws  IOException {
      logger.info("Entra en delete pareja: " +codi);
      return parejaService.deletePareja(codi);
        
    }


     @RequestMapping(method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE, value="/{codi}")  
    public @ResponseBody Pareja getPareja(@PathVariable int codi) {
        logger.info("Entra en buscar pareja: " +codi);
        Pareja ub= parejaService.findById(codi);
        logger.info("Sale en buscar pareja: " +codi);
        return ub;
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value = "/update/{codi}")        
    public Pareja updatePareja(@RequestBody Pareja pareja)   throws  IOException {
      logger.info("Entra en update pareja: " +pareja.getId());
      return parejaService.updatePareja(pareja);
        
    }
   @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value="/insert")  
    public @ResponseBody Pareja insertPareja(@RequestBody Pareja pareja) {
        logger.info("Entra en insert pareja: " +pareja.getId());
         return this.parejaService.insertPareja(pareja);
         
    }
    
}
