package edu.ecu.ec.ProyectoEmprendimiento.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    private String placa;
    @Column(name = "name_client")
    private String name_client;
    @Column(name = "email")
    private String Email;
    @Column(name = "phone")
    private String Phone;
    @Column(name = "dir")
    private String dir;

    public Client() {
    }

    public Client(String placa, String name_client, String email, String phone, String dir) {
        this.placa = placa;
        this.name_client = name_client;
        Email = email;
        Phone = phone;
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getName_client() {
        return name_client;
    }

    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    @Override
    public String toString() {
        return "Client{" +
                "placa='" + placa + '\'' +
                ", name_client='" + name_client + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}
