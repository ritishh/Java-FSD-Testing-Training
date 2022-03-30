package Day7;

import java.util.Scanner;

//input an array of integers according to the user , and also take a input of a 
//particular integer and find out the occurence of the intger in the array.

public class ArrayOccurence {

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		int count=0;
		System.out.println("enter the size of the array");
		int size= sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("enter element to find occurance:");
		int element = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==element)
			{
				count++;
			}
		}
		System.out.println("Number of occurance= "+count);
		
	}

}
