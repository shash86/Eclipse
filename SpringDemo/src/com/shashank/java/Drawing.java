package com.shashank.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Drawing {
	
	


	public static void main(String[] args) {


		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//context.registerShutdownHook();
		
		Shape shape = (Shape) context.getBean("circle");
		
		shape.draw();
	}



}
