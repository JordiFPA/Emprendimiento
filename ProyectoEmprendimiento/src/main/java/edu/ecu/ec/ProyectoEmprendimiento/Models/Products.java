package edu.ecu.ec.ProyectoEmprendimiento.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Products {
    @Id
    private long id;
    @Column(name = "name_product")
    private String name_product;
    @Column(name = "price")
    private double price;
    @Column(name = "stock")
    private int stock;

    public Products() {
    }

    public Products(long id, String name_product, double price, int stock) {
        this.id = id;
        this.name_product = name_product;
        this.price = price;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name_product='" + name_product + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
