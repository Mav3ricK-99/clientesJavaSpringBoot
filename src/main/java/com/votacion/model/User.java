package com.votacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="cliente")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id_cliente;

    @Column(name = "nombre")
    @NotBlank(message = "Name is mandatory")
    protected String nombre;

    @Column(name = "apellido")
    protected String apellido;

    @Column(name = "email")
    protected String email;

    @Column(name = "telefono")
    protected String telefono;

    @Column(name = "saldo")
    protected Double saldo;

    public User() {
    }

    public User(Long id) {
        this.id_cliente = id;
    }

    public User(String nombre, String apellido, String email, String telefono, Double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public User(Long id, String nombre, String apellido, String email, String telefono, Double saldo) {
        this(nombre, apellido, email, telefono, saldo);
        this.id_cliente = id;
    }

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
}
