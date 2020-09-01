package StringConcepts;

public class StringManipulation {

	public static void main(String[] args) {
		
		String name="My name is asif ali";
		int l=name.length();
		
		System.out.println(l);
		System.out.println(name.charAt(4));
		
		//System.out.println(l.charAt(4));// cannot invoke charAt(int) on the primitive type int
		//System.out.println(name.charAt(15));// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 15
		
		 System.out.println(name.indexOf('a'));
		 System.out.println(name.indexOf('a',5));
		 System.out.println(name.indexOf('a',name.indexOf('a')+1));
		 
		 //trim
		 String s="    Asif Nanadi  ";
		 System.out.println(s.trim());
		 
		 
		 System.out.println("************");
		 //If Nanadii not available then -1 will be returned. Hence -1 is less than 0. so we can add if else condition as shown below.
		 String sname="Asif Nanadi";
		 
		 System.out.println(sname.indexOf("Nanadii"));
		 if(sname.indexOf("Nanadii")>=0) {
				 System.out.println("Nanadi is available");
		 }else {
					 System.out.println("TC is failed");
		 }
		 
		 
		 //replace
		 String date="15-15-1991";
		 
		 System.out.println(date.replace("-", "/"));
		 System.out.println(name.replace(" ", ""));
		 
	}

}
