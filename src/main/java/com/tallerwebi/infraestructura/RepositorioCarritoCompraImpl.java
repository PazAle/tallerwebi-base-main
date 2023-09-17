package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Carrito.Pedido;
import com.tallerwebi.dominio.Libro.Libro;
import com.tallerwebi.dominio.Usuario;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RepositorioCarritoCompraImpl implements RepositorioCarritoCompra {

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioCarritoCompraImpl (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void agregarLibroAlCarrito(Usuario usuario, Libro libro) {
        sessionFactory.getCurrentSession().save(new Pedido(usuario,libro,1));
    }

    @Override
    public List<Libro> obtenerLibrosEnCarrito(Usuario usuario) {
        return null;
    }

    @Override
    public void quitarLibroDelCarrito(Usuario usuario, Libro libro) {

    }

    @Override
    public void modificarCantidadLibro(Libro libro, Integer nuevaCantidad, Usuario usuario) {

    }
}