# FureverFunding

## Descripción
FureverFunding es un proyecto de crowdfunding para santuarios de animales. Está desarrollado con SpringBoot, JWT y MySQL.

## Estructura del Proyecto

### Back-end
El back-end está desarrollado en SpringBoot, gestionando las operaciones lógicas y las solicitudes HTTP.

### Base de Datos
La base de datos utilizada es MySQL, donde se almacenan todas las entidades del proyecto.

## Entidades y Endpoints

### User
- **POST /user/registerDonor** - Registra un Donador. Requiere: `email`, `name`, `lastname`, `password`.
- **POST /user/registerCreator** - Registra un Creador. Requiere: `email`, `name`, `lastname`, `password`, `rrs_fb` (Facebook), `rrs_ig` (Instagram), `place`, `photo`.
- **POST /user/registerAdmin** - Registra un Administrador.
- **POST /user/login** - Inicia sesión con el usuario.
- **GET /user/getAll** - Obtiene todos los usuarios registrados. Requiere permisos de Admin.
- **GET /user/{id}** - Obtiene un usuario por su ID. Solo para Admin.
- **DELETE /user/{id}** - Elimina un usuario por su ID.
- **PUT /user/{id}** - Actualiza un usuario específico.
- **PUT /user/updatePassword** - Actualiza la contraseña de un usuario. Requiere `email`.
- **GET /user/searchByEmail** - Busca un usuario por su email. Requiere el parámetro `searchterm`.
- **GET /user/getCreators** - Retorna todos los Creators.
- **GET /user/getDonors** - Retorna todos los Donors.

### Post
- **POST /post/save-post** - Guarda un post. Requiere: `name`, `data`, `image`. Endpoint accesible solo para Admin y Creator.
- **GET /post/all-post** - Obtiene todos los posts. Dominio público.
- **GET /post/user/{id}** - Obtiene los posts de un usuario (Creator) por su ID. Solo para Creator.
- **GET /post/post_id/{id}** - Obtiene un post por su ID.
- **PUT /post/updatePost** - Actualiza la información de un post. Uso restringido a Creator.
- **DELETE /post/deletePost/{id}** - Elimina un post. Exclusivo para Admin y Creator.
- **GET /post/searchByName** - Busca posts por nombre. Requiere el parámetro `searchName`.
- **GET /post/searchByData** - Busca posts por datos. Requiere el parámetro `searchData`.

### Comments
- **POST /comments/save-comments** - Guarda un comentario en un post. Requiere: `id_post`, `id_user`, `comment`. Uso para cualquier usuario registrado.
- **GET /comments/all-comments/{id}** - Obtiene todos los comentarios por ID de post.

## Requisitos del Sistema
- JDK 17 o superior
- MySQL
