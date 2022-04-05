package Day7;

import java.util.Scanner;

// input an array of integers according to the user , and also take a input of a 
//particular integer and find out the occurence of the intger in the array.
public class Q3 {

	public static void main(String[] args) 
	{
		int n,x,count=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of elements you want in array:");
		n=sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("enter all the elements:");
		
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element of which you want to count number of occurrences:");
		x = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("Number of occurrence of the Element:"+count);
	}

}
