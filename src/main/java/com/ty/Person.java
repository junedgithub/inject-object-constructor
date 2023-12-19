package com.ty;

public class Person {
 private Mobile mobile;

public Person(Mobile mobile) {
	super();
	this.mobile = mobile;
}
 
 public void use() {
	 System.out.println("Person is Using");
	 mobile.ring();
 }
}
