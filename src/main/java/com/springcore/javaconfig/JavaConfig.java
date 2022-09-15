package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//java configuration using annoations
//@confiugartion annoation is used to declare a class which handle configuration -> IOC container get to know that this class is 
//configuration class
//@componentScan is used to tell IOC our base package


@Configuration
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		Samosa samosa= new Samosa();
		return samosa;
	}
	//IOC contiainer will take obj of this bean and than we can take obj from IOC container touse it
	//method return obj of student class which we declared as Bean using @Bean annoation
	@Bean(name= {"getStudent","temp"})
	public Student getStudent(){
		Student student= new Student(getSamosa());
		return student;
	}
}
