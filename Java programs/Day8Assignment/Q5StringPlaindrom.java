package Day8Assignment;

/*Write a program to take an input of a string with multiple words and convert it into a string array,
and check if every element of that array is a Palindrome.
Note: Palindrome is a word which when reversed also is the same.*/

import java.util.Scanner;

public class Q5StringPlaindrom {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str=sc.next();
		String org_str=str;
		
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" is a paliandrome");
		}
		else
		{
			System.out.println(org_str+" is not a plaindrome");
		}
	}

}
