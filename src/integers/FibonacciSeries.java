package integers;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		int c;

		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.println(c);// 1,2,3,5,8....144
			a = b; // a=1 , a=1 , a=2
			b = c; // b=1 , b=2 , b=3

		}

	}
}