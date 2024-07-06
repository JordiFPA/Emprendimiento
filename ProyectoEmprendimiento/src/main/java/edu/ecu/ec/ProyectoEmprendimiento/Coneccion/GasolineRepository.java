package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Gasoline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GasolineRepository extends JpaRepository<Gasoline,Long> {
    Gasoline getGasolinebyType(String type);
}
