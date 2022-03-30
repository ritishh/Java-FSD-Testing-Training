package Day8Assignment;

import java.util.Scanner;

public class Q4ArrayOccurances {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String occurance");
		String s=sc.next();
		
		int totalcount=s.length();
		
		int totalcount_afterRemove=s.replace("a", "").length();
		
		int count=totalcount-totalcount_afterRemove;
		
		System.out.println("Number occurances of a is: "+count);
		
	}

}
