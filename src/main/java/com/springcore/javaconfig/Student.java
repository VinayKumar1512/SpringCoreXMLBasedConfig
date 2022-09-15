package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//this annoation is used to declare ourclass as bean
//@Component
//we can do bean config using @Bean annoatation we can specify all these annoation in javaconfig file
public class Student {
	
	private Samosa samosa;
   

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("Student is Studying");
	}
}
