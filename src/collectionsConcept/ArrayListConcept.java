package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

			public static void main(String[] args) {
			
			int a[]=new int[3];//Static array-- the size is fixed
			a[0]=10;
			a[1]=20;
			a[2]=30;
			//a[3]=40; // It will give Array Index out of bound exception, because size is 3. so we cannot give 4th value.
			
			//Dynamic Array-- ArrayList
			//1. It can contain duplicate values/Elements
			//2. It maintains insertion order
			//3. Synchronized
			//4. allows you random access to fetch the elements because it stores the values on the basis of indexes.
			
			ArrayList ar=new ArrayList();
			ar.add(10);//0
			ar.add(20);//1
			ar.add(30);//2
			
			System.out.println(ar.size());
			
			ar.add(40);//3
			ar.add(40);//4
			ar.add("Test");//5
			
			System.out.println(ar.size());
			
			System.out.println(ar.get(4));// random access by passing index value.
			
			for(int i=0;i<ar.size();i++)
			{
				System.out.println(ar.get(i));
			}
			
			//generic concept
			
			ArrayList<Double> ar1=new ArrayList<Double>();
			ar1.add(100.09);
			ar1.add(100.00);
			//ar1.addAll("Selenium") // ar1 is defined with integer. So it wont allow you to store string.
			
			ArrayList<String> ar2=new ArrayList<String>();
			ar2.add("Test");
			
			
			//User Defined Class Object
			
			//Employee class object
			
			Employee e1=new Employee("Asif",27,"QA");
			Employee e2=new Employee("Rishab",25,"Development");
			Employee e3=new Employee("Kanika",21,"Accounts");

			// create arraylsit
			ArrayList<Employee> ar3=new ArrayList<Employee>();
			ar3.add(e1);
			ar3.add(e2);
			ar3.add(e3);
			
			//iterator to traverse the values:
			Iterator<Employee> i=ar3.iterator();
			while(i.hasNext())
			{
				Employee em=i.next();
				System.out.println(em.name);
				System.out.println(em.age);
				System.out.println(em.dept);
			}
		}
		
	}

