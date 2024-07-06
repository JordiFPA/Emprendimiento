package edu.ecu.ec.ProyectoEmprendimiento.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<ProductSale> productSales;

    @Column(name = "total_amount")
    private double totalAmount;


}
