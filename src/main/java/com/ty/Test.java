package com.ty;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
		Person person = (Person) applicationContext.getBean("myPerson");
		person.use();
	}
}
