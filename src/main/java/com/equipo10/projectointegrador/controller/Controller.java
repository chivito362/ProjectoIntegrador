package com.equipo10.projectointegrador.controller;

import com.equipo10.projectointegrador.model.Cliente;
import com.equipo10.projectointegrador.model.Especialidad;
import com.equipo10.projectointegrador.model.Incidente;
import com.equipo10.projectointegrador.model.RazonSocial;
import com.equipo10.projectointegrador.model.Rol;
import com.equipo10.projectointegrador.model.Servicio;
import com.equipo10.projectointegrador.model.Tecnico;
import com.equipo10.projectointegrador.model.Tipo;
import com.equipo10.projectointegrador.model.Usuario;
import java.util.List;

public class Controller {

    PersistenceController controlPersis = new PersistenceController();

    // Métodos para la entidad Rol
    public void crearRol(Rol rol) {
        controlPersis.crearRol(rol);
    }

    public Rol traerRol(int id) {
        return controlPersis.traerRol(id);
    }

    public void borrarRol(int id) {
        controlPersis.borrarRol(id);
    }

    public void editarRol(Rol rol) {
        controlPersis.editarRol(rol);
    }

    // Métodos para la entidad Usuario
    public void crearUsuario(Usuario usuario) {
        controlPersis.crearUsuario(usuario);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    public void editarUsuario(Usuario usuario) {
        controlPersis.editarUsuario(usuario);
    }

    // Métodos para la entidad Cliente
    public void crearCliente(Cliente cliente) {
        controlPersis.crearCliente(cliente);
    }

    public Cliente traerCliente(int id) {
        return controlPersis.traerCliente(id);
    }

    public void borrarCliente(int id) {
        controlPersis.borrarCliente(id);
    }

    public void editarCliente(Cliente cliente) {
        controlPersis.editarCliente(cliente);
    }

    // Métodos para la entidad Tecnico
    public void crearTecnico(Tecnico tecnico) {
        controlPersis.crearTecnico(tecnico);
    }

    public Tecnico traerTecnico(int id) {
        return controlPersis.traerTecnico(id);
    }

    public void borrarTecnico(int id) {
        controlPersis.borrarTecnico(id);
    }

    public void editarTecnico(Tecnico tecnico) {
        controlPersis.editarTecnico(tecnico);
    }

    // Métodos para la entidad Tipo
    public void crearTipo(Tipo tipo) {
        controlPersis.crearTipo(tipo);
    }

    public Tipo traerTipo(int id) {
        return controlPersis.traerTipo(id);
    }

    public void borrarTipo(int id) {
        controlPersis.borrarTipo(id);
    }

    public void editarTipo(Tipo tipo) {
        controlPersis.editarTipo(tipo);
    }

    // Métodos para la entidad Incidente
    public void crearIncidente(Incidente incidente) {
        controlPersis.crearIncidente(incidente);
    }

    public Incidente traerIncidente(int id) {
        return controlPersis.traerIncidente(id);
    }

    public void borrarIncidente(int id) {
        controlPersis.borrarIncidente(id);
    }

    public void editarIncidente(Incidente incidente) {
        controlPersis.editarIncidente(incidente);
    }

    // Métodos para la entidad Especialidad
    public void crearEspecialidad(Especialidad especialidad) {
        controlPersis.crearEspecialidad(especialidad);
    }

    public Especialidad traerEspecialidad(int id) {
        return controlPersis.traerEspecialidad(id);
    }

    public void borrarEspecialidad(int id) {
        controlPersis.borrarEspecialidad(id);
    }

    public void editarEspecialidad(Especialidad especialidad) {
        controlPersis.editarEspecialidad(especialidad);
    }
    //Métodos para la entidad RazonSocial
    public void crearRazonSocial(RazonSocial razonSocial) {
        controlPersis.crearRazonSocial(razonSocial);
    }

    public RazonSocial traerRazonSocial(int id) {
        return controlPersis.traerRazonSocial(id);
    }

    public void borrarRazonSocial(int id) {
        controlPersis.borrarRazonSocial(id);
    }

    public void editarRazonSocial(RazonSocial razonSocial) {
        controlPersis.editarRazonSocial(razonSocial);
    }
    // Métodos para la entidad Servicio
    public void crearServicio(Servicio servicio) {
        controlPersis.crearServicio(servicio);
    }

    public Servicio traerServicio(int id) {
        return controlPersis.traerServicio(id);
    }

    public void borrarServicio(int id) {
        controlPersis.borrarServicio(id);
    }

    public void editarServicio(Servicio servicio) {
        controlPersis.editarServicio(servicio);
    }

    // Método adicional para traer todos los servicios
    public List<Servicio> traerTodosLosServicios() {
        return controlPersis.traerTodosLosServicios();
    }
    //Traer TODOS
    
    public List<Rol> traerTodosRoles() {
        return controlPersis.traerTodosRoles();
    }

    public List<Cliente> traerTodosClientes() {
        return controlPersis.traerTodosClientes();
    }

    public List<Tecnico> traerTodosTecnicos() {
        return controlPersis.traerTodosTecnicos();
    }

    public List<Tipo> traerTodosTipos() {
        return controlPersis.traerTodosTipos();
    }

    public List<Incidente> traerTodosIncidentes() {
        return controlPersis.traerTodosIncidentes();
    }

    public List<Especialidad> traerTodasEspecialidades() {
        return controlPersis.traerTodasEspecialidades();
    }

    public List<Usuario> traerTodosUsuarios() {
        return controlPersis.traerTodosUsuarios();
    }
    public List<RazonSocial> traerTodasLasRazonesSociales() {
        return controlPersis.traerTodasLasRazonesSociales();
    }

}
