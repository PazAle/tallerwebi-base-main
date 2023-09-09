package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Libro.Libro;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class RepositorioLibroImpl implements RepositorioLibro {
    @Override
    public Set<Libro> getLibros() {
        Set<Libro> libros = new HashSet<>();
        return libros;

    }

    @Override
    public Libro getLibro(Integer id) {
        return new Libro(id);
    }
}