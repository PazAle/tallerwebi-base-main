package com.tallerwebi.dominio;


import com.tallerwebi.dominio.Libro.Libro;
import com.tallerwebi.dominio.Libro.ServicioLibro;
import com.tallerwebi.dominio.Libro.ServicioLibroImpl;
import com.tallerwebi.infraestructura.RepositorioLibro;
import com.tallerwebi.infraestructura.RepositorioLibroImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ServicioLibroTest {

    public static final Integer ID = 3;
    private ServicioLibro servicioLibro;
    private RepositorioLibro repositorioLibro;

    @BeforeEach
    public void init(){
        this.servicioLibro = mock(ServicioLibro.class);
        this.repositorioLibro = mock(RepositorioLibro.class);
    }

    @Test
    public void queSePuedaObtenerUnaListaDeLibrosQueNoEsteVacia(){

        Set libros = new HashSet<>();
        libros.add(new Libro(1));
        libros.add(new Libro(2));
        libros.add(new Libro(3));
        libros.add(new Libro(4));
        libros.add(new Libro(5));

        when(this.servicioLibro.getLibros()).thenReturn(libros);

        Set<Libro> librosObtenidos = servicioLibro.getLibros();

        assertThat(librosObtenidos, not(empty()));
    }

    @Test
    public void queSePuedaObtenerUnaListaDeLibrosQueDevuelvaCincoLibros(){

        Set libros = new HashSet<>();
        libros.add(new Libro(1));
        libros.add(new Libro(2));
        libros.add(new Libro(3));
        libros.add(new Libro(4));
        libros.add(new Libro(5));

        when(this.servicioLibro.getLibros()).thenReturn(libros);

        Set<Libro> librosObtenidos = servicioLibro.getLibros();

        assertThat(librosObtenidos.size(), is(5));
    }

    @Test
    public void queSePuedaObtenerUnLibroPorSuId(){

        when(this.servicioLibro.getLibro(ID)).thenReturn(new Libro(ID));

        Libro libroObtenido = servicioLibro.getLibro(ID);

        assertThat(libroObtenido.getID(), is(ID));
    }
}
