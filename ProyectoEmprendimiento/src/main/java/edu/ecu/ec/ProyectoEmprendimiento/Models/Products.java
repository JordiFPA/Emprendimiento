package edu.ecu.ec.ProyectoEmprendimiento.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "stock")
    private int stock;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductSale> productSales;

    public Products() {
    }

    public Products(long id, String name, double price, int stock, List<ProductSale> productSales) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.productSales = productSales;
    }

    public Products(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<ProductSale> getProductSales() {
        return productSales;
    }

    public void setProductSales(List<ProductSale> productSales) {
        this.productSales = productSales;
    }

    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", name_product='" + name+ '\'' + ", price=" + price + ", stock=" + stock + '}';
    }
}


