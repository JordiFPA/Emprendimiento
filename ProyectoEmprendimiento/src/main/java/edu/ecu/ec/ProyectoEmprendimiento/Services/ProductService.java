package edu.ecu.ec.ProyectoEmprendimiento.Services;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import edu.ecu.ec.ProyectoEmprendimiento.Repositorios.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Products p) {
        productRepository.save(p);
    }

    public Optional<Products> findById(long id){
        return productRepository.findById(id);
    }

    public Products getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products updateProduct(long id, Products updatedProduct) {
        Optional<Products> existingProductOptional = productRepository.findById(id);
        if (existingProductOptional.isPresent()) {
            Products existingProduct = existingProductOptional.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setStock(updatedProduct.getStock());
            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }

    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }
}

