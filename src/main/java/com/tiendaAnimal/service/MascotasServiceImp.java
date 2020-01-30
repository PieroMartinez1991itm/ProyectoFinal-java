/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.service;

import com.tiendaAnimal.dao.MascotasRepository;
import com.tiendaAnimal.model.Mascotas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Piero
 */
@Service
public class MascotasServiceImp implements MascotasService{

    @Autowired
    private MascotasRepository repositorio;
    
    @Override
    public List<Mascotas> listadoMascotas() {
        return repositorio.findAll();
    }

    @Override
    public Mascotas listarId(int idmascota) {
        return repositorio.findById(idmascota);
    }

    @Override
    public Mascotas add(Mascotas u) {
        return repositorio.save(u);
    }

    @Override
    public Mascotas edit(Mascotas u) {
        return repositorio.save(u);
    }

    @Override
    public Mascotas delete(int idmascota) {
       Mascotas u = repositorio.findById(idmascota);
        
        if (u!=null)
        {
            repositorio.delete(u);
        }
        
        return u;
    }
    
    
    
}
