package com.tiendaAnimal.controller;

import com.tiendaAnimal.model.Usuario;
import com.tiendaAnimal.service.UsuarioService;
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

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/usuarios"})
public class UsuarioController {
    
    @Autowired
    UsuarioService service;
    
    @GetMapping
    public List<Usuario>listadoUsuarios()
    {
        return service.listadoUsuarios();
    }
    @GetMapping(path = {"/{idusuario}"})
    public Usuario listarId(@PathVariable("idusuario")int idusuario)
    {
        return service.listarId(idusuario);
    }
    
    @PostMapping
    public Usuario add(@RequestBody Usuario u)
    {
        return service.add(u);
    }
    
    @PutMapping(path={"/{idusuario}"})
    public Usuario edit(@RequestBody Usuario u, @PathVariable("idusuario") int idusuario)
    {
        u.setIdusuario(idusuario);
        return service.edit(u);
    }
    
    @DeleteMapping(path={"/{idusuario}"})
    public Usuario delete(@PathVariable("idusuario") int idusuario)
    {
        return service.delete(idusuario);
    }
}
