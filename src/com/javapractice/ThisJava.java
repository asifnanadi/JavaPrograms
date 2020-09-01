package com.javapractice;

public class ThisJava {

	String s1="Global";


	public String display(String s) {
	 
//	 	this.s1=s;	
		return this.s1;
}
	public static void main(String[] args) {
		ThisJava obj1 =new ThisJava();
		String s2=obj1.display("Asif");
		System.out.println(s2);
	}

}
