package com.example.cristianvellio.LiterAlura.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.cristianvellio.LiterAlura.model.LibroRecord;

@Component
public class JsonParser {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public List<LibroRecord> parsearLibros(String jsonString) throws IOException {
        return objectMapper.readValue(jsonString, new TypeReference<List<LibroRecord>>() {
        });
    }
}