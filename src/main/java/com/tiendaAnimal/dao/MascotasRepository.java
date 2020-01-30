/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.dao;

import com.tiendaAnimal.model.Mascotas;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Piero
 */
public interface MascotasRepository extends Repository<Mascotas, Integer>
{
    List<Mascotas>findAll();
    Mascotas findById(int idmascota);
    Mascotas save (Mascotas m);
    void delete(Mascotas m);
}
