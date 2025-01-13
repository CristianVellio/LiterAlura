package com.example.cristianvellio.LiterAlura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cristianvellio.LiterAlura.model.Idioma;
import com.example.cristianvellio.LiterAlura.model.Libro;
import com.example.cristianvellio.LiterAlura.repository.LibroRepository;

@Service
public class LibroService {

    private LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository repository) {
        this.libroRepository = repository;
    }

    public LibroService() {
    };

    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }

    public Optional<Libro> obtenerLibroPorNombre(String nombre) {
        return libroRepository.obtenerLibroPorNombre(nombre);
    }

    public List<Libro> obtenerLibrosPorIdioma(Idioma idioma) {
        return libroRepository.obtenerLibrosPorIdioma(idioma);
    }

    public void guardarLibro(Libro libro) {
        libroRepository.save(libro);
    }
}