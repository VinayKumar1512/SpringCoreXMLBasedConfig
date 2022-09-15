package com.springcore.life;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaMain {

	 public static void main( String[] args )
	    {
		 System.out.println( "Hello World!" );
	        AbstractApplicationContext context= new ClassPathXmlApplicationContext("LifeCycleConfig.xml");
	        Samosa samosa=(Samosa) context.getBean("samosa");
	        
	        //in order that destory method get called we need to register shutdown hook,which will make our application that
	        //destory method get call all functionlity has done,hook is present in abstractapplicationContext parent of application
	        //context
	        
	        context.registerShutdownHook();//this hook helps us application know that there is a destory method
	        
	        System.out.println(samosa);
	        
	        //In order to call init and destory using annotations we use PostConstruct and PreDestory annotation.
	        //deprecretd in java 8+ so we need to add a depedency to use it there
	        
	   
	       
	    }
}
