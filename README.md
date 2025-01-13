# LiterAlura 📖

<div align="center">
  <img src="https://github.com/user-attachments/assets/b9507675-876c-4326-b198-77eb1f6ad705" alt="literatura" width="200" height="200">

</div>



LiterAlura es una aplicación de gestión de libros desarrollada en Java con Spring Boot. Permite administrar una biblioteca digital con información sobre libros, autores e idiomas.

## Tecnologías Utilizadas

- Java 21
- Spring Boot 3.4.1
- PostgreSQL
- JPA/Hibernate
- Maven

## Estructura del Proyecto

```
LiterAlura/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/cristianvellio/LiterAlura/
│   │   │       ├── model/
│   │   │       │   ├── Autor.java
│   │   │       │   ├── Libro.java
│   │   │       │   └── Idioma.java
│   │   │       ├── repository/
│   │   │       │   ├── AutorRepository.java
│   │   │       │   └── LibroRepository.java
│   │   │       ├── service/
│   │   │       │   ├── LibroService.java
│   │   │       │   └── MenuService.java
│   │   │       ├── principal/
│   │   │       │   └── Principal.java
│   │   │       └── util/
│   │   │           └── LiterAluraApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## Configuración

### Base de Datos

La aplicación utiliza PostgreSQL como base de datos. Asegúrate de tener PostgreSQL instalado y configura las credenciales en `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost/literalura_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
```

### Requisitos Previos

- JDK 21
- Maven
- PostgreSQL

## Instalación

1. Clona el repositorio:
```bash
git clone [URL_DEL_REPOSITORIO]
```

2. Navega al directorio del proyecto:
```bash
cd LiterAlura
```

3. Compila el proyecto:
```bash
mvn clean install
```

4. Ejecuta la aplicación:
```bash
mvn spring-boot:run
```

## Características

- Gestión de libros (crear, leer, actualizar, eliminar)
- Registro de autores
- Soporte para múltiples idiomas
- Seguimiento del número de descargas
- Interfaz de línea de comandos interactiva

## Modelo de Datos

### Libro
- ID (Long)
- Título (String, único)
- Autor (Relación ManyToOne)
- Idioma (Enum)
- Número de descargas (Integer)

### Autor
- ID (Long)
- Nombre (String)
- Libros (Relación OneToMany)
