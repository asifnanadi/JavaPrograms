package programs.strings;

public class Find_CharsAtOddPosition {

	// static char a, b;

	public static void main(String[] args) {
		String str = "Welcome to Java";
		int len = str.length();

		for (int i = 1; i <= len - 1; i = i + 2) {
			System.out.println("char at index " + i + " is " + str.charAt(i));

		}

	}

}
