package integers;

//input:1244
//output:even counts are 3
//output:odd counts are 1
public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		int num = 1244;
		int oddCount = 0;
		int evenCount = 0;

		while (num > 0) 
		{
			int rem = num % 10;

			if (rem % 2 == 0) 
			{

				evenCount++;

			} else 
			{
				oddCount++;
			}
			
			num=num/10;

		}
		System.out.println("Odd counts are "+oddCount);
		System.out.println("Even counts are "+evenCount);

	}

}
