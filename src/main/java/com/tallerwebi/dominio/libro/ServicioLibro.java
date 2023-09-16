package com.tallerwebi.dominio.libro;
import java.util.Set;

public interface ServicioLibro {

    public Set<Libro> getLibros();

    public Libro getLibro(Long id);
}
