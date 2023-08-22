package integers;

import java.util.Scanner;

//Expected Output: Count the odd numbers between low to high range 
public class Count_oddNumbers {

	public int countOdds(int low, int high) {

		int size = (high - low) + 1;
		int count = 0;

		if (size % 2 == 0) {
			count = (size / 2);

		} else if (size % 2 != 0) {
			for (int i = low; i <= high; i++) {
				if (i % 2 != 0) {
					count++;
				}
			}

		}

		return count;

	}

	public static void main(String[] args) {

		Count_oddNumbers sl = new Count_oddNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter high value");
		int high = sc.nextInt();
		System.out.println("Enter low value");
		int low = sc.nextInt();

		System.out.println(sl.countOdds(low, high));

	}

}