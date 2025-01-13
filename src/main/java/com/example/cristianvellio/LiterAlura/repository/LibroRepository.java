package com.example.cristianvellio.LiterAlura.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.cristianvellio.LiterAlura.model.Idioma;
import com.example.cristianvellio.LiterAlura.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    @Query("SELECT l FROM Libro l WHERE LOWER(l.titulo) LIKE LOWER(:nombre)")
    Optional<Libro> obtenerLibroPorNombre(String nombre);

    @Query("SELECT l FROM Libro l WHERE l.idioma=:idioma")
    List<Libro> obtenerLibrosPorIdioma(Idioma idioma);
}