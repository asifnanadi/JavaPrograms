package com.programs.strings;

public class RemoveDuplicateChars {

	public static void main(String[] args) {

		String str = "spresso";
		String s = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					s = s + str.charAt(i);

				}

			}

		}
		System.out.println("Duplicate characters are " + s);
	}

}
