/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public interface ParejaService {
    public List<Pareja> findAll();
    public Pareja findById(int id);
    public boolean deletePareja(int id);
    public Pareja updatePareja(Pareja pareja);
    public Pareja insertPareja(Pareja pareja);
}
