package com.votacion.model;

import java.io.Serializable;


public class UserDTO implements Serializable{
    
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Double saldo;
    
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public Double getSaldo() {
        return this.saldo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
