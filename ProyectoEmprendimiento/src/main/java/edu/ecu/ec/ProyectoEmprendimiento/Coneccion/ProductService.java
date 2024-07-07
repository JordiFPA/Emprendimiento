package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Products p) {
        productRepository.save(p);
    }

    public Products getProductByName(String name) {
        return productRepository.findByName(name);
    }
}

