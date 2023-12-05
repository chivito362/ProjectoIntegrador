package com.equipo10.projectointegrador;

import com.equipo10.projectointegrador.controller.Controller;
import com.equipo10.projectointegrador.model.Rol;

public class Main {

    public static void main(String[] args) {
        Controller controller=new Controller();
        Rol rol=new Rol(1, "RRHH");
        controller.crearRol(rol);
    }
}
