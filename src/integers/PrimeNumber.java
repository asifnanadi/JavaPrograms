package integers;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 3;
		int count = 0;

		if (n > 1) {

			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					count++;
			}

			if (count == 2) {
				System.out.println("Prime number");
			}

			else {
				System.out.println("Not a prime number");
			}

		}

		else {
			System.out.println("Not a prime number");
		}

	}

}
