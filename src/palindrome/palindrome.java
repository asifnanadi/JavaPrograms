package palindrome;

public class palindrome {

	public static void main(String args[]) {
		String s = "asdsa";
		
//		String[] splitString = s.split("");
	    int l = s.length();
		String reverse = "";
		for(int i =l-1;i>=0;i--) {
			reverse += s.charAt(i);
		}
		if(reverse.equals(s)) {
			System.out.println(reverse);
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(reverse);
			System.out.println("not a palindrome");
		}
	}

	
}
