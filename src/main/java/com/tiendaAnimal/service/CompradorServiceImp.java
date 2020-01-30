/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.service;

import com.tiendaAnimal.dao.CompradorRepository;
import com.tiendaAnimal.model.Comprador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Piero
 */
@Service
public class CompradorServiceImp implements CompradorService{

    @Autowired
    private CompradorRepository repositorio;
    
    @Override
    public List<Comprador> listadoUsuarios() {
        return repositorio.findAll();    }

    @Override
    public Comprador listarId(String dni) {
        return repositorio.findById(dni);
    }

    @Override
    public Comprador add(Comprador c) {
        return repositorio.save(c);
    }

    @Override
    public Comprador edit(Comprador c) {
        return repositorio.save(c);
    }

    @Override
    public Comprador delete(String dni) {
       Comprador c = repositorio.findById(dni);
        if (c!=null)
        {
            repositorio.delete(c);
        }
        
        return c;
    }
    
}
