package programs.strings;

public class ReverseWords {

	public static void reverseWords() {
		String str = "My name is Asif";
		String StringArr[] = str.split(" ");

		for (int i = StringArr.length - 1; i >= 0; i--) {
			System.out.print(StringArr[i]);
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWords();
	}

}
