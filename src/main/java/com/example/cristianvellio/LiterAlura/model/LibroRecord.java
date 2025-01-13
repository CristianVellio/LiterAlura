package com.example.cristianvellio.LiterAlura.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroRecord(
                @JsonAlias("title") String titulo,
                @JsonAlias("authors") List<AutorRecord> autores,
                @JsonAlias("languages") List<String> idiomas,
                @JsonAlias("download_count") Integer numeroDeDescargas) {
}
