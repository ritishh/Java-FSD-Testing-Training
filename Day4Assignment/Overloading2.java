package Day4Assignment;


public class Overloading2 {
	
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	public void add(double a , double b) {
		System.out.println(a+b);
	}
	public void add(int a , double b , double c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		Overloading2 obj = new Overloading2();
		obj.add(12, 15);
		obj.add(10.23, 15.45);
		obj.add(10, 13.56, 31.23);

	}

}


	