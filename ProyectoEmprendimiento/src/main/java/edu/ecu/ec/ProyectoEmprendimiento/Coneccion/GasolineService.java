package edu.ecu.ec.ProyectoEmprendimiento.Coneccion;

import edu.ecu.ec.ProyectoEmprendimiento.Models.Gasoline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GasolineService {
    @Autowired
    GasolineRepository gasolineRepository;

    public void save(Gasoline g){
        gasolineRepository.save(g);
    }
    public Gasoline getGasoline(String type){
        return gasolineRepository.getGasolinebyType(type);
    }

}
