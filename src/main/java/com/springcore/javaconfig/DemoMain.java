package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DemoMain {
	 public static void main( String[] args )
	    {  
		 //this class is used to handle annoation based config
	        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
	       
	        
//	       Student student= context.getBean("student",Student.class);
	        //name is same as name of method in @Bean
	        Student student= context.getBean("temp",Student.class);
	       System.out.println(student);
	       
	       student.study();
	       
	    }
}
