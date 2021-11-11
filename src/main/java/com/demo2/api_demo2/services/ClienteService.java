package com.demo2.api_demo2.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import com.demo2.api_demo2.models.ClienteModel;
import com.demo2.api_demo2.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerClientes(){
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public boolean eliminarCliente(Long id){
        if (clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
    public Optional<ClienteModel> obtenerClientePorId(Long id){
        return clienteRepository.findById(id);
    }
      
    public ArrayList<ClienteModel> obtClientePorFRegistro(LocalDate fRegistro){
         return clienteRepository.findByFRegistro(fRegistro);
    }
    public ArrayList <ClienteModel> obtClientePorNombre(String nombre){
         return clienteRepository.findByNombre(nombre);
    }
}
