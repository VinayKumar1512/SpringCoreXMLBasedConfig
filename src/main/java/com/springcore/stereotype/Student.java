package com.springcore.stereotype;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;

@Component
@Scope("prototype")
public class Student {
	
	//we use @Component annotation to declare that make this class object to spring container and @Value to add data to data fields
    //expression lang
	@Value("#{35 + 23}")
	private String studentName;
	@Value("Himachal Pradesh")
	private String studentCity;
	@Value("#{temp}")
	List<String> addresses;
	
	
	//we can call static methods,varialbes and create object using spEL
	//here is Demo
	//calling static method - T(classname).methodname()
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	//calling static variable
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	//creating obj
		@Value("#{new java.lang.String('Vinay Kumar')}")
		private String name;
	
		//we insert boolean value using spel as #{8>6} gives true and  oppsite gives false 
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Student() {
		super();
		
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public Student(String studentName, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", addresses=" + addresses
				+ ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

}
