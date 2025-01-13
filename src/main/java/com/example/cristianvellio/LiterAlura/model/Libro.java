package com.example.cristianvellio.LiterAlura.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @ManyToOne
    private Autor autor;
    @Enumerated(EnumType.STRING)
    private Idioma idioma;
    private Integer numeroDeDescargas;

    public Libro(String titulo, Idioma idioma, Integer numeroDeDescargas, String enlace) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.numeroDeDescargas = numeroDeDescargas;
    }

    public Libro(LibroRecord libro) {
        this.titulo = libro.titulo();

        Optional<AutorRecord> autor = libro.autores().stream().findFirst();
        autor.ifPresent(autorRecord -> this.autor = new Autor(autorRecord));

        Optional<String> idioma = libro.idiomas().stream().findFirst();
        idioma.ifPresent(s -> this.idioma = Idioma.stringToEnum(s));

        this.numeroDeDescargas = libro.numeroDeDescargas();
    }

    public Libro() {
    }

    ;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Integer getNumeroDeDescargas() {
        return numeroDeDescargas;
    }

    public void setNumeroDeDescargas(Integer numeroDeDescargas) {
        this.numeroDeDescargas = numeroDeDescargas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void imprimirInformacion() {
        System.out.println("*****Libro*****");
        System.out.println("Titulo:" + titulo);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Idioma: " + idioma.getIdiomaCompleto());
        System.out.println("Numero de Descargas: " + numeroDeDescargas);
        System.out.println("");
    }

    @Override
    public String toString() {
        return titulo;
    }
}