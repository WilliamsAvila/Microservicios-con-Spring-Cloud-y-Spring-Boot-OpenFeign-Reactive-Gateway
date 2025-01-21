## Guia de Microservicios con Spring Cloud, Spring Boot, OpenFeign y Reactive Gateway
<img width="959" alt="Micro Servicios" src="https://github.com/user-attachments/assets/653de87b-7cc1-43a7-915c-a8d9d74b9182" />

Este proyecto se basa en una guia facil y rapida para implementar y dirtribuir micro-servicios a nuestro proyecto.

Tecnologias implementadas:

#### 1.Spring Boot:

Spring Boot es un marco de trabajo basado en Spring que simplifica la creación de aplicaciones Java. Te permite crear aplicaciones independientes, listas para producción, con configuración mínima. En una arquitectura de microservicios, Spring Boot se usa para crear cada servicio.

#### 2. Eureka Server:

Eureka es una herramienta de descubrimiento de servicios, parte de la suite de Spring Cloud. En una arquitectura de microservicios, cada servicio debe registrarse para que otros servicios puedan descubrirlo y comunicarse con él. Eureka Server actúa como un "registro" centralizado donde los servicios se registran.

#### 3. Config Server:

Spring Cloud Config Server centraliza la configuración de todas las aplicaciones. En lugar de tener archivos de configuración dispersos por todos los microservicios, puedes usar un Config Server para que todos los microservicios obtengan su configuración desde un único lugar.

####  4. OpenFeign:

OpenFeign es una librería declarativa que facilita las peticiones HTTP entre microservicios. Con OpenFeign, puedes crear interfaces Java que representan las APIs de otros servicios y realizar solicitudes HTTP automáticamente, sin necesidad de escribir código detallado para cada llamada.

Pasos para Implementar la Arquitectura:
Paso 1: Crear el Eureka Server

Primero, necesitas configurar un Eureka Server para que los microservicios puedan registrarse.

    Dependencias en el archivo pom.xml:

    Agrega la dependencia de Eureka Server a tu archivo pom.xml:

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>

Configuración de Eureka Server:

En tu clase principal de la aplicación (por ejemplo, EurekaServerApplication), agrega la anotación @EnableEurekaServer:


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}



Configura el archivo application.properties:

En el archivo application.properties de Eureka Server, configura el puerto y la URL de la instancia:

    server.port=8761
    spring.application.name=eureka-server
    eureka.client.registerWithEureka=false
    eureka.client.fetchRegistry=false

    Inicia el Eureka Server:

    Ejecuta el servicio Eureka y accede al panel de administración en http://localhost:8761.

Paso 2: Crear el Config Server

El Config Server centraliza la configuración de tus microservicios.

    Dependencias en el archivo pom.xml:

    Agrega las dependencias para el Config Server:

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>

Configuración del Config Server:

En tu clase principal, agrega la anotación @EnableConfigServer:

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}

Configura el archivo application.properties:

En el archivo application.properties del Config Server, debes configurar la ubicación de los archivos de configuración:

server.port=8888
spring.application.name=config-server
spring.cloud.config.server.git.uri=https://github.com/miusuario/miconfiguracion

También puedes usar Git, SVN o un repositorio de archivos locales.

Inicia el Config Server:

Inicia el Config Server y accede a http://localhost:8888.



