
package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="tecnicos")
public class Tecnico implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_tecnico;
    private String nombre;
    @OneToOne
    private Especialidad especialidad;
    private String mail;
    private String telefono;

    public Tecnico() {
    }

    public Tecnico(int id_tecnico, String nombre, Especialidad especialidad, String mail, String telefono) {
        this.id_tecnico = id_tecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.mail = mail;
        this.telefono = telefono;
    }

    public Tecnico(String nombre, Especialidad especialidad, String mail, String telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.mail = mail;
        this.telefono = telefono;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
