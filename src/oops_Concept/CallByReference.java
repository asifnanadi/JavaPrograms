package oops_Concept;

public class CallByReference {
	
	int p;
	int q;

	public void swap(CallByReference s)// this method is created to swap the p and q values.
	{
		int copy;
		copy=s.p;
		s.p=s.q;
		s.q=copy;
	}
	
	
	//Main Method
	public static void main(String[] args) 
	{
		CallByReference obj=new CallByReference();
		obj.p=10;
		obj.q=20;
		
		//before swap
		System.out.println("The value of P before swapping is "+obj.p);
		
		//after swap
		obj.swap(obj);
		System.out.println("The value of P after swapping is "+obj.p);


	}

}
