package edu.ecu.ec.ProyectoEmprendimiento.Services;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Invoice;
import edu.ecu.ec.ProyectoEmprendimiento.Models.ProductSale;
import edu.ecu.ec.ProyectoEmprendimiento.Repositorios.InvoiceRepository;
import edu.ecu.ec.ProyectoEmprendimiento.Repositorios.ProductoSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ProductoSaleRepository productSaleRepository;

    public Invoice createInvoice(Client client, List<ProductSale> productSales, double totalAmount) {
        Invoice invoice = new Invoice(client, productSales, totalAmount, LocalDate.now());
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id).orElse(null);
    }
}
