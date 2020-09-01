package javaBasics;

public class Do_while_Demo {

	public static void main(String[] args) {
		
		int x=20;
		
		do{
			System.out.println("Value of x is "+ x);
			x++;
		}
		
		while(x>30);// 1 loop of execution is guarantee

		}

	}

/*Even if the value of X is more than the condition given in while statement, it will execute atleast
one time. Because print statement defined before the condition.
That is why it is defined as "Do while" statement*/
