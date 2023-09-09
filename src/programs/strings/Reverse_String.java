package programs.strings;

public class Reverse_String {

	public static void reverseString() {
		String str = "Nanadi";
		int l = str.length();
		String rev = "";

		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	public static void reverseMultipleStrings() {

		String multipleStr = "My name is Asif";
		String StrArr[] = multipleStr.split(" ");

		for (int i = 0; i < StrArr.length; i++) {
			char ch[] = StrArr[i].toCharArray();
			for (int j = ch.length - 1; j >= 0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" "); // to print the space between words
		}

	}

	public static void reverseStringUsingCharArray() {
		String str3 = "Nanadi";
		char revStr[] = str3.toCharArray();
		for (int i = revStr.length - 1; i >= 0; i--) {
			System.out.print(revStr[i]);
		}
	}

	public static void main(String[] args) {
//		reverseString();
		reverseMultipleStrings();
//		reverseStringUsingCharArray();

	}
}