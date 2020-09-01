package collectionsConcept;

public class ArrayConcept {

	static int j;
	public static void main(String[] args) {
		
		//1.int array
		
		int i[]=new int[5];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.println(i.length);
		
		for(j=0;j<i.length;j++)
		{
			System.out.println("The value of i is "+i[j]);
		}
		
		
	}

}
