package edu.ecu.ec.ProyectoEmprendimiento.Controlador;

import edu.ecu.ec.ProyectoEmprendimiento.Services.ClientService;
import edu.ecu.ec.ProyectoEmprendimiento.Services.InvoiceService;
import edu.ecu.ec.ProyectoEmprendimiento.Services.ProductService;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Invoice;
import edu.ecu.ec.ProyectoEmprendimiento.Models.ProductSale;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Container {
    @Autowired
     ClientService clientService;
    @Autowired
     ProductService productService;
    @Autowired
    private InvoiceService invoiceService;


    public void createClient(String placa, String name, String email, String phone, String dir) {
        Client client = new Client();
        client.setPlaca(placa);
        client.setName_client(name);
        client.setEmail(email);
        client.setPhone(phone);
        client.setDir(dir);
        clientService.save(client);
    }

    public Client getClientByPlaca(String placa) {
        return clientService.findByPlaca(placa);
    }

    public void createProduct(String name, double price, int stock) {
        productService.createProduct(new Products(name, price, stock));
    }

    public Products getProductByName(String nameProduct) {
        return productService.getProductByName(nameProduct);
    }
    public Invoice createInvoice(String placa, List<ProductSale> productSales) {
        Client client = getClientByPlaca(placa);
        double totalAmount = productSales.stream().mapToDouble(ps -> ps.getQuantity() * ps.getProduct().getPrice()).sum();
        return invoiceService.createInvoice(client, productSales, totalAmount);
    }

}












