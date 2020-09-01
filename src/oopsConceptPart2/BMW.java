package oopsConceptPart2;

public class BMW extends Car{
	
	//when same method is present in parent class as well as in child class with the same name and same number of arguments is called method overriding.

	public void start()// Overridden method.
	{
		System.out.println("BMW Starts");
	}
	
	public void theftSafety()
	{
		System.out.println("BMW Engine Stops");
	}
}
