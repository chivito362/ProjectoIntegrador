
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
    private String user;
    private String pw;
    @JoinColumn(name="ROL")
    @OneToOne
    private Rol id_rol;

    public Usuario() {
    }

    public Usuario(int id_user, String user, String pw, Rol id_rol) {
        this.id_user = id_user;
        this.user = user;
        this.pw = pw;
        this.id_rol = id_rol;
    }

    public Usuario(String user, String pw, Rol id_rol) {
        this.user = user;
        this.pw = pw;
        this.id_rol = id_rol;
    }

    public Usuario(String user, String pw) {
        this.user = user;
        this.pw = pw;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_user=" + id_user + ", user=" + user + ", pw=" + pw + ", id_rol=" + id_rol + '}';
    }

    
    
    
}
