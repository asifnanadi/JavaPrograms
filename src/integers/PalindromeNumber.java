package integers;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value");
		int input = sc.nextInt();
		
		int temp = input;
		int rem, rev = 0;

		while (temp != 0) {
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}

		if (input == rev) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
	}
}
