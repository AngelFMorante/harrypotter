package main.java.com.harrypotter.witches.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.GroupedOpenApi;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WitchesSwaggerConfig {

    @Bean
    public OpenAPI witchesOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Witches Service API")
                        .version("1.0")
                        .description("API for Witches microservice"));
    }

    @Bean
    public GroupedOpenApi witchesApi() {
        return GroupedOpenApi.builder()
                .group("witches")
                .pathsToMatch("/witches/**")
                .build();
    }
}
