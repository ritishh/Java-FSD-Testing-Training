package Day7;

import java.util.Scanner;

public class Q4ArrayString {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of string array");
		int size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("enter elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("Array:-");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Array in reverse order:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+"");
		}
	}

}
