package com.demo2.api_demo2.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressModel {
    private String ciudad;
    private String departamaento;
    private String codigoPostal;
}
