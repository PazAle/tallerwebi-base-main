package com.tallerwebi.dominio.Carrito;

import com.tallerwebi.dominio.Libro.Libro;
import com.tallerwebi.dominio.Libro.ServicioLibro;
import com.tallerwebi.dominio.RepositorioUsuario;
import com.tallerwebi.dominio.ServicioLogin;
import com.tallerwebi.dominio.Usuario;
import com.tallerwebi.infraestructura.RepositorioCarritoCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServicioCarritoCompraImpl implements ServicioCarritoCompra {

    private RepositorioCarritoCompra repositorioCarritoCompra;
    private RepositorioUsuario repositorioUsuario;
    private ServicioLogin servicioLogin;
    private ServicioLibro servicioLibro;


    public ServicioCarritoCompraImpl(RepositorioCarritoCompra repositorioCarritoCompra, RepositorioUsuario repositorioUsuario, ServicioLogin servicioLogin, ServicioLibro servicioLibro) {
        this.repositorioCarritoCompra=repositorioCarritoCompra;
        this.repositorioUsuario=repositorioUsuario;
        this.servicioLogin=servicioLogin;
        this.servicioLibro= servicioLibro;
    }

    @Override
    public void agregarLibroAlCarrito(Usuario usuario, Libro libro) {
        repositorioCarritoCompra.agregarLibroAlCarrito(usuario,libro);
    }

    @Override
    public void quitarLibroDelCarrito(Usuario usuario, Libro libro) {
        repositorioCarritoCompra.quitarLibroDelCarrito(usuario,libro);
    }

    @Override
    public List<Libro> obtenerLibrosEnCarrito(Usuario usuario) {
        return repositorioCarritoCompra.obtenerLibrosEnCarrito(usuario);
    }

    @Override
    public void modificarCantidadLibro(Libro libro, Integer nuevaCantidad, Usuario usuario) {
         repositorioCarritoCompra.modificarCantidadLibro(libro,nuevaCantidad,usuario);
    }
}
