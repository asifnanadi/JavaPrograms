package com.javapractice;

public class SampleMain {
	int a=4;
	
	public static void carHorn() {
		System.out.println("Car Horn");
	}
	
	public static void carMirror() {
		System.out.println("Car Mirror");
	}
	
	public void display() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		carHorn();
		carMirror();
		SampleMain obj1=new SampleMain();
		obj1.display();
		
		
		Sample1 s1=new Sample1();
		s1.carSeat();
//		s1.carSeat(); // This line will show you warning. because static methods can be called by classname.methodname directly.
		Sample1.carMirror();
		Sample1.carDoor();
		
		
				
		
		
		
	}

}
