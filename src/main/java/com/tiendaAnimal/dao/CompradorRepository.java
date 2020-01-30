/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.dao;

import com.tiendaAnimal.model.Comprador;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Piero
 */
public interface CompradorRepository extends Repository<Comprador, String>
{
        
    List<Comprador>findAll();
    Comprador findById(String dni);
    Comprador save(Comprador c);
    void delete(Comprador c);
    
    
}
