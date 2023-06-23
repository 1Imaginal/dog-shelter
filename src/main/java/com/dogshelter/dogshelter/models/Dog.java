package com.dogshelter.dogshelter.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Dog {
	
	@Getter @Setter
    private String name;
	
	@Getter @Setter
    private String breed;
	
	@Getter @Setter
    private int age;

}
