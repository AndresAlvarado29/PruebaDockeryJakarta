package ec.edu.ups.practicaMicroserviciosDocker.service;

import ec.edu.ups.practicaMicroserviciosDocker.model.Cliente;
import ec.edu.ups.practicaMicroserviciosDocker.model.Product;

import java.util.List;

public interface ClienteService {
    Cliente save(Cliente c);
    Cliente update(Cliente c);
    List<Cliente> listAll();
    Cliente findById(String id);
    void delete(String id);
}
