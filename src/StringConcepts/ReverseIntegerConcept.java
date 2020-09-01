package StringConcepts;

public class ReverseIntegerConcept {

	public static void main(String[] args) {
		
		int num=2015;
		String str=String.valueOf(num); //Converting int value into String
		
		int l=str.length();
		
		String rev="";
		
		for(int i=l-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Length of the str is "+l);
		System.out.println(rev);
		

	}

}
