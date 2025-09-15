package com.jenkins;

import java.util.Date;

public class JenkinsDemo {

	public static void main(String[] args) {
		System.out.println("This is a demo project for jenkins");
		System.out.println("Here we are going to run this from jenkins");
		System.out.println("Now we are making changes in file");
		System.out.println("Today date is: "+new Date());
		
		Student s1 = new Student();
		s1.sayHello();
		
		Student s2 = new Student();
		s2.sayHello();
		
	}

}
