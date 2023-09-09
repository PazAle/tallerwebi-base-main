package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Libro.Libro;

import java.util.Set;

public interface RepositorioLibro {
    public Set<Libro> getLibros();

    public Libro getLibro(Integer id);
}
