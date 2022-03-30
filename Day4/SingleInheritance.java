package Day4;
// single inheritence
class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("dog is barking");
	}
}

 class SingleInheritance {

	public static void main(String[] args) {
		// syntax for creating an object
		// class_name obj_name=new class_name();
		Dog obj = new Dog();
		obj.bark();
		obj.eat();
		
		
	}

}
