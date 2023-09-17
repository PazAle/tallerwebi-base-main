package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.libro.Libro;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface RepositorioLibro {
    public Set<Libro> getLibros();

    public Libro buscarLibroPorId(Long id);

    void guardar(Libro libro);

    Libro buscarLibroPorNombre(String nombre);
}
