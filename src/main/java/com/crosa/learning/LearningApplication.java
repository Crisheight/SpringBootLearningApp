package com.crosa.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(LearningApplication.class, args);

		FirstClass myFirstClass = ctx.getBean(FirstClass.class);
		System.out.println(myFirstClass.sayHello());
	}


}
