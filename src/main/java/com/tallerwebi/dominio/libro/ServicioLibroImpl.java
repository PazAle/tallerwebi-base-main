package com.tallerwebi.dominio.libro;

import com.tallerwebi.infraestructura.RepositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public Libro getLibro(Long id) {
        return repositorioLibro.buscarLibroPorId(id);
    }


}
