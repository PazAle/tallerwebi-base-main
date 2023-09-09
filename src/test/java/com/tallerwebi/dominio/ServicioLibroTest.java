package com.tallerwebi.dominio;

import com.tallerwebi.infraestructura.RepositorioLibroImpl;
import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.Is.is;

public class ServicioLibroTest {

    ServicioLibro servicioLibro;
    RepositorioLibro repositorioLibro;

    @BeforeEach
    public void init(){
        this.repositorioLibro = new RepositorioLibroImpl();
        this.servicioLibro = new ServicioLibroImpl(this.repositorioLibro);
    }

    @Test
    public void obtenerLibrosPorISBN(){
        //preparacion
        Integer codigo_ISBN = 456;

        //ejecucion
        Libro libroObtenido = this.servicioLibro.obtener(codigo_ISBN);

        //verificacion
        assertThat(libroObtenido.getISBN(),is(456));
    }
}
