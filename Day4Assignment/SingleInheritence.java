package Day4Assignment;

import java.util.Scanner;

class A
{
	int a,b;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the secound number");
		b=sc.nextInt();
	}
	void add()
	{
		System.out.println("Addition "+(a+b));
	}
}
class B extends A
{
	int c;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no ");
		c=sc.nextInt();
	}
	void display()
	{
		System.out.println("addition "+(a+b+c));
	}
}

public class SingleInheritence {
	

	public static void main(String[] args) 
	{
		B obj=new B();
		obj.input();
		obj.getdata();
		obj.add();
		obj.display();
	}

}
