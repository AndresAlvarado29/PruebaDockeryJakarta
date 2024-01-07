package ec.edu.ups.practicaMicroserviciosDocker.service;

import ec.edu.ups.practicaMicroserviciosDocker.model.Cliente;
import jakarta.inject.Named;

import java.util.List;

@Named
public class ClienteServiceImpl implements ClienteService{
    @Override
    public Cliente save(Cliente c) {
        return null;
    }

    @Override
    public Cliente update(Cliente c) {
        return null;
    }

    @Override
    public List<Cliente> listAll() {
        return null;
    }

    @Override
    public Cliente findById(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
