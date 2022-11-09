package ControllStatement;

import java.util.Scanner;


public class Controller {

	public static void main(String[] args) {
		boolean exit =true;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id =sc.nextInt();
		System.out.println("Enter the Name");
		String  name = sc.next();
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the Experience");
		int experience = sc.nextInt();
		System.out.println("Enter the salary");
		double salary = sc.nextDouble();
		
		
		Employee em= new Employee(id, name, age, experience, salary);
		
		do {
		if(age<35) {
			System.out.println(id + " " + name+" Eligible to work this Commpany");
			System.out.println("----------------------------");
		}
		else 	
			{
			System.out.println("Not Eligible to work this Commpany");
			}
			switch (experience) {
			
			case 5: {
				if(age>35)continue;
				if(salary>=50000) {
					System.out.println("perviouse salary " +salary);
					System.out.println("----------------------------");
					double result1 = (salary/100)*5;
					salary=result1+salary;
					System.out.println("After getting Hike of 5% "+name+" Salary is "+salary);
				}else {
					System.out.println(salary);
				}
					System.out.println("This much Year of Experience ");
					int i=1;
					   while(i<=experience) {
						System.out.println(i);
						i++;
					}
					break;
			}
			case 6:{
				if(age>35)continue;
				if(salary>=70000) {
				System.out.println("perviouse salary " +salary);
				System.out.println("----------------------------");
				double result2 = (salary/100)*10;
				salary=result2+salary;
				System.out.println("After getting hike Of 10% "+salary);
				}
				else {
					System.out.println(salary);
				}
				System.out.println("This much Year of Experience ");
				for(int i=1;i<=experience;i++) {
					System.out.println(i);
				}
				break;
			}
		}
		
	
		}while(false);
	}
	


}
