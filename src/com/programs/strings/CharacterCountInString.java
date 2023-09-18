package com.programs.strings;

public class CharacterCountInString {

	public static void main(String[] args) {
		String str = "indiad";
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j]=' ';
				}

			}
			
			if(ch[i]!=' ') {
				System.out.println(ch[i]+"="+count);	
			}
			
		}

	}

}
