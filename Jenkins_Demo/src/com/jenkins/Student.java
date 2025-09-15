package com.jenkins;

public class Student {

	public static int cnt = 0;
	
	public Student() {
		System.out.println("New student with id "+ ++cnt+" account created");
	}
	
	public void sayHello() {
		System.out.println("Hii... This is a new student with id "+cnt);
	}
	
}
