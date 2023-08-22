package strings;

public class StringBufferUpdate {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("thisisdeepak");
		str=str.delete(2, 5);
		System.out.println(str); //thdeepak

	}

}
