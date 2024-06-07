package com.harrypotter.chat.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.GroupedOpenApi;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatSwaggerConfig {

    @Bean
    public OpenAPI chatOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Chat Service API")
                        .version("1.0")
                        .description("API for Chat microservice"));
    }

    @Bean
    public GroupedOpenApi chatApi() {
        return GroupedOpenApi.builder()
                .group("chat")
                .pathsToMatch("/chat/**")
                .build();
    }
}
