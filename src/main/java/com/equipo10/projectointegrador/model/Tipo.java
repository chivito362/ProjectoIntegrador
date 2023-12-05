package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo")
public class Tipo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_tipo;
    private String nombre_problema;
    private double tiempo_max;

    public Tipo() {
    }

    public Tipo(int id_tipo, String nombre_problema, double tiempo_max) {
        this.id_tipo = id_tipo;
        this.nombre_problema = nombre_problema;
        this.tiempo_max = tiempo_max;
    }

    public Tipo(String nombre_problema, double tiempo_max) {
        this.nombre_problema = nombre_problema;
        this.tiempo_max = tiempo_max;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre_problema() {
        return nombre_problema;
    }

    public void setNombre_problema(String nombre_problema) {
        this.nombre_problema = nombre_problema;
    }

    public double getTiempo_max() {
        return tiempo_max;
    }

    public void setTiempo_max(double tiempo_max) {
        this.tiempo_max = tiempo_max;
    }
    
    
}
