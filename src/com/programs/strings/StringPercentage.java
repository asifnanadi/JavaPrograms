package com.programs.strings;

//Find the percentage of Uppercase letters, Lowercase letters, Digits and
// Special characters in String
// regex & ASCII approach
public class StringPercentage {

	public static void stringPercentage(String str) {

		int upperCase = 0;
		int lowerCase = 0;
		int specialChar = 0;

		for (int i = 0; i < str.length(); i++) {

			char a = str.charAt(i);

			if (Character.isUpperCase(a)) {
				upperCase++;
			} else if (Character.isLowerCase(a)) {
				lowerCase++;
			} else {
				specialChar++;
			}

			double upperCasePercentage = (upperCase * 100) / str.length();
			double lowerCasePercentage = (lowerCase * 100) / str.length();
			double specialCharPercentage = (specialChar * 100) / str.length();
			System.out.println(upperCasePercentage);
			System.out.println(lowerCasePercentage);
			System.out.println(specialCharPercentage);
		}
	}

	public static void main(String[] args) {

		stringPercentage("Nanadi@123");

	}

}
