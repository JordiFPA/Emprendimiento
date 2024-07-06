package edu.ecu.ec.ProyectoEmprendimiento.Models;

import jakarta.persistence.*;

@Entity
public class Gasoline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private double quantity;

    public Gasoline() {
    }

    public Gasoline(Long id, String type, double quantity, double price) {
        this.id = id;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
