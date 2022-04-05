package Day4Assignment;


public class Overloading1 {
	
	public void add(int a , int b) {
		
		System.out.println(a+b);
	}
	
	public void add(int a , int b, int c) {  // overload method
		
		System.out.println(a+b+c) ;
	}
	
	public void add(int a , int b , int c , int d) {   // overload method
		
		System.out.println(a+b+c+d) ;
	}

	public static void main(String[] args)
	{
		Overloading1 obj = new Overloading1();
		obj.add(5, 7);
		obj.add(10, 20, 15);
		obj.add(12, 15, 13, 22);

	}

}



	
