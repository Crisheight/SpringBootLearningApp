package com.crosa.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

    @Bean("bean1")
    @Profile("dev")
    public FirstClass myFirstBean() {
        return new FirstClass("First bean :)");
    }

    @Bean("bean2")
    @Profile("test")
    public FirstClass mySecondBean() {
        return new FirstClass("Second bean :)");
    }

    @Bean("bean3")
    // @Primary
    public FirstClass myThirdBean() {
        return new FirstClass("Third bean :)");
    }

}
