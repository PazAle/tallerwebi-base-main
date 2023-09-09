package com.tallerwebi.dominio;

import java.util.List;

public interface ServicioLibro {
    List<Libro> obtener();

    Libro obtener(Integer codigoIsbn);
}
