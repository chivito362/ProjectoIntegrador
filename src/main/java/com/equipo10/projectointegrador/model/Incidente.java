package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="incidentes")
public class Incidente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_incidente;
    private String descripcion;
    private Tipo tipo;
    private double tiempo_estimado;
    @Column(nullable=true)
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime fechaInicio;
    @Column(nullable=true)
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime fechaFin;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Tecnico tecnico;
    private boolean estado;
    public Incidente() {
    }

    public Incidente(int id_incidente, String descripcion, Tipo tipo, double tiempo_estimado, LocalDateTime fechaInicio, LocalDateTime fechaFin, Cliente cliente, Tecnico tecnico, boolean estado) {
        this.id_incidente = id_incidente;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.tiempo_estimado = tiempo_estimado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.estado = estado;
    }

    public Incidente(String descripcion, Tipo tipo, double tiempo_estimado, LocalDateTime fechaInicio, LocalDateTime fechaFin, Cliente cliente, Tecnico tecnico, boolean estado) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.tiempo_estimado = tiempo_estimado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.estado = estado;
    }

    public Incidente(int id_incidente, String descripcion, Tipo tipo, double tiempo_estimado, LocalDateTime fechaInicio, Cliente cliente, Tecnico tecnico, boolean estado) {
        this.id_incidente = id_incidente;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.tiempo_estimado = tiempo_estimado;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    public int getId_incidente() {
        return id_incidente;
    }

    public void setId_incidente(int id_incidente) {
        this.id_incidente = id_incidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getTiempo_estimado() {
        return tiempo_estimado;
    }

    public void setTiempo_estimado(double tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

        
    
}
