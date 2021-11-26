package com.demo2.api_demo2.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import com.demo2.api_demo2.models.ClienteModel;
import com.demo2.api_demo2.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes() {
        return clienteService.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente) {
        return clienteService.guardarCliente(cliente);

    }

    @DeleteMapping(path = "{id}")
    public String eliminarClientePorId(@PathVariable("id") String id) {
        boolean resultadoEliminar = this.clienteService.eliminarCliente(id);
        if (resultadoEliminar) {
            return "Se elimino el cliente con id: " + id;
        } else {
            return "Ocurrio un error el eliminar cliente con id: " + id;
        }
    }

    @GetMapping(path = "{id}")
    public Optional<ClienteModel> obteneClientePorId(@PathVariable("id") String id) {
        return this.clienteService.obtenerClientePorId(id);
    }

    @GetMapping(path = "apellido/{apellido}")
    public ArrayList<ClienteModel> cliantePorApellido(@PathVariable("apellido") String apellido) {
        return this.clienteService.obtenerPorApellido(apellido);
    }

    @GetMapping(path = "nombre/{nombre}")
    public ArrayList<ClienteModel> cliantePorNombre(@PathVariable("nombre") String nombre) {
        return this.clienteService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "registro/{registro}")
    public ArrayList<ClienteModel> clientePorFechaRegistro(@PathVariable("registro") LocalDate fechaRegistro) {
        return this.clienteService.obtenerFechaRegistro(fechaRegistro);
    }
    
    

}
