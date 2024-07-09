package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {
    Products findByName(String name);
}

