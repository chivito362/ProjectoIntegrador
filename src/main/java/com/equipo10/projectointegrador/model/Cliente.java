
package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_cliente;
    private String razonSocial;
    private long cuit;
    private String mail;

    public Cliente() {
    }

    public Cliente(int id_cliente, String razonSocial, long cuit, String mail) {
        this.id_cliente = id_cliente;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
    }

    public Cliente(String razonSocial, long cuit, String mail) {
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
