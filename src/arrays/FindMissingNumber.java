package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6};
		
		int exp_arrLength=arr.length+1;
		int total_sum=exp_arrLength*(exp_arrLength+1)/2;
		
		//calculate actual_sum
		int actual_sum=0;
		for(int i=0;i<arr.length;i++) {
			actual_sum=actual_sum+arr[i];
		}
		
		System.out.println("Missing number is "+(total_sum-actual_sum));
	}

}
