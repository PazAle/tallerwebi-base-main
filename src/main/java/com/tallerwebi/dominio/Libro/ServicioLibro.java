package com.tallerwebi.dominio.Libro;
import java.util.List;
import java.util.Set;

public interface ServicioLibro {

    public Set<Libro> getLibros();

    public Libro getLibro(Integer id);
}
