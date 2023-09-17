package com.tallerwebi.dominio.Carrito;

import com.tallerwebi.dominio.Libro.Libro;
import com.tallerwebi.dominio.Usuario;

public class Pedido {
    private Integer id;

    private Usuario usuario;

    private Libro libro;

    private Integer cantidad;

    public Pedido(Usuario usuario, Libro libro, Integer cantidad) {
        this.usuario = usuario;
        this.libro = libro;
        this.cantidad = cantidad;
    }

}
