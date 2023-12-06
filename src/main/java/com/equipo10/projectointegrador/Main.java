package com.equipo10.projectointegrador;

import com.equipo10.projectointegrador.controller.Controller;
import com.equipo10.projectointegrador.model.Rol;
import com.equipo10.projectointegrador.model.Usuario;
import com.equipo10.projectointegrador.view.Login;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller=new Controller();
        //Crear Roles
//        List<Rol> roles=List.of(new Rol(1, "RRHH"),new Rol(2, "Area Comercial"),new Rol(3, "Mesa de Ayuda"),new Rol(4,"Admin"));
//        roles.stream().forEach(c->controller.crearRol(c));
//        Usuario usuario=new Usuario("admin", "admin", roles.get(3));
//        controller.crearUsuario(usuario);
        
        Login login=new Login(controller);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
