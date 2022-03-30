package Day11;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		//the working of finally block when no exception occurs in try block
		try{
		       System.out.println("First statement of try block");
		       int num=45/3;
		       System.out.println(num);
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		       System.out.println("ArrayIndexOutOfBoundsException");
		    }
		    finally
		    {
		       System.out.println("finally block");
		    }
		    System.out.println("Out of try-catch-finally block");
	}

}
