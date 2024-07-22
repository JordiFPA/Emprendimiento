package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Invoice;
import edu.ecu.ec.ProyectoEmprendimiento.Models.ProductSale;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ProductoSaleRepository productSaleRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public Invoice createSalesOrder(Client client, List<ProductSale> productSales) {
        double totalAmount = 0.0;

        // Update inventory and calculate total amount
        for (ProductSale productSale : productSales) {
            Products product = productRepository.findById(productSale.getProduct().getId()).orElseThrow(() -> new RuntimeException("Product not found"));
            if (product.getStock() < productSale.getQuantity()) {
                throw new RuntimeException("Insufficient stock for product: " + product.getName());
            }
            product.setStock(product.getStock() - productSale.getQuantity());
            productRepository.save(product);

            totalAmount += product.getPrice() * productSale.getQuantity();
        }

        // Save the invoice
        Invoice invoice = new Invoice(client, productSales, totalAmount);
        return invoiceRepository.save(invoice);
    }
}