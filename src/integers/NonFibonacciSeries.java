package integers;

public class NonFibonacciSeries {

	public static void main(String[] args) {
		// Print non fibonacci serirs
		// Fibonacci series :: 0 1 1 2 3 5 8 13…
		// Non fibonacci series :: 4 6 7 9 10 11 12 14 15… till 50

		int a = 0;
		int b = 1;

		int c;

		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.println(c);// 1,1,
			a = b;
			b = c;

		}

	}
}