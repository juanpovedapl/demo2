package com.demo2.api_demo2.repositories;


import java.time.LocalDate;
import java.util.ArrayList;

import com.demo2.api_demo2.models.ClienteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository <ClienteModel ,String>{
   
    ArrayList <ClienteModel> findByNombre (String nombre);

    ArrayList <ClienteModel> findByApellido (String apellido);

    ArrayList <ClienteModel> findByFechaRegistro(LocalDate fechaRegistro);
}
