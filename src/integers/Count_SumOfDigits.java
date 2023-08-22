package integers;


//input : 12345
//output: 1+2+3+4+5 = 15
public class Count_SumOfDigits {

	public static void main(String[] args) 
	{
		int num = 12345;
		int sum = 0;
	
		while(num>0) 
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
