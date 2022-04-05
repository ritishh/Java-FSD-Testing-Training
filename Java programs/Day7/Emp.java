package Day7;

import java.util.Scanner;

public class Emp {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year of joining");
		int year = sc.nextInt();
		System.out.println("enter the salary");
		float sal = sc.nextFloat();
		System.out.println("enter the emp name");
		String name=sc.next();
		
		System.out.println("year of joining is :"+year);
		System.out.println("salary is :"+sal);
		System.out.println("Emp Name :"+name);
		
		
	}
}
