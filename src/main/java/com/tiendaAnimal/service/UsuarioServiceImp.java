/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.service;

import com.tiendaAnimal.dao.UsuarioRepository;
import com.tiendaAnimal.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{
    
@Autowired
private UsuarioRepository repositorio;
    
    @Override
    public List<Usuario> listadoUsuarios()
    {
        return repositorio.findAll();
    }


    @Override()
    public Usuario listarId(int idusuario) 
    {
        return repositorio.findById(idusuario);
    }

    @Override
    public Usuario add(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario edit(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario delete(int idusuario) {
       Usuario u = repositorio.findById(idusuario);
        
        if (u!=null)
        {
            repositorio.delete(u);
        }
        
        return u;
    }

   

    
}
