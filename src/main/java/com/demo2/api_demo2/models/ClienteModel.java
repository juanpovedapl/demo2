package com.demo2.api_demo2.models;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ClienteModel implements Serializable{
    @Id
    private long id;
    
    private String nombre, apellido, email;
    private LocalDate fRegistro;
    private AddressModel address;

    public ClienteModel() {
    }


    public ClienteModel(long id, String nombre, String apellido, String email, LocalDate fRegistro, AddressModel address) {
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fRegistro = fRegistro;
        this.address = address;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getfRegistro() {
        return fRegistro;
    }


    public void setfRegistro(LocalDate fRegistro) {
        this.fRegistro = fRegistro;
    }
    
    public void setAddress (AddressModel address){
        this.address = address;
    }
    
    public AddressModel getAddress(){
        return address;
    }
}

