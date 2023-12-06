
package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id_especialidad;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Especialidad other = (Especialidad) obj;
        if (this.id_especialidad != other.id_especialidad) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    @Override
    public String toString() {
        return nombre;
    }

    
    
}
