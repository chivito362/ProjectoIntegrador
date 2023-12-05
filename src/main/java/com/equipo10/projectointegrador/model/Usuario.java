
package com.equipo10.projectointegrador.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_user;
    @JoinColumn(name="ROL")
    @OneToOne
    private Rol id_rol;

    public Usuario() {
    }

    public Usuario(Rol id_rol) {
        this.id_rol = id_rol;
    }

    public Usuario(int id_user, Rol id_rol) {
        this.id_user = id_user;
        this.id_rol = id_rol;
    }
    

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }
    
    
}
