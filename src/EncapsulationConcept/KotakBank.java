package EncapsulationConcept;

public class KotakBank {

	private int a;
	private int b;
	private int c;
	
	//Getter and setter concept.
	public void setA(int b) {
		a=30;
		this.b=b;
		c=a+this.b;
		System.out.println(c);
		//return c;
	}
	
	public void getA() {
		//int x=setA(50);  
		
		//1. Always Remember, setA(int b) method is not returning any type. hence we cannot store the values into x variable.
		//2. Since setA(int b) method is not returning any type, we can directly call the method inside the method getA().
		
		setA(50);
		
		
	}
	
}
