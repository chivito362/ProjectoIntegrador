
package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_cliente;
    @ManyToOne
    private RazonSocial razonSocial;
    private String cuit;
    private String mail;

    public Cliente() {
    }

    public Cliente(int id_cliente, RazonSocial razonSocial, String cuit, String mail) {
        this.id_cliente = id_cliente;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
    }

    public Cliente(RazonSocial razonSocial, String cuit, String mail) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public RazonSocial getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(RazonSocial razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", razonSocial=" + razonSocial + ", cuit=" + cuit + ", mail=" + mail + '}';
    }
    
    
}
