/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.controller;

import com.tiendaAnimal.model.Comprador;
import com.tiendaAnimal.service.CompradorService;
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
@RequestMapping({"/comprador}"})
public class CompradorController {
    
    @Autowired
    CompradorService service;
    
    @GetMapping
    public List<Comprador>listadoUsuarios()
    {
        return service.listadoUsuarios();
    }
    @GetMapping(path = {"/{dni}"})
    public Comprador listarId(@PathVariable("dni") String dni)
    {
        return service.listarId(dni);
    }
    @PostMapping
    public Comprador add(@RequestBody Comprador c)
    {
        return service.add(c);
    }
    @PutMapping(path={"/{dni}"})
    public Comprador edit(@RequestBody Comprador c,@PathVariable("dni") String dni)
    {
        c.setDni(dni);
        return service.edit(c);
    }
    @DeleteMapping(path={"/{dni}"})
    public Comprador delete(@PathVariable("dni") String dni)
    {
        return service.delete(dni);
    }
}
