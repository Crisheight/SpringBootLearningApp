package com.crosa.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private FirstClass firstClass;
    private Environment environment;

    @Autowired
    public void setFirstClass(@Qualifier("mySecondBean") FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public String tellAStory() {
        return "the dependency is injected and says: " + firstClass.sayHello();
    }

    public String getOsName() {
        return environment.getProperty("os.name");
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
