package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class RazonSocial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_razon;
    private String nombre;
    @OneToOne
    private Servicio servicio;

    public RazonSocial() {
    }

    public RazonSocial(int id_razon, String nombre, Servicio servicio) {
        this.id_razon = id_razon;
        this.nombre = nombre;
        this.servicio = servicio;
    }

    public int getId_razon() {
        return id_razon;
    }

    public void setId_razon(int id_razon) {
        this.id_razon = id_razon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
