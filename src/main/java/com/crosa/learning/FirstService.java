package com.crosa.learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private final FirstClass firstClass;

    public FirstService(
            @Qualifier("bean3") FirstClass firstClass
    ) {
        this.firstClass = firstClass;
    }


    public String tellAStory() {
        return "\nthe dependency is injected and says: " + firstClass.sayHello();
    }


}
