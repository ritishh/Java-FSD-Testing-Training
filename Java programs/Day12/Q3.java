package Day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q3 {

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
