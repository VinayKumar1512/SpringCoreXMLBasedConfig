package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRef {

	 public static void main( String[] args )
	    {
		 
		 //AutoWiring-> we are injecting ref  dependency autmatically using autowiring in this case
	        System.out.println( "Hello World!" );
	        ApplicationContext context= new ClassPathXmlApplicationContext("Refconfig.xml");
	       
	        A aref=(A)context.getBean("aref");
	        System.out.println(aref);
	       
	    }
}
