package com.springcore.ci;

public class Person {
	
	private int personId;
	private String name;
	private Certificate cert;
	
	@Override
	public String toString() {
		return this.name+": "+this.personId+": "+this.cert.name;
	}

	public Person(int personId, String name, Certificate cert) {
		super();
		this.personId = personId;
		this.name = name;
		this.cert = cert;
	}
	

}
