package com.equipo10.projectointegrador.controller;

import com.equipo10.projectointegrador.controller.exceptions.NonexistentEntityException;
import com.equipo10.projectointegrador.model.Cliente;
import com.equipo10.projectointegrador.model.Especialidad;
import com.equipo10.projectointegrador.model.Incidente;
import com.equipo10.projectointegrador.model.Rol;
import com.equipo10.projectointegrador.model.Tecnico;
import com.equipo10.projectointegrador.model.Tipo;
import com.equipo10.projectointegrador.model.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    RolJpaController rolJPA = new RolJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    ClienteJpaController cliJPA = new ClienteJpaController();
    TecnicoJpaController tecJPA = new TecnicoJpaController();
    TipoJpaController tipoJPA = new TipoJpaController();
    IncidenteJpaController inciJPA = new IncidenteJpaController();
    EspecialidadJpaController espeJPA = new EspecialidadJpaController();

    // Métodos para la entidad Rol
    void crearRol(Rol rol) {
        rolJPA.create(rol);
    }

    Rol traerRol(int id) {
        return rolJPA.findRol(id);
    }

    void borrarRol(int id) {
        try {
            rolJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
    }

    void editarRol(Rol rol) {
        try {
            rolJPA.edit(rol);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }
    
    // Métodos para la entidad Usuario
    void crearUsuario(Usuario usuario) {
        usuJPA.create(usuario);
    }

    Usuario traerUsuario(int id) {
        return usuJPA.findUsuario(id);
    }

    void borrarUsuario(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    void editarUsuario(Usuario usuario) {
        try {
            usuJPA.edit(usuario);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Métodos para la entidad Cliente
    void crearCliente(Cliente cliente) {
        cliJPA.create(cliente);
    }

    Cliente traerCliente(int id) {
        return cliJPA.findCliente(id);
    }

    void borrarCliente(int id) {
        try {
            cliJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    void editarCliente(Cliente cliente) {
        try {
            cliJPA.edit(cliente);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Métodos para la entidad Tecnico
    void crearTecnico(Tecnico tecnico) {
        tecJPA.create(tecnico);
    }

    Tecnico traerTecnico(int id) {
        return tecJPA.findTecnico(id);
    }

    void borrarTecnico(int id) {
        try {
            tecJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    void editarTecnico(Tecnico tecnico) {
        try {
            tecJPA.edit(tecnico);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Métodos para la entidad Tipo
    void crearTipo(Tipo tipo) {
        tipoJPA.create(tipo);
    }

    Tipo traerTipo(int id) {
        return tipoJPA.findTipo(id);
    }

    void borrarTipo(int id) {
        try {
            tipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    void editarTipo(Tipo tipo) {
        try {
            tipoJPA.edit(tipo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Métodos para la entidad Incidente
    void crearIncidente(Incidente incidente) {
        inciJPA.create(incidente);
    }

    Incidente traerIncidente(int id) {
        return inciJPA.findIncidente(id);
    }

    void borrarIncidente(int id) {
        try {
            inciJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    void editarIncidente(Incidente incidente) {
        try {
            inciJPA.edit(incidente);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Métodos para la entidad Especialidad
    void crearEspecialidad(Especialidad especialidad) {
        espeJPA.create(especialidad);
    }

    Especialidad traerEspecialidad(int id) {
        return espeJPA.findEspecialidad(id);
    }

    void borrarEspecialidad(int id) {
        try {
            espeJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    void editarEspecialidad(Especialidad especialidad) {
        try {
            espeJPA.edit(especialidad);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //Traer TODOS
    List<Rol> traerTodosRoles() {
        return rolJPA.findRolEntities();
    }

    List<Cliente> traerTodosClientes() {
        return cliJPA.findClienteEntities();
    }

    List<Tecnico> traerTodosTecnicos() {
        return tecJPA.findTecnicoEntities();
    }

    List<Tipo> traerTodosTipos() {
        return tipoJPA.findTipoEntities();
    }

    List<Incidente> traerTodosIncidentes() {
        return inciJPA.findIncidenteEntities();
    }

    List<Especialidad> traerTodasEspecialidades() {
        return espeJPA.findEspecialidadEntities();
}

    List<Usuario> traerTodosUsuarios() {
        return usuJPA.findUsuarioEntities();
    }
}
