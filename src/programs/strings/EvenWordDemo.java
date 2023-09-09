package programs.strings;

//Expected output: Print the word which has even character counts
public class EvenWordDemo {
	public static void main(String[] args) {
		String str = "My firstname is Sagar";

//		for(String s:str.split(" ")) 
//		{
//			if(s.length()%2==0) {
//				System.out.println(s);
//			}
//		}

		String arr[] = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() % 2 == 0) {
				System.out.println(arr[i]);
			}

		}

	}

}
