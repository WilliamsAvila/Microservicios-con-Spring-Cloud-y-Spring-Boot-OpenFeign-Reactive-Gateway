## Guia de Microservicios con Spring Cloud, Spring Boot, OpenFeign y Reactive Gateway
<img width="959" alt="Micro Servicios" src="https://github.com/user-attachments/assets/653de87b-7cc1-43a7-915c-a8d9d74b9182" />

Este proyecto se basa en una guia facil y rapida para implementar y dirtribuir micro-servicios a nuestro proyecto.

Tecnologias implementadas:

1. Spring Boot:

Spring Boot es un marco de trabajo basado en Spring que simplifica la creación de aplicaciones Java. Te permite crear aplicaciones independientes, listas para producción, con configuración mínima. En una arquitectura de microservicios, Spring Boot se usa para crear cada servicio.
2. Eureka Server:

Eureka es una herramienta de descubrimiento de servicios, parte de la suite de Spring Cloud. En una arquitectura de microservicios, cada servicio debe registrarse para que otros servicios puedan descubrirlo y comunicarse con él. Eureka Server actúa como un "registro" centralizado donde los servicios se registran.
3. Config Server:

Spring Cloud Config Server centraliza la configuración de todas las aplicaciones. En lugar de tener archivos de configuración dispersos por todos los microservicios, puedes usar un Config Server para que todos los microservicios obtengan su configuración desde un único lugar.

4. OpenFeign:

OpenFeign es una librería declarativa que facilita las peticiones HTTP entre microservicios. Con OpenFeign, puedes crear interfaces Java que representan las APIs de otros servicios y realizar solicitudes HTTP automáticamente, sin necesidad de escribir código detallado para cada llamada.



