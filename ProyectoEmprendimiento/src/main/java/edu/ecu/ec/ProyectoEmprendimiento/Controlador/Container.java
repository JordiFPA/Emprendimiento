package edu.ecu.ec.ProyectoEmprendimiento.Controlador;

import edu.ecu.ec.ProyectoEmprendimiento.Coneccion.ClientService;
import edu.ecu.ec.ProyectoEmprendimiento.Coneccion.GasolineService;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Gasoline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Container {
    @Autowired
    ClientService client;
    @Autowired
    GasolineService gasoline;

    public void createC(String placa, String name, String email, String phone, String dir) {
        Client c = new Client();
        c.setPlaca(placa);
        c.setName_client(name);
        c.setEmail(email);
        c.setPhone(phone);
        c.setDir(dir);
        client.save(c);
    }
    public Client getClientByPlaca(String placa) {
        return client.findByPlaca(placa);
    }

    public void createG(Long id, String type, double price, double quantity) {
        Gasoline g = new Gasoline();
        g.setId(id);
        g.setType(type);
        g.setPrice(price);
        g.setQuantity(quantity);
        gasoline.save(g);
    }

    public Gasoline getGasolineById(String type) {
        return gasoline.getGasoline(type);
    }




}
