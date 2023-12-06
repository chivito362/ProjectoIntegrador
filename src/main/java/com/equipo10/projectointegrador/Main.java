package com.equipo10.projectointegrador;

import com.equipo10.projectointegrador.controller.Controller;
import com.equipo10.projectointegrador.model.Especialidad;
import com.equipo10.projectointegrador.model.RazonSocial;
import com.equipo10.projectointegrador.model.Rol;
import com.equipo10.projectointegrador.model.Servicio;
import com.equipo10.projectointegrador.model.Tipo;
import com.equipo10.projectointegrador.model.Usuario;
import com.equipo10.projectointegrador.view.Login;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        
        //Crear Roles-----------------------
        List<Rol> roles = List.of(new Rol(1, "RRHH"), new Rol(2, "Area Comercial"), new Rol(3, "Mesa de Ayuda"), new Rol(4, "Admin"));
        roles.stream().forEach(c -> controller.crearRol(c));

        //Crear Usuarios--------------------
        List<Usuario> usuarios = List.of(
                new Usuario("admin", "admin", roles.get(3)),
                new Usuario("rrhh", "rrhh", roles.get(0)),
                new Usuario("comercial", "comercial", roles.get(1)),
                new Usuario("ayuda", "ayuda", roles.get(2)));
        usuarios.stream().forEach(us -> controller.crearUsuario(us));

        //Crear Especialidades--------------
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
         //Crear Servicios---------------
         List<Servicio> servicios=List.of(
                 new Servicio(1, "Software y Gestion"),
                 new Servicio(2, "Administracion y Sistemas"),
                 new Servicio(3, "SO.Aplicaciones")
         );
         servicios.stream().forEach(s->controller.crearServicio(s));
          //Crear RazonSocial--------------
          List<RazonSocial> razonesSociales=List.of(
          new RazonSocial(1, "Omni Services", servicios.get(0)),
          new RazonSocial(2, "Aplications QA", servicios.get(2)),
          new RazonSocial(3, "Sistematics IO", servicios.get(1))
          );
          razonesSociales.stream().forEach(r->controller.crearRazonSocial(r));

        //Tipos Errores
        Tipo tipo=new Tipo("Falla S.O", 5,new ArrayList<>());
        tipo.agregarEspecialidad(especialidades.get(0));
        tipo.agregarEspecialidad(especialidades.get(1));
        tipo.agregarEspecialidad(especialidades.get(2));
        //Login de acceso--------------------
        //CREDENCIALES admin-admin / rrhh-rrhh / comercial-comercial / ayuda-ayuda  SON 4 TIPOS DE USUARIOS
        Login login = new Login(controller);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
