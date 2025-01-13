package com.example.cristianvellio.LiterAlura.repository;

import com.example.cristianvellio.LiterAlura.model.Autor;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    @Query("SELECT a FROM Autor a WHERE LOWER(a.nombre) LIKE LOWER(:nombre)")
    Optional<Autor> obtenerAutorPorNombre(String nombre);

    @Query("SELECT a FROM Autor a WHERE :anio>=a.fechaNacimiento AND :anio<a.fechaFallecimiento")
    List<Autor> obtenerAutoresVivosEnAnio(int anio);
}