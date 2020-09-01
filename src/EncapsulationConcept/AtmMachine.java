package EncapsulationConcept;

public class AtmMachine {
	
	private int a;
	private int b;
	private int c;
	private String z;
	
	
	private void atmPin(int x, String y) {
		z=y;
		a=100;
		b=200;
		c=x+(a*b);
		System.out.println(c);
		}
	

	public void setatmPin(int x, String y) {
		atmPin(x,y);
	}


}



	


