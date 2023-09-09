package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Libro;
import com.tallerwebi.dominio.RepositorioLibro;

import java.util.List;

public class RepositorioLibroImpl implements RepositorioLibro {

    @Override
    public List<Libro> obtenerConRepositorio() {
        return null;
    }

    @Override
    public Libro obtenerConRepositorio(int i, String s) {
        return new Libro(i,s);
    }
}
