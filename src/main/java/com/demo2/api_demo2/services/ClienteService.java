package com.demo2.api_demo2.services;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import com.demo2.api_demo2.models.ClienteModel;
import com.demo2.api_demo2.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerClientes(){
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente){
        cliente.setNombre(cliente.getNombre().toLowerCase()); //linea para poner en minuscula el nombre por entrada
        return clienteRepository.save(cliente);
    }

    public boolean eliminarCliente(String id){
        if (clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
    public Optional<ClienteModel> obtenerClientePorId(String id){
        return clienteRepository.findById(id);
    }
      
    public ArrayList<ClienteModel> obtenerPorApellido(String apellido){
         return clienteRepository.findByApellido(apellido);
    }
    public ArrayList <ClienteModel> obtenerPorNombre(String nombre){
         return clienteRepository.findByNombre(nombre);
    }
    public ArrayList <ClienteModel> obtenerFechaRegistro(LocalDate fechaRegistro){
        return clienteRepository.findByFechaRegistro(fechaRegistro);
   }
    public ArrayList <ClienteModel> obtenerClientePorCiudad(String ciudad){
        return clienteRepository.buPorCiudad(ciudad);
    }



}
