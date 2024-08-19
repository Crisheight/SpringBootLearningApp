package com.crosa.learning;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private final FirstClass firstClass;

    public FirstService(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public String tellAStory() {
        return "the dependency is injected and says: " + firstClass.sayHello();
    }
}
