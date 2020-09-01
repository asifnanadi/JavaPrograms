package StringConcepts;

public class ReverseString {

	public static void main(String[] args) {
		String str="Asifan";
		int l=str.length();
		
		String rev="";
		
		for(int i=l-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Length of the str is "+l);
		System.out.println(rev);

	}

}
