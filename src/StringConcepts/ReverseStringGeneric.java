package StringConcepts;

public class ReverseStringGeneric {

	public static String reverseString(String genericString) {
		String rev="";
		
		String st=genericString;
		int l=st.length();
		for(int i=l-1;i>=0;i--) {
			rev=rev+st.charAt(i);
		}
		return rev;
		
	}
	public static void main(String[] args) {
		System.out.println(reverseString("nanadi"));			
		}

}
