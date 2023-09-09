package com.tallerwebi.dominio.Libro;

import java.util.Objects;

public class Libro {

    private final Integer ID;

    public Libro(Integer id){
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

    public Integer getID() {
        return ID;
    }
}
