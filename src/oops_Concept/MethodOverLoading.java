package oops_Concept;

public class MethodOverLoading {

	public static void main(String[] args) 
		{
		
		
		
		}
	
	//you can not create a method inside a method: Even in Main method.
	//duplicate methods: i.e same method name with same arguments are not allowed.
	
	
	//
	
	public void sum() 
		{
			System.out.println("Sum Method");
		}
	
	public void sum(int a) 
	{
		System.out.println("Sum Method");
	}
	
	public void sum(int a, int b) 
	{
		System.out.println("Sum Method");
	}
	
	public void sum(double a) 
	{
		System.out.println("Sum Method");
	}
	 
	/*public void sum() 
	{
		System.out.println("Sum Method");
	}*/

}
