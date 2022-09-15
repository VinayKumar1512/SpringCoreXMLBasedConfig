package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ci {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("Configci.xml");
       
//        Person person1=(Person)context.getBean("person1");
//        System.out.println(person1);
       
        
        Addition add=(Addition)context.getBean("add");
        System.out.println(add);
    }
}
