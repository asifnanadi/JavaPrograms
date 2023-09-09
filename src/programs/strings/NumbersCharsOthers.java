package programs.strings;

public class NumbersCharsOthers {

	public static void main(String[] args) {
		String str = "My age is 20 !";
		int len = str.length();

		char[] ch = str.toCharArray();
		int digits = 0;
		int spaces = 0;
		int letters = 0;
		int others = 0;

		for (int i = 0; i < len; i++) {
			if (Character.isDigit(ch[i])) {
				digits++;
			} else if (Character.isSpaceChar(ch[i])) {
				spaces++;
			} else if (Character.isLetter(ch[i])) {
				letters++;
			} else {
				others++;
			}
		}
		System.out.println("Total digits are " + digits);
		System.out.println("Total spaces are " + spaces);
		System.out.println("Total letters are " + letters);
		System.out.println("Total others are " + others);
	}

}
