package ec.edu.ups.practicaMicroserviciosDocker.service;

import ec.edu.ups.practicaMicroserviciosDocker.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product p);
    Product update(Product p);
    List<Product> listAll();
    Product findById(Integer id);
    void delete(Integer id);
}
