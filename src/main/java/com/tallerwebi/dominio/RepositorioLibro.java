package com.tallerwebi.dominio;

import java.util.List;

public interface RepositorioLibro {

    List<Libro> obtenerConRepositorio();

    Libro obtenerConRepositorio(int i, String s);
}
