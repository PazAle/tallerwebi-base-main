package com.tallerwebi.dominio.Libro;

import com.tallerwebi.dominio.Libro.ServicioLibro;
import com.tallerwebi.infraestructura.RepositorioLibro;
import com.tallerwebi.infraestructura.RepositorioLibroImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import java.util.List;
@Service
public class ServicioLibroImpl implements ServicioLibro {

    private RepositorioLibro repositorioLibro;

    @Autowired
    public ServicioLibroImpl(RepositorioLibro repositorioLibro){
        this.repositorioLibro = repositorioLibro;
    }
    @Override
    public Set<Libro> getLibros() {
        return repositorioLibro.getLibros();
    }

    @Override
    public Libro getLibro(Integer id) {
        return repositorioLibro.getLibro(id);
    }
}
