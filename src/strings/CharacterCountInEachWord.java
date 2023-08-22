package strings;

//input: Asif Nanadi
//output: Asif=4 & Nanadi = 6
public class CharacterCountInEachWord 
{

	public static void main(String[] args) 
	{
		String str="Asif Nanadi";
		char [] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) 
		{
			String emptyStr="";
			while(i<ch.length && ch[i]!=' ') 
			{
				emptyStr=emptyStr+ch[i];
				i++;
				
			}
			
			if(emptyStr.length()>0) 
			{
				System.out.println(emptyStr+" --> "+emptyStr.length());
			}
			else {
				System.out.println("No input");
			}
		}

	}

}
