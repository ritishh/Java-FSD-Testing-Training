package Day4;

class Animal
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking....");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("meowing....");
	}
}

public class HeirarchialInheritance {

	public static void main(String[] args) {
		
		Cat obj =new Cat();
		obj.meow();
		obj.eat();
		
	}

}
