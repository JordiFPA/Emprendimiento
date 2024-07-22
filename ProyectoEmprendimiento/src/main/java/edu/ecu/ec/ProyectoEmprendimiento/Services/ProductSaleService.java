package edu.ecu.ec.ProyectoEmprendimiento.Services;

import edu.ecu.ec.ProyectoEmprendimiento.Models.ProductSale;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import edu.ecu.ec.ProyectoEmprendimiento.Repositorios.ProductRepository;
import edu.ecu.ec.ProyectoEmprendimiento.Repositorios.ProductoSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductSaleService {

    @Autowired
    private ProductoSaleRepository productSaleRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<ProductSale> getAllProductSales() {
        return productSaleRepository.findAll();
    }

    public ProductSale getProductSaleById(Long id) {
        return productSaleRepository.findById(id).orElse(null);
    }

    public ProductSale createProductSale(ProductSale productSale) {
        Products product = productRepository.findById(productSale.getProduct().getId()).orElseThrow(() -> new RuntimeException("Product not found"));
        if (product.getStock() < productSale.getQuantity()) {
            throw new RuntimeException("Insufficient stock for product: " + product.getName());
        }
        product.setStock(product.getStock() - productSale.getQuantity());
        productRepository.save(product);

        return productSaleRepository.save(productSale);
    }

    public ProductSale updateProductSale(Long id, ProductSale updatedProductSale) {
        Optional<ProductSale> existingProductSaleOptional = productSaleRepository.findById(id);
        if (existingProductSaleOptional.isPresent()) {
            ProductSale existingProductSale = existingProductSaleOptional.get();
            existingProductSale.setProduct(updatedProductSale.getProduct());
            existingProductSale.setQuantity(updatedProductSale.getQuantity());
            existingProductSale.setTotal(updatedProductSale.calculateTotal());
            return productSaleRepository.save(existingProductSale);
        } else {
            return null;
        }
    }

    public void deleteProductSale(Long id) {
        productSaleRepository.deleteById(id);
    }
}