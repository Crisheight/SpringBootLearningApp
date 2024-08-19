package com.crosa.learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private final FirstClass firstClass;

    public FirstService(
            @Qualifier("bean2") FirstClass firstBean
    ) {
        this.firstClass = firstBean;
    }

    public String tellAStory() {
        return "the dependency is injected and says: " + firstClass.sayHello();
    }
}
