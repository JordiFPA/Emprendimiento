package edu.ecu.ec.ProyectoEmprendimiento;

import edu.ecu.ec.ProyectoEmprendimiento.Controlador.Container;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Invoice;
import edu.ecu.ec.ProyectoEmprendimiento.Models.ProductSale;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProyectoEmprendimientoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProyectoEmprendimientoApplication.class, args);

        Container container = context.getBean(Container.class);

        // Crear cliente
        container.createClient("PDS3175", "Jordi Pila", "jordifpa7@gmail.com", "0999066495", "Machachi");
        Client c = container.getClientByPlaca("PDS3175");
        System.out.println(c.getName_client());

        // Crear productos
        container.createProduct("Extra", 2.64, 100000);
        container.createProduct("Super", 3.65, 100000);
        Products p = container.getProductByName("Extra");
        System.out.println(p.getName());

        // Crear ventas de productos
        Products extra = container.getProductByName("Extra");
        Products superGas = container.getProductByName("Super");

        ProductSale sale1 = new ProductSale(null, extra, 10);
        ProductSale sale2 = new ProductSale(null, superGas, 5);

        List<ProductSale> sales = new ArrayList<>();
        sales.add(sale1);
        sales.add(sale2);

        // Crear factura
        Invoice invoice = container.createInvoice("PDS3175", sales);
        System.out.println(invoice);
    }
}
