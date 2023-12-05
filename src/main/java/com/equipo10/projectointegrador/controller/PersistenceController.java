package com.equipo10.projectointegrador.controller;

import com.equipo10.projectointegrador.model.Rol;


public class PersistenceController {
    RolJpaController rolJPA=new RolJpaController();
    UsuarioJpaController usuJPA= new UsuarioJpaController();
    ClienteJpaController cliJPA=new ClienteJpaController();
    TecnicoJpaController tecJPA=new TecnicoJpaController();
    TipoJpaController tipoJPA=new TipoJpaController();
    IncidenteJpaController inciJPA=new IncidenteJpaController();
    EspecialidadJpaController espeJPA=new EspecialidadJpaController();
    
    void crearRol(Rol rol) {
        rolJPA.create(rol);
    }
}
