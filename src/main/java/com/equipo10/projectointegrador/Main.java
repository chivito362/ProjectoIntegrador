package com.equipo10.projectointegrador;

import com.equipo10.projectointegrador.controller.Controller;
import com.equipo10.projectointegrador.model.Especialidad;
import com.equipo10.projectointegrador.model.Rol;
import com.equipo10.projectointegrador.model.Usuario;
import com.equipo10.projectointegrador.view.Login;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        //Crear Roles
        List<Rol> roles = List.of(new Rol(1, "RRHH"), new Rol(2, "Area Comercial"), new Rol(3, "Mesa de Ayuda"), new Rol(4, "Admin"));
        roles.stream().forEach(c -> controller.crearRol(c));
        //Crear Usuarios
        List<Usuario> usuarios = List.of(
                new Usuario("admin", "admin", roles.get(3)),
                new Usuario("rrhh", "rrhh", roles.get(0)),
                new Usuario("comercial", "comercial", roles.get(1)),
                new Usuario("ayuda", "ayuda", roles.get(2)));
        usuarios.stream().forEach(us -> controller.crearUsuario(us));
        //Crear Especialidades
        List<Especialidad> especialidades = List.of(
                new Especialidad("LinuxUbuntu"),
                new Especialidad("Windows"),
                new Especialidad("MacOS"),
                new Especialidad("SAP"),
                new Especialidad("Tango"),
                new Especialidad("Windows+Tango"),
                new Especialidad("Linux+SAP"),
                new Especialidad("MacOS")
        );
        especialidades.stream().forEach(esp -> controller.crearEspecialidad(esp));

        //Login de acceso 
        Login login = new Login(controller);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
