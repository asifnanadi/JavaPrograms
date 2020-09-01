package constructorConcepts;

public class Calc {
	
	int num1;
	int num2;
	String Operation;
	
	
	public Calc(){
		num1=0;
		num2=0;
		Operation="Nothing";
			
	}
	
	public Calc(int m){
		num1=m;
		num2=0;
		Operation="Nothing";
			
	}
	
	public Calc(int m, int n){
		num1=m;
		num2=n;
		Operation="Nothing";
			
	}
	
	public Calc(int m, int n, String Op){
		num1=m;
		num2=n;
		Operation=Op;
			
	}
	

	//Main Method
	public static void main(String[] args) {
		System.out.println("Calling default constructor having no parameters");
		Calc obj=new Calc();
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.Operation);
		
		System.out.println("*******************");
		
		System.out.println("Calling constructor having 2 parameters");
		Calc obj1=new Calc(10,20);
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		System.out.println(obj1.Operation);
		
		System.out.println("*******************");
		
		System.out.println("Calling constructor having 3 parameters");
		Calc obj2=new Calc(10,20, "Asif");
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		System.out.println(obj2.Operation);
		
	}

}
