package com.tallerwebi.dominio.libro;

import com.tallerwebi.dominio.autor.Autor;
import com.tallerwebi.dominio.categoria.Categoria;
import com.tallerwebi.dominio.comentario.Comentario;
import com.tallerwebi.dominio.editorial.Editorial;

import java.util.List;
import java.util.Objects;
import java.util.Date;

public class Libro {

    private final Long ID;
    private Autor autor;
    private Double precio;
    private Date fechaLanzamiento;
    private Categoria categoria;
    private Editorial editorial;
    private String idioma;
    private Integer paginas;
    private String imagen;
    private String resenia;
    private List<Comentario> comentarios;


    public Libro(Long id){
        this.ID = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Libro))
            return false;
        Libro libro = (Libro) o;
        return Objects.equals(ID, libro.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public Long getID() {
        return ID;
    }
}
