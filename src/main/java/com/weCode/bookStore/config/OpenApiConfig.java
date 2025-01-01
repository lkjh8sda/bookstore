package com.weCode.bookStore.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Book Store REST API")
                        .version("1.0")
                        .description("All API for book store application")
                        .contact(new Contact()
                                .name("BookStore Admin")
                                .url("https://book-store-web.herokuapp.com")
                                .email("bookstore@gmail.com"))
                );
    }
}