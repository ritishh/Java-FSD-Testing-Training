package Day13_Assignment;
/*Create two arraylist of strings to take First_name and Last_name of the students,
and print their whole name.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FirstnameLastname {
	public static void main(String[] args) 
	{
		ArrayList Fname = new ArrayList<String>();
		ArrayList Lname = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Students");
		int n = sc.nextInt();
		for(int i=0; i<n;i++)
		{
			String F;
			String L;
			
			System.out.println("Enter First Name of Student "+(i+1));
			F = sc.next();
			Fname.add(F);
			System.out.println("Enter the secound name of Student "+(i+1));
			L = sc.next();
			Lname.add(L);
		}
		Iterator Ftr = Fname.iterator();
		Iterator Ltr = Lname.iterator();
		
		for (int i =0;i<n;i++)
		{
			System.out.println("The whole name of Student "+(i+1)+"is ==>"+Ftr.next() +" "+Ltr.next());
		}
	}

}

/* output
 * Enter the no of Students
3
Enter First Name of Student 1
manu
Enter the secound name of Student 1
sudhan
Enter First Name of Student 2
ram
Enter the secound name of Student 2
sham
Enter First Name of Student 3
joseph
Enter the secound name of Student 3
castro
The whole name of Student 1is ==>manu sudhan
The whole name of Student 2is ==>ram sham
The whole name of Student 3is ==>joseph castro*/
