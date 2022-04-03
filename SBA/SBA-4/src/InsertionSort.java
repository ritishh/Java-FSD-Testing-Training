//Write a program to implement insertion sort.

import java.util.Scanner;

public class InsertionSort
{
	 static void InsertionSort(int arr[]){
	        int n= arr.length;
	        for(int i=1;i<n;i++){
	            int key=arr[i];
	            int j=i-1;

	            while(j>=0 && arr[j]>key){
	                arr[j+1]=arr[j];
	                j=j-1;
	            }
	            arr[j+1]=key;
	        }
	        System.out.println("** Insertion Sorted Array **");
	        System.out.print("[ ");
	        for(int k=0;k<n;k++){
	            System.out.print(""+ arr[k]+" ");
	        }
	        System.out.print("]");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;

	        System.out.println("Enter the Size of The ARRAY");
	        n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the Elements");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        InsertionSort(arr);
	    }
	}

/* 
output 
Enter the Size of The ARRAY
5
Enter the Elements
20
30
45
98
8552
** Insertion Sorted Array **
[ 20 30 45 98 8552 ]*/