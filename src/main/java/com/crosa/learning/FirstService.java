package com.crosa.learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class FirstService {

    private final FirstClass firstClass;

    @Value("${my.custom.property}")
    private String customProperty;
    @Value("${my.custom.property.int}")
    private Integer customPropertyInt;
    @Value("${my.prop}")
    private String customPropertyFromFile;


    public FirstService(
            @Qualifier("bean3") FirstClass firstClass
    ) {
        this.firstClass = firstClass;
    }


    public String tellAStory() {
        return "\nthe dependency is injected and says: " + firstClass.sayHello();
    }


    public String getCustomPropertyFromFile() {
        return customPropertyFromFile;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public Integer getCustomPropertyInt() {
        return customPropertyInt;
    }
}
