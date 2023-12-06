
package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="especialidades")
public class Especialidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_especialidad;
    private String nombre;
    

    public Especialidad() {
    }

        
    public Especialidad(int id_especialidad, String nombre) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
    }

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
