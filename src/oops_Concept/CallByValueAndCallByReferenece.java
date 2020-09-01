package oops_Concept;

public class CallByValueAndCallByReferenece 
{
	static int p;
	static int q;
	
	public int testSum(int a,int b)
	{
		a=30;
		b=40;
		int c=a+b;
		return c;
	}
	
	//call by reference or pass by reference
	public void swap(CallByValueAndCallByReferenece t) 
	{
		int temp;
		temp=t.p;	// temp=50
		t.p=t.q;	// t.p=60
		t.q=temp;	// t.q=50
	}	
	
	// Main Method
	public static void main(String[] args) 
	{
		CallByValueAndCallByReferenece obj=new CallByValueAndCallByReferenece();
		int x=10;
		int y=20;
		obj.testSum(x, y);//call by value or pass by value
		
		p=50;
		q=60;
		
		//before swapping
		System.out.println(p);
		System.out.println(q);
		
		obj.swap(obj);// I will pass obj reference, because I am calling the values of p and q from method swap. swap method is referred by t. 
		//after swapping
		System.out.println(p);
		System.out.println(q);
	}

}
