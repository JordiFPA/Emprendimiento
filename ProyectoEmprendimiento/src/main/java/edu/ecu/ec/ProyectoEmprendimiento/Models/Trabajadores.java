package edu.ecu.ec.ProyectoEmprendimiento.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trabajadores {
    @Id
    private long cedula;
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "rango")
    private String rango;
    @Column(name = "contraseña")
    private String contraseña;

    public Trabajadores(long cedula, String contraseña, String rango, String nombre) {
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.rango = rango;
        this.nombre = nombre;
    }

    public Trabajadores() {
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
