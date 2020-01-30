/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendaAnimal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Piero
 */
@Entity
@Table(name="mascota")
public class Mascotas {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idmascota;
    
    @Column
    private String nombre;
    private String tipo;
    private int precio;
    private String descripcion;
    private int adoptado;
    private int fechaentrada;
    private int fechaacogida;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(int adoptado) {
        this.adoptado = adoptado;
    }

    public int getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(int fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public int getFechaacogida() {
        return fechaacogida;
    }

    public void setFechaacogida(int fechaacogida) {
        this.fechaacogida = fechaacogida;
    }
             
}
