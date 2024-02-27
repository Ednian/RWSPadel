/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.partidas.padel.RWSPadel.controler;




import com.partidas.padel.RWSPadel.domain.Partida;
import com.partidas.padel.RWSPadel.model.PartidaDTO;
import com.partidas.padel.RWSPadel.service.JugadoresService;
import com.partidas.padel.RWSPadel.service.ParejaService;
import com.partidas.padel.RWSPadel.service.PartidaService;
import com.partidas.padel.RWSPadel.service.UbicacionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author alejandro
 */
@RestController
@RequestMapping("api/partidas") 
@Tag(name = "Partidas", description = "Operaciones relacionadas con Partidas")
public class PartidasController {
    private static final Logger logger = LoggerFactory.getLogger(PartidasController.class);
    public static final String HEROE_RESOURCE = "/api/heroes";
    
    @Autowired 
    PartidaService partidasService;
     @Autowired 
    JugadoresService jugadoresService;
    @Autowired 
    ParejaService parejaService;
    @Autowired 
    UbicacionService UbicacionService;
    
    @GetMapping("/findAll")
    public List<PartidaDTO> partidas()   throws  IOException {
      logger.info("entra!!!");
      List<PartidaDTO> partidasDTO = new ArrayList<PartidaDTO>();
      //Recuperamos partidas:
      List<Partida> partidas = partidasService.findAll();
      
       for(int i=0;i<partidas.size();i++){
            PartidaDTO partidaDTO = new PartidaDTO();
            partidaDTO.setDia(partidas.get(i).getDia());
            partidaDTO.setId(partidas.get(i).getId());
            partidaDTO.setUbicacion(UbicacionService.findByID(partidas.get(i).getUbicacion()).getNombre());
            logger.info("pareja 1-->"+partidas.get(i).getPareja1());
            logger.info("pareja ganadora-->"+partidas.get(i).getPareja_ganadora());
            logger.info("ID partida -->"+partidas.get(i).getId());
            partidaDTO.setPareja1(parejaService.findById(partidas.get(i).getPareja1()).getNombrePareja());
            partidaDTO.setPareja2(parejaService.findById(partidas.get(i).getPareja2()).getNombrePareja());
            partidaDTO.setPareja_ganadora(parejaService.findById(partidas.get(i).getPareja_ganadora()).getNombrePareja());
            logger.info("PartidaDTO -->"+partidaDTO.toString());
            partidasDTO.add(partidaDTO);
        }
      
      return partidasDTO;
        
    }
    
     
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{codi}")        
    public boolean deletePartida(@PathVariable int codi)   throws  IOException {
      logger.info("Entra en delete ubicacion: " +codi);
      return partidasService.deletePartida(codi);
        
    }

    @RequestMapping(method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE, value="/{codi}")  
    public @ResponseBody PartidaDTO getPartida(@PathVariable int codi) {
        logger.info("Entra en buscar partida: " +codi);
         Partida partida= partidasService.findByID(codi);
         PartidaDTO partidaDTO = new PartidaDTO();
            partidaDTO.setDia(partida.getDia());
            partidaDTO.setId(partida.getId());
            partidaDTO.setUbicacion(UbicacionService.findByID(partida.getUbicacion()).getNombre());
            logger.info("pareja 1-->"+partida.getPareja1());
            logger.info("pareja ganadora-->"+partida.getPareja_ganadora());
            logger.info("ID partida -->"+partida.getId());
            partidaDTO.setPareja1(parejaService.findById(partida.getPareja1()).getNombrePareja());
            partidaDTO.setPareja2(parejaService.findById(partida.getPareja2()).getNombrePareja());
            partidaDTO.setPareja_ganadora(parejaService.findById(partida.getPareja_ganadora()).getNombrePareja());
            partidaDTO.setResultado(partida.getResultado());
            logger.info("PartidaDTO -->"+partidaDTO.toString());
            
        return partidaDTO;    

    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value = "/update/{codi}")        
    public @ResponseBody Partida updatePartida(@RequestBody Partida partida)   throws  IOException {
      logger.info("Entra en update partida: " +partida.getId());
      return partidasService.updatePartida(partida);
        
    }
   @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, value="/insert")  
    public @ResponseBody Partida insertPartida(@RequestBody Partida partida) {
        logger.info("Entra en insert partida: " +partida.getId());
         return this.partidasService.insertPartida(partida);
         
    }
}
