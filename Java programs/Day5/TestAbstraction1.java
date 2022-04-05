package Day5;

abstract class Bike
{
	Bike()
	{
		System.out.println("Bike class is invoked");
	}
	void run()
	{
		System.out.println("bike is runing");
	}
	abstract void display();
	
}
class Suzuki extends Bike
{
	void run()
	{
		System.out.println("Suzuki is running");
	}
	void display()
	{
		System.out.println("Suzuki ia a top tier bike");
	}
}
class TestAbstraction1 {

	public static void main(String[] args) 
	{
		Bike obj = new Suzuki();
		obj.run();
		obj.display();
		
	}

}
