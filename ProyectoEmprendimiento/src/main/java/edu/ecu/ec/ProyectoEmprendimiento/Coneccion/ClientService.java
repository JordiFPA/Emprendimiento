package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public void save(Client c){
       clientRepository.save(c);
    }
    public Client findByPlaca(String placa) {
        return clientRepository.findByPlaca(placa);
    }



}
