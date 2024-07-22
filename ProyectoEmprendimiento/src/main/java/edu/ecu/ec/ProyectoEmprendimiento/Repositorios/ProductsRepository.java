package edu.ecu.ec.ProyectoEmprendimiento.Repositorios;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Long> {
}
