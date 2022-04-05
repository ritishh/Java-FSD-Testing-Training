package Day1;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = a*b*c/3;
		System.out.println("mul  :"+d);
		
	}

}
