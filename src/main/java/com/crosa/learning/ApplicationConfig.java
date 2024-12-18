package com.crosa.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfig {

    @Bean("bean1")
    public FirstClass myFirstBean() {
        return new FirstClass("First bean :)");
    }

    @Bean("bean2")
    public FirstClass mySecondBean() {
        return new FirstClass("Second bean :)");
    }

    @Bean("bean3")
    // @Primary
    public FirstClass myThirdBean() {
        return new FirstClass("Third bean :)");
    }

}
