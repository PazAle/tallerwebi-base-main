package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Libro.Libro;
import com.tallerwebi.dominio.Usuario;

import java.util.List;


public interface RepositorioCarritoCompra {
    void agregarLibroAlCarrito(Usuario usuario, Libro libro);
    List <Libro> obtenerLibrosEnCarrito(Usuario usuario);
    void quitarLibroDelCarrito(Usuario usuario, Libro libro);
    void modificarCantidadLibro(Libro libro, Integer nuevaCantidad, Usuario usuario);
}
