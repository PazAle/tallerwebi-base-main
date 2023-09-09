package com.tallerwebi.dominio;

public class Libro {

    private Integer ISBN;
    private String titulo;


    public Libro(int isbn,String titulo) {
        this.ISBN = isbn;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }
}
