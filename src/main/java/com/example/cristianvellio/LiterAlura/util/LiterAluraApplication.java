package com.example.cristianvellio.LiterAlura.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.cristianvellio.LiterAlura.principal.Principal;
import com.example.cristianvellio.LiterAlura.service.MenuService;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.cristianvellio.LiterAlura")
@EnableJpaRepositories(basePackages = "com.example.cristianvellio.LiterAlura.repository")
@EntityScan(basePackages = "com.example.cristianvellio.LiterAlura.model")
public class LiterAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Autowired
	private MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(menuService);
		principal.EjecutarAplicacion();
	}

}
