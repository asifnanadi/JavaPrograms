package javaBasics;

public class TwoDimArrary {

	public static void main(String[] args) {
			
		String x[][]=new String[3][5];
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		//1st row
		x[0][1]="A";
		x[0][2]="B";
		x[0][3]="C";
		
		//2nd row
		x[1][1]="A1";
		x[1][2]="B1";
		x[1][3]="C1";
		
		System.out.println(x[0][1]);
		System.out.println(x[1][1]);
		
		//Print all the values of 2D array: Use two for loops (Outer loop and Inner Loop)
		
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}
		}
	}

}
