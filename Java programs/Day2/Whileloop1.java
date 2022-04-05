package Day2;

import java.util.Scanner;

public class Whileloop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int i=1;
		int n;
		n = sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}

}
