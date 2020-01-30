/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.service;

import com.tiendaAnimal.model.Comprador;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface CompradorService {
           
        List<Comprador>listadoUsuarios();
        
        Comprador listarId(String dni);
        
        Comprador add(Comprador u);
        
        Comprador edit(Comprador u);
        
        Comprador delete(String dni);
    
}
