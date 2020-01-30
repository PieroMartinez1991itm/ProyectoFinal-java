/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.dao;

import com.tiendaAnimal.model.Usuario;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Piero
 */
public interface UsuarioRepository extends Repository<Usuario,Integer>
{
    List<Usuario>findAll();
    Usuario findById(int idusuario);
    Usuario save(Usuario u);
    void delete(Usuario u);
    
    
}
