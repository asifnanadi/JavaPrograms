package strings;

public class Find_Palindrome {

	public static void main(String[] args) {
		String str = "kanak";
		int l = str.length();
		String rev = "";

		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}

	}

}
