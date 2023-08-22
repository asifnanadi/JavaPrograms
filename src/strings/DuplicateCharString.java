package strings;

//Output: Print duplicate char of string and counts
public class DuplicateCharString {

	public static void main(String[] args) {
		

		String a = "Hi this is Asif";
		String a1 = a.replaceAll("\\s", "");
		int len = a1.length();
		char[] b = a1.toCharArray();
		int count = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1 ; j < len; j++) {
				if (b[i] == b[j]) {
					System.out.println(b[j] + " is duplicate character");
					count++;
					break;
				}
			}

		}
		System.out.println("total duplicates counts are " + count);
	}

}
