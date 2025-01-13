package com.example.cristianvellio.LiterAlura.config;

import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;

@Configuration
public class Config {
    private static final Dotenv dotenv = Dotenv.load();

    public static String getApiKey() {
        return dotenv.get("API_KEY");
    }

    public static String getApiKeyOpenAi() {
        return dotenv.get("API_GPT");
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
