package com.equipo10.projectointegrador.controller;

import com.equipo10.projectointegrador.model.Rol;

public class Controller {
    PersistenceController controlPersis=new PersistenceController();

    public void crearRol(Rol rol) {
        controlPersis.crearRol(rol);
    }
}
