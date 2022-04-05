package Day16Assignment;

import java.util.Scanner;

public class BubbleSortORSelectionSort
{
	void bubbleSort(int arr[])
	{ 
		int n = arr.length; //n=6
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
			{
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
	}
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	void sort(int arr[])
	{  			//1,2,3,4,6,9	
		int n = arr.length; //6

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++) 
		{
			// Find the minimum element in unsorted array
			int min_idx = i;//
			for (int j = i+1; j < n; j++) 
				{
					if (arr[min_idx] > arr[j])
					min_idx = j;//5
			}// Swap the found minimum element with the first
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			}
		}

		public static void main(String[] args) 
		{
		System.out.println("Ener the number of integers we want to enter ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the number of elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(" ");
		System.out.println("Entere the preferred sorting:");
		System.out.println("1.BubbleSort,2.SelectionSort");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			BubbleSortORSelectionSort ob = new BubbleSortORSelectionSort();
			ob.bubbleSort(arr);
			System.out.println("Sorted array");
			ob.printArray(arr);
			break;
		case 2:
			BubbleSortORSelectionSort obj = new BubbleSortORSelectionSort();
			
			obj.sort(arr);
			System.out.println("Sorted array");
			obj.printArray(arr);
			break;
			
		}
	}

}


