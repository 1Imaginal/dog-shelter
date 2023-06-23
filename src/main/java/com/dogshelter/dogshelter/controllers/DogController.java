package com.dogshelter.dogshelter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dogshelter.dogshelter.models.Dog;

@RestController
public class DogController {

	@RequestMapping(value="dogs")
	public Dog getDog() {
		Dog dog = new Dog();
		dog.setName("Hugo");
		dog.setBreed("Chihuahuac");
		dog.setAge(15);
		return dog;
	}
}
