## Author

Juan Pablo Poveda Cañon

# SEGURIDAD EN APLICACIONES WEB Y WEBSOCKETS

artiendo de la aplicación web del tablero interactivo debe construir una aplicación web segura y que sea segura a a nivel de websockets.

Código inicial del tablero: https://github.com/dnielben/tableroInteractivo2023.git

a. Para asegurar la parte web debe usar autenticación basada en passwords y conexiones seguras sobre https.

b. Implemente un protocolo de seguridad para websockets como el siguiente:

El protocolo WebSocket no maneja la autorización o autenticación.

Un patrón común que parece resolver el problema de autenticación de WebSocket es un sistema de autenticación basado en un "ticket":
Cuando el código del lado del cliente decide abrir un WebSocket, se pone en contacto con el servidor HTTP para obtener un "ticket" de autorización.

El servidor genera este ticket. Por lo general, contiene algún tipo de ID de usuario / cuenta, la IP del cliente que solicita el ticket, una marca de tiempo y cualquier otro tipo de registro interno que pueda necesitar.

El servidor almacena este ticket (es decir, en una base de datos o caché) y también lo devuelve al cliente.

El cliente abre la conexión WebSocket y envía este "ticket" como parte de un apretón de manos inicial.

El servidor puede comparar este ticket, verificar las IP de origen, verificar que el ticket no se haya reutilizado y no haya expirado, y hacer cualquier otro tipo de verificación de permisos. Si todo va bien, la conexión WebSocket ahora se verifica.

Evolucione su backend para que sea totalmente stateless, es decir, que soporte fallas del servidor y escalamiento horizontal elástico.

## Prerequisitos

Maven: Automatiza y estandariza el flujo de vida de la construcción de software.

Git: Administrador descentralizado de configuraciones.

 
 
## Instalación

Clonamos el proyecto TallerSeguridadARSW donde se encuentra el backend de nuestra aplicación Web.  

```
git clone https://github.com/juancanon1725/TallerSeguridadARSW.git
```

## Ejecución

Para compilar el proyecto se debe usar:

```
 mvn clean install
```

Para ejecutar el proyecto utilizamos los comandos:

```
 mvn spring-boot:run 
```


https://github.com/user-attachments/assets/ab1c58c0-84fb-4d8a-a966-592d43809ae5


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

