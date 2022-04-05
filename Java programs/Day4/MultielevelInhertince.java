package Day4;

class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
class Puppy extends Dog
{
	void weeping()
	{
		System.out.println("Puppy is weeping");
	}
}

public class MultielevelInhertince {

	public static void main(String[] args) {
		
		Puppy obj = new Puppy();
		obj.weeping();
		obj.bark();
		obj.eat();

	}

}
