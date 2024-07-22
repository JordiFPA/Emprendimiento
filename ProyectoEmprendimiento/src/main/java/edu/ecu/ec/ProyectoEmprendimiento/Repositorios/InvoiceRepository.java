package edu.ecu.ec.ProyectoEmprendimiento.Repositorios;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
