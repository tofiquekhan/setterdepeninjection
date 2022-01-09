package myproject.setterdepeninjection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.setterdepeninjection.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/setterdepeninjection/resources/applicationContext.xml");
		Employee empBean = (Employee) context.getBean("empBean");
		empBean.getEmployeeDetails();
	}
}
