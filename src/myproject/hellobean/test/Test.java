package myproject.hellobean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.hellobean.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/hellobean/resources/applicationContext.xml");
		HelloBean helloBean = (HelloBean)context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		HelloBean helloBean1 = (HelloBean)context.getBean("helloBean1");
		System.out.println(helloBean1.sayHello());
		HelloBean helloBean2 = (HelloBean)context.getBean("helloBean2");
		System.out.println(helloBean2.sayHello());
		HelloBean helloBean3 = (HelloBean)context.getBean("helloBean3");
		System.out.println(helloBean3.sayHello());
	}
	
}
