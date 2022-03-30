package Day2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		double c;
		c=a+b;
		System.out.println("addition"+c);
		c=a-b;
		System.out.println("subtraction"+c);
		c=a*b;
		System.out.println("Multiplication"+c);
		c=a/b;
		System.out.println("division"+c);
		c=a%b;
		System.out.println("reminder"+c);
		
	}

}
