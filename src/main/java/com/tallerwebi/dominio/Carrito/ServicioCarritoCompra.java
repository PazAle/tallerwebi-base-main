package com.tallerwebi.dominio.Carrito;

import com.tallerwebi.dominio.Libro.Libro;
import com.tallerwebi.dominio.Usuario;

import java.util.List;

public interface ServicioCarritoCompra {
    void agregarLibroAlCarrito(Usuario usuario, Libro libro);
    void quitarLibroDelCarrito(Usuario usuario, Libro libro);
    List<Libro> obtenerLibrosEnCarrito(Usuario usuario);
    void modificarCantidadLibro(Libro libro, Integer nuevaCantidad, Usuario usuario);
}
