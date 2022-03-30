package Day7;

import java.util.Scanner;

public class Q2GreatestvalueArray {

	public static void main(String[] args) 
	{
		int number[],size,large;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		size = sc.nextInt();
		
		number = new int[size];
		System.out.print("enter elements of array");
		
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		
		large=number[0];
		for(int i=1;i<number.length;i++)
		{
			if(large<number[i])
			{
				large=number[i];
			}
		}
		System.out.println("largest value of number:"+large);
	}
}