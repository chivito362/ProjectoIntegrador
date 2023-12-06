package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo")
public class Tipo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_tipo;
    private String nombre_problema;
    private double tiempo_max;
    @ManyToMany
    @JoinTable(
            name="Tipo_Espe",
            joinColumns= @JoinColumn(name="id_especialidad"),
            inverseJoinColumns = @JoinColumn(name="id_tipo")
    )
    private List<Especialidad> especialidadesPosibles;

    public Tipo() {
    }

    public Tipo(int id_tipo, String nombre_problema, double tiempo_max, List<Especialidad> especialidadesPosibles) {
        this.id_tipo = id_tipo;
        this.nombre_problema = nombre_problema;
        this.tiempo_max = tiempo_max;
        this.especialidadesPosibles = especialidadesPosibles;
    }

    public Tipo(String nombre_problema, double tiempo_max, List<Especialidad> especialidadesPosibles) {
        this.nombre_problema = nombre_problema;
        this.tiempo_max = tiempo_max;
        this.especialidadesPosibles = especialidadesPosibles;
    }

    public void agregarEspecialidad(Especialidad esp){
        especialidadesPosibles.add(esp);
    }
    public List<Especialidad> getEspecialidadesPosibles() {
        return especialidadesPosibles;
    }

    public void setEspecialidadesPosibles(List<Especialidad> especialidadesPosibles) {
        this.especialidadesPosibles = especialidadesPosibles;
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

    @Override
    public String toString() {
        return "Tipo{" + "id_tipo=" + id_tipo + ", nombre_problema=" + nombre_problema + ", tiempo_max=" + tiempo_max + ", especialidadesPosibles=" + especialidadesPosibles + '}';
    }
    
    
}
