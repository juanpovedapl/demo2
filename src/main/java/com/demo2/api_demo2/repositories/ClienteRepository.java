package com.demo2.api_demo2.repositories;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;

import com.demo2.api_demo2.models.ClienteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository <ClienteModel ,Long>{
   
    public abstract  ArrayList <ClienteModel> findByNombre (String nombre);

    @Query ("{fRegistro:'?0'}")
    ArrayList <ClienteModel> findByFRegistro(LocalDate fRegistro);
}
