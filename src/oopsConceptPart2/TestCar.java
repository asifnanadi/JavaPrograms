package oopsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static polymorphism or Compile-time Polymorphism
		BMW b=new BMW();
		b.start();		// We have two start method, Here it will always call the method of child class if it is overridden. It will not call the method of Parent class.
		b.stop();
		b.theftSafety();
		
		Car c=new Car();
		

	}

}
