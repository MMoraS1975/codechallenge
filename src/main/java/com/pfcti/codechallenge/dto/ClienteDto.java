package com.pfcti.codechallenge.dto;

import lombok.Data;

@Data
public class ClienteDto {
    private int id;

    private String nombre;
    private String apellidos;
    private String cedula;
    private String telefono;
    private String paisrecidencia;
    private String paisnacimiento;
    private String direccion;
    private String estado;
}
