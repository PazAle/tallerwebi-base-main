package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.libro.Libro;

import java.util.Set;

public interface RepositorioLibro {
    public Set<Libro> getLibros();

    public Libro getLibro(Long id);
}
