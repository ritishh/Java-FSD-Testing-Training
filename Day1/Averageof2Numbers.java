package Day1;

import java.util.Scanner;

public class Averageof2Numbers {

	public static void main(String[] args) {
		int a,b,Sum,Average;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the the value of a");
		a = sc.nextInt();
		System.out.println("enter the the value of b");
		b = sc.nextInt();
		Sum=a+b;
		System.out.println("Sum"+Sum);
		Average=Sum/2;
		System.out.println("Average"+Average);

		
	}

}
