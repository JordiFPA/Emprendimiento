package edu.ecu.ec.ProyectoEmprendimiento.Models;


import jakarta.persistence.*;

@Entity
public class ProductSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total")
    private double total;

    public ProductSale() {
    }

    public ProductSale(Invoice invoice, Products product, int quantity) {
        this.invoice = invoice;
        this.product = product;
        this.quantity = quantity;
        this.total = calculateTotal(); // Calculamos el total en el constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.total = calculateTotal(); // Recalculamos el total al cambiar la cantidad
    }

    public double getTotal() {
        return total;
    }

    private double calculateTotal() {
        if (product != null) {
            return product.getPrice() * quantity;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "ProductSale{" +
                "id=" + id +
                ", invoice=" + invoice +
                ", product=" + product +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
