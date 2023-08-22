package arrays;

import java.util.HashSet;

public class FindIntersection {

	public static void printIntersection(int arr1[], int arr2[]) {

		HashSet<Integer> hs = new HashSet<Integer>();
		//iterate through arr1 and add values into hs
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		
		//iterate through arr2 and print if hs contains common values from arr2.
		for (int i = 0; i < arr2.length; i++) {
			if (hs.contains(arr2[i])) {
				System.out.println(arr2[i]);

			}
		}

	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 4, 8 };
		int arr2[] = { 2, 3, 5, 8 };

		printIntersection(arr1, arr2);
	}

}
