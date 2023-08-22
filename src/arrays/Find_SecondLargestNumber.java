package arrays;

public class Find_SecondLargestNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 55, 66, 22, 1 };
		int n = arr.length;
		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Second largest number is " + arr[1]);

	}
}
