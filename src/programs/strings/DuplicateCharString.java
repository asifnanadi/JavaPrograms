package programs.strings;

//Output: Print duplicate char of string and counts
public class DuplicateCharString {

	public void duplicateCounts() {
		String str = "tt bb cc dd";
		String newStr = str.replaceAll("\\s", "");
		char[] ch = newStr.toCharArray();
		int count = 0;

		for (int i = 0; i < newStr.length(); i++) {
			for (int j = i + 1; j < newStr.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println("duplicate character is " + ch[j]);
					count++;
				}
			}
		}
		System.out.println("total duplicate character counts are " + count);

	}

	public static void main(String[] args) {

		DuplicateCharString dc = new DuplicateCharString();
		dc.duplicateCounts();

	}

}
