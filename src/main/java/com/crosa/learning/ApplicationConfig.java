package com.crosa.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    public FirstClass myFirstBean() {
        return new FirstClass("First bean :)");
    }

    @Bean
    public FirstClass mySecondBean() {
        return new FirstClass("Second bean :)");
    }

    @Bean("bean3")
    // @Primary
    public FirstClass myThirdBean() {
        return new FirstClass("Third bean :)");
    }

}
