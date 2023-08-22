package integers;


// Note:Did not get the output. Need to check
import java.util.Scanner;

public class AverageSalary {
	int size = 5;
	int[] salary=new int[size];
	
	
	public double average(int[] salary) {
        double avg = 50/2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		for (int i=0;i<=size;i++) {
			
			salary[i]=sc.nextInt();
			
			
			int min_sal=salary[i];
			int max_sal=salary[size-1];
			System.out.println(min_sal);
			System.out.println(max_sal);
		}
		
		return avg;
		
		
    }
	
	public static void main(String[] args) {
		AverageSalary avgSal=new AverageSalary();
		//avgSal.average();
	}
	
	
	
}
