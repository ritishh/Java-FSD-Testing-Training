package Day1;

import java.util.Scanner;

public class Sum {
	
	static int samp=5;//global variable (class varaible)

	public static void main(String[] args) {
		double a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the value a");
		a = obj.nextDouble();
		System.out.println("enter the value b");
		 b = obj.nextDouble();
		 c=a+b;
		System.out.println("sum="+c);
		
	}
	public static void showsample()
	{
		int x=15; //local variable
		System.out.print(x);
	}

}
