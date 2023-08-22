package strings;

import java.util.Arrays;

public class Find_Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		if (s1.length() != s2.length()) {
			System.out.println("Not an Anagram");
			System.exit(0);
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for (int i=0; i< c1.length; i++) {
			if(c1[i]!=c2[i]) {
				System.out.println(s1+" "+s2+" are not Anagram");
				System.exit(0);
			}
			
		}
		System.out.println("Anagram");
		
		
	}

}
