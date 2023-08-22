package arrays;

public class FindCommonElements {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 50, 7, 8, 9 };
		int arr2[] = { 2, 20, 30, 5, 7, 80, 90 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					//break;
				}
			}

		}

	}

}
