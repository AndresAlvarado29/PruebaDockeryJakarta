package ec.edu.ups.practicaMicroserviciosDocker.service;

import ec.edu.ups.practicaMicroserviciosDocker.model.Curso;
import ec.edu.ups.practicaMicroserviciosDocker.model.Product;

import java.util.List;

public interface CursoService {
    Curso save(Curso cu);
    Curso update(Curso cu);
    List<Curso> listAll();
    Curso findById(Integer id);
    void delete(Integer id);
}
