package Day8_Assignment;

import java.util.Scanner;

//Write a program to check for the occurrence of a particular character in a string and display how many times it has occurred.
//note: take the String  and the character to be checked as a input from the user.

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

// output
/* 
Enter the String occurance
manu
.Number occurances of a is: 1
Enter the String occurance
gh
Number occurances of a is: 0
*/
