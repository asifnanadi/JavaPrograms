package constructorConcepts;

public class ThisKeywordConcept {

	int num1;
	int num2;
	String Operation;
	
	public ThisKeywordConcept(){
		num1=0;
		num2=0;
		Operation="Nothing";
			
	}
	
	public ThisKeywordConcept(int m){
		num1=m;
		num2=0;
		Operation="Nothing1";
			
	}
	
	public ThisKeywordConcept(int m, int n){
		this(m);
		num2=n;
		Operation="Nothing2";
			
	}
	
	public ThisKeywordConcept(int m, int n, String Op){
		this(m,n);
		Operation=Op;
	}
	
	
	public static void main(String[] args) {
		ThisKeywordConcept t=new ThisKeywordConcept(10,12,"Asif");
		System.out.println(t.num1);
		System.out.println(t.num2);
		System.out.println(t.Operation);
	}

}
