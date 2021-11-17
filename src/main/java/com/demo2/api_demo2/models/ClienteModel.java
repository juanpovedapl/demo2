package com.demo2.api_demo2.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;


public class ClienteModel {
    @Id
    private long id;
    
    private String nombre, apellido, email;
    private LocalDate fechaRegistro;
    private List<ProductModel> productos;
    private AddressModel  address;


    public ClienteModel() {
    }


    public ClienteModel(long id, String nombre, String apellido, String email, LocalDate fechaRegistro,
            List<ProductModel> productos, AddressModel address) {
    
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.productos = productos;
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


    public LocalDate getfechaRegistro() {
        return fechaRegistro;
    }


    public void setfechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    public List<ProductModel> getProductos() {
        return productos;
    }


    public void setProductos(List<ProductModel> productos) {
        this.productos = productos;
    }


    public AddressModel getAddress() {
        return address;
    }


    public void setAddress(AddressModel address) {
        this.address = address;
    }
    



    
}

