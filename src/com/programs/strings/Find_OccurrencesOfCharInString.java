package com.programs.strings;

//aa123bb456cc789!@#$  - from the string try to remove the numerics and special characters
//aabbcc - 1st output, again take this output and print the occurence of character 
//a-2, b-2 c-2 ... 2nd output 

public class Find_OccurrencesOfCharInString {

	public static void main(String[] args) {

		String str = "aa123bb456cc789!@#$";

		char a1 = 'a';
		char b1 = 'b';
		char c1 = 'c';

		int count = 0;
		int count1 = 0;
		int count2 = 0;

		String plainStr = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("Plain string is " + plainStr);

		for (int i = 0; i < plainStr.length(); i++) {
			if (plainStr.charAt(i) == a1) {
				count++;
			} else if (plainStr.charAt(i) == b1) {
				count1++;
			} else if (plainStr.charAt(i) == c1) {
				count2++;
			}

		}

		System.out.println("a- " + count);
		System.out.println("b- " + count1);
		System.out.println("c- " + count2);

	}
}
