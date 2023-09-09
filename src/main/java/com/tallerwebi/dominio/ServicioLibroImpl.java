package com.tallerwebi.dominio;

import com.tallerwebi.infraestructura.RepositorioLibroImpl;

import java.util.List;

public class ServicioLibroImpl implements ServicioLibro {

    private RepositorioLibro repositorioLibro;

    public ServicioLibroImpl(RepositorioLibro repositorioLibro){
        this.repositorioLibro = repositorioLibro;
    }

    @Override
    public List<Libro> obtener() {
        return repositorioLibro.obtenerConRepositorio();
    }

    @Override
    public Libro obtener(Integer codigoIsbn) {
        return repositorioLibro.obtenerConRepositorio(456,"Harry Potter y la cámara Secreta");
        //return new Libro(456,"Harry Potter y la cámara Secreta");
    }
}
