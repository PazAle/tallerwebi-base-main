package com.tallerwebi.dominio.comentario;

import com.tallerwebi.dominio.usuario.Usuario;
import com.tallerwebi.dominio.libro.Libro;

import java.util.Date;

public class Comentario {
    private Integer id;
    private String texto;
    private Usuario usuario;
    private Libro libro;
    private Date fecha;

    public Comentario(Integer id, String texto, Usuario usuario, Libro libro, Date fecha) {
        this.id = id;
        this.texto = texto;
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
