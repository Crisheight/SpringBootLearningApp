package com.crosa.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(LearningApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "dev"));
		var ctx = app.run(args);

		FirstService myFirstService = ctx.getBean(FirstService.class);
		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getCustomPropertyInt());
		System.out.println(myFirstService.getCustomPropertyFromFile());
		System.out.println(myFirstService.getCustomPropertyFromFileValTwo());


	}


}
