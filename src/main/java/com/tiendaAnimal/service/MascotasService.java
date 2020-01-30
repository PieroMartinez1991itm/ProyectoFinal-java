/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.service;

import com.tiendaAnimal.model.Mascotas;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface MascotasService {
    
    List<Mascotas>listadoMascotas();
        
        Mascotas listarId(int idmascota);
        
        Mascotas add(Mascotas u);
        
        Mascotas edit(Mascotas u);
        
        Mascotas delete(int idmascota);
}
