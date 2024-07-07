package edu.ecu.ec.ProyectoEmprendimiento.Models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    private String placa;

    @Column(name = "name_client")
    private String name_client;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "dir")
    private String dir;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Invoice> invoices;

    public Client() {
    }

    public Client(String placa, String name_client, String email, String phone, String dir, List<Invoice> invoices) {
        this.placa = placa;
        this.name_client = name_client;
        this.email = email;
        this.phone = phone;
        this.dir = dir;
        this.invoices = invoices;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "Client{" +
                "placa='" + placa + '\'' +
                ", name_client='" + name_client + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phone + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}
