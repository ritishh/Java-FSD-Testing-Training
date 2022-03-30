package Day10;

import java.util.Scanner;

public class Q1TryCat {

	public static void main(String[] args) 
	{
		int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try
            {
                System.out.println("Welcome to exception handling");
                try
                {
                    System.out.println(marks[ind]);
                    flag = false;
                } 
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e) 
            {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("End of this program");
	
		}
	}


