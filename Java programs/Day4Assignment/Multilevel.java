package Day4Assignment;

import java.util.Scanner;

class Add
{
	int a;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number a");
		a=sc.nextInt();
	}
}
class Bad extends Add
{
	int b;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number b");
		b=sc.nextInt();
	}
}
class C extends Bad
{
	void add()
	{
		System.out.println("addition"+(a+b));
	}
}
public class Multilevel {

	public static void main(String[] args) 
	{
		C obj=new C();
		obj.input();
		obj.getdata();
		obj.add();
	}

}
