package Day9;

class Animal
{
	Animal()
	{
		System.out.println("animal class constructor is called");
	}
}
class SuperExmp3 extends Animal
{
	SuperExmp3()
	{
		super();
		System.out.println("sub class constructor is called");
	}
	public static void main(String[] args)
	{
		SuperExmp3 a=new SuperExmp3();
	}
}