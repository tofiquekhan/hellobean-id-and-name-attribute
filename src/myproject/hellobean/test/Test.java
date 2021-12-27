package myproject.hellobean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.hellobean.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/hellobean/resources/applicationContext.xml");
		System.out.println(context.getBean("helloBean"));
		System.out.println(context.getBean("helloBean"));
		System.out.println(context.getBean("helloBean"));
		
	}
	
}
