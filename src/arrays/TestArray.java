package arrays;

public class TestArray {

	// int[] Array1 ={1,2,3,4,5};
	// int[] Array2 ={6,7,8,9,10};
	// Expected : int[] Array3 ={1,6,2,7,3,8,4,9,5,10};
	// Put elements in Array3 in such a manner so that I should give the desired
	// output when we print Array3

	public static void main(String[] args) {
		int[] Array1 = { 1, 2, 3, 4, 5 };
		int[] Array2 = { 6, 7, 8, 9, 10 };

		int[] Array3 = new int[10];

		
		for (int i = 0; i < Array1.length; i++) {
			int a = 0, b = 1;
			Array3[a] = Array1[i];
			a = a + 2;
			Array3[b] = Array2[i];
			b = b + 1;

//			System.out.print(Array3[0]);
//			System.out.print(Array3[1]);
			
			for (int j=0;j<Array3.length;j++) {
				System.out.print(Array3[j]);
			}
			
		}

	}

}
