package Day13_Assignment;

//Create a arraylist of integers and find the sum and average of the entire list.

import java.util.Scanner;
public class Sum_Average
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}
// output

/*Enter no. of elements you want in array:10
Enter all the elements:
5
6
7
9
56
54
4
6541
45
12
Sum:6739
Average:673.9 */