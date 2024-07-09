package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    public List<Client> getAllProducts() {
        return clientRepository.findAll();
    }

    public Client updateClient(String placa, Client updatedClient) {
        Optional<Client> existingClientOptional = Optional.ofNullable(clientRepository.findByPlaca(placa));
        if (existingClientOptional.isPresent()) {
            Client existingClient = existingClientOptional.get();
            existingClient.setName_client(updatedClient.getName_client());
            existingClient.setEmail(updatedClient.getEmail());
            existingClient.setPhone(updatedClient.getPhone());
            existingClient.setDir(updatedClient.getDir());
            existingClient.setPlaca(updatedClient.getPlaca());
            return clientRepository.save(existingClient);
        } else {
            return null;
        }
    }



}
