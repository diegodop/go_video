package com.govideo.gerenciador.configs.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customizarSwagger() {
        return new OpenAPI()
                .info(new Info()
                        .title("Go Video API")
                        .description("API REST para gerenciamento de emprestimos de equipamentos audiovisuais.")
                        .version("v1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
//                .components(new Components()
//                        .addSecuritySchemes("bearer-key", new SecurityScheme()
//                                .type(SecurityScheme.Type.HTTP)
//                                .scheme("bearer")
//                                .in(SecurityScheme.In.HEADER).bearerFormat("JWT")));
    }
}