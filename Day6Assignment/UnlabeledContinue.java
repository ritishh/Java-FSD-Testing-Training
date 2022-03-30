package Day6Assignment;

public class UnlabeledContinue {

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==3)
					continue;
				System.out.print("* ");
			}
			System.out.println( );

		}
	}

}
