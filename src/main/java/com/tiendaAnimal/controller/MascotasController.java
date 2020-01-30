/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.controller;

import com.tiendaAnimal.model.Mascotas;
import com.tiendaAnimal.service.MascotasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Piero
 */
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/mascota"})
public class MascotasController {
    
    @Autowired
    MascotasService service;
    
    @GetMapping
    public List<Mascotas>listadoMascotas()
    {
        return service.listadoMascotas();
    }
    @GetMapping(path = {"/{idmascota}"})
    public Mascotas listarId(@PathVariable("idmascota") int idmascota)
    {
        return service.listarId(idmascota);
    }
    @PostMapping
    public Mascotas add(@RequestBody Mascotas m)
    {
        return service.add(m);
    }
    @PutMapping(path={"/{idmascota}"})
    public Mascotas edit(@RequestBody Mascotas m, @PathVariable("idmascota") int idmascota)
    {
        m.setIdmascota(idmascota);
        return service.edit(m);
    }
    @DeleteMapping(path={"/{idmascota}"})
    public Mascotas delete(@PathVariable("idmascota") int idmascota)
    {
        return service.delete(idmascota);
    }
}
