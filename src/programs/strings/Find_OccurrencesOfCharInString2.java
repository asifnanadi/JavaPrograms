package programs.strings;

//aa123bb456cc789!@#$  - from the string try to remove the numerics and special characters
//aabbcc - 1st output, again take this output and print the occurence of character 
//a-2, b-2 c-2 ... 2nd output 

public class Find_OccurrencesOfCharInString2 {

	public static void main(String[] args) {

		String str = "aa123bb456cc789!@#$";

		String plainStr = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("Plain string is " + plainStr);

		for (int i = 0; i < plainStr.length(); i++) {

			for (int j = 0; j < i + 1; j++) {

				if (plainStr.charAt(i) == plainStr.charAt(j)) {
					char a1 = plainStr.charAt(i);
					System.out.print(a1);

				}

			}

		}

	}
}
