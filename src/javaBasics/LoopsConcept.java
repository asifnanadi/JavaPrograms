package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) 
	{
		
		//1. while loop;
		//disadvantage of while loop: it will generate infinite loop if you do not give incremental/decremental part
		
		int i=1;	//Initialization
		while(i<=10) {	//Conditional
			System.out.println(i);
			i=i+1;		//incremental/decremental part
		}
		
		System.out.println("*********************");
		
		//2. for loop:
		
		for(int j=1;j<=10;j++) {		//(Initialization, Conditional, Incremental) 		j++ means: j=j+1;
			System.out.println(j);
		}
		
		System.out.println("*********************");
		
		//print 10 to 1
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
	
	}

}
