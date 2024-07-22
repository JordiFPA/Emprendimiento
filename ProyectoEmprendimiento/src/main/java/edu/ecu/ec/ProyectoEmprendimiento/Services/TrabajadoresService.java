package edu.ecu.ec.ProyectoEmprendimiento.Services;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Trabajadores;
import edu.ecu.ec.ProyectoEmprendimiento.Repositorios.TrabajadoresRepository;
import jakarta.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajadoresService {
    @Autowired
    TrabajadoresRepository trabajadoresService;
    public void createTrabajador(Trabajadores t) {
        trabajadoresService.save(t);
    }
    @Transactional
    public Trabajadores buscarTrabajador(Long cedula) {
        Trabajadores trabajador = trabajadoresService.findById(cedula).orElse(null);
        if (trabajador != null) {
            Hibernate.initialize(trabajador.getContraseña());
        }
        return trabajador;
    }




}
