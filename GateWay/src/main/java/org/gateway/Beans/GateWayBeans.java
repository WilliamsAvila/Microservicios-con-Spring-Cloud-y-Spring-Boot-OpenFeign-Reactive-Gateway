package org.gateway.Beans;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayBeans {

    @Bean
    public RouteLocator routerLocator (RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(route ->route
                        .path("/prueba/API/GetName/*")
                        .uri("http://localhost:8081")
                )
                .route(route ->route
                        .path("/DemoFeign/Feign/GetName/*")
                        .uri("http://localhost:6666")
                )
                .build();
    }
}
