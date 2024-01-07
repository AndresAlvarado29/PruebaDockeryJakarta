package ec.edu.ups.practicaMicroserviciosDocker.service;

import ec.edu.ups.practicaMicroserviciosDocker.model.Docente;
import ec.edu.ups.practicaMicroserviciosDocker.model.Product;

import java.util.List;

public interface DocenteService {
    Docente save(Docente d);
    Docente update(Docente d);
    List<Docente> listAll();
    Docente findById(String id);
    void delete(String id);
}
