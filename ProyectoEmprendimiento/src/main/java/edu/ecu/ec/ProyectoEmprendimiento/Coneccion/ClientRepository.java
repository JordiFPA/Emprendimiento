package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findByPlaca(String placa);
}
