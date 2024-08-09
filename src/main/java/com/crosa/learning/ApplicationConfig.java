package com.crosa.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public FirstClass myfirstClass() {
        return new FirstClass();
    }

}
