package com.harrypotter.spells.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.GroupedOpenApi;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpellsSwaggerConfig {

    @Bean
    public OpenAPI spellsOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spells Service API")
                        .version("1.0")
                        .description("API for Spells microservice"));
    }

    @Bean
    public GroupedOpenApi spellsApi() {
        return GroupedOpenApi.builder()
                .group("spells")
                .pathsToMatch("/spells/**")
                .build();
    }
}

