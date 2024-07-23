## Author

Juan Pablo Poveda Cañon

# Taller - REDIS, Spring y Web Services

1. Configurar la seguridad e nivel de Web Services
2. Convertir la solución en totalmente sin estado, persistiendo la sesión y los valores de los tickets a REDIS
 
## Prerequisitos

Maven: Automatiza y estandariza el flujo de vida de la construcción de software.

Git: Administrador descentralizado de configuraciones.
 
## Instalación

Clonamos el proyecto TallerSeguridadARSW donde se encuentra el backend de nuestra aplicación Web.  

```
git clone https://github.com/juancanon1725/Taller-SecureWebSockets-REDIS.git
```

## Ejecución

Para compilar el proyecto se debe usar:

```
 mvn clean install
```

Iniciar instancia local de docker:

```
 docker run --name some-redis -p 45000:6379 -d redis
```

Para ejecutar el proyecto utilizamos los comandos:

```
 mvn spring-boot:run 
```

## Ejecución en AWS

https://github.com/user-attachments/assets/ab1c58c0-84fb-4d8a-a966-592d43809ae5

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

