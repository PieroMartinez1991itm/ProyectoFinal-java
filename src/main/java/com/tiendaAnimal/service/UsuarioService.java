/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.service;

import com.tiendaAnimal.model.Usuario;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface UsuarioService {
    
        List<Usuario>listadoUsuarios();
        
        Usuario listarId(int idusuario);
        
        Usuario add(Usuario u);
        
        Usuario edit(Usuario u);
    
        Usuario delete(int idusuario);
    
}
