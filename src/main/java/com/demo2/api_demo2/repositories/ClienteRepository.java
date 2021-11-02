package com.demo2.api_demo2.repositories;

import com.demo2.api_demo2.models.ClienteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository <ClienteModel ,Long>{
    
}
