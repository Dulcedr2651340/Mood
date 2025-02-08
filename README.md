# Mood App

Mood es una aplicación web para gestionar usuarios, publicaciones, comentarios, “likes” y etiquetas (tags).  
Su objetivo es permitir a los usuarios crear posts, comentarlos, darles “like” y asociarles tags.

## Características Principales

- **Usuarios**: Registro y gestión básica. Cada usuario puede crear múltiples posts y hacer comentarios o dar “like”.  
- **Posts**: Cada post pertenece a un usuario. Puede tener comentarios y “likes”, y asociarse a múltiples etiquetas (tags).  
- **Comentarios**: Vinculados a un post y un usuario.  
- **Likes**: Representados por una entidad intermedia (like) que une un usuario con un post.  
- **Tags**: Relación muchos-a-muchos con los posts.

## Estructura de la Base de Datos

Se crean las siguientes tablas (por ejemplo, en MySQL):
- `users`  
- `posts`  
- `comments`  
- `likes`  
- `tags`  
- `post_tags` (tabla intermedia para la relación muchos-a-muchos entre post y tag)

## Tecnologías

- **Java** (recomendado 17+)
- **Spring Boot** (para el servidor y la inyección de dependencias)
- **Spring Data JPA** (con Hibernate)
- **MySQL** (o el motor de BD que uses)
- **Maven** (o Gradle) para la gestión de dependencias

## Requisitos

1. Java instalado (idealmente versión 17).
2. Base de datos MySQL en ejecución (o configura la tuya).
3. Crear la base de datos `mooddb` (o el nombre que prefieras).
4. Ajustar las credenciales en `application.properties` o `application.yml`.

Ejemplo de `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mooddb
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.jpa.hibernate.ddl-auto=update
