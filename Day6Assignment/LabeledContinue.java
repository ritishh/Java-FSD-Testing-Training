package Day6Assignment;

public class LabeledContinue {

	public static void main(String[] args)
	{
		shows:
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(i==3)
						continue shows;
					System.out.print("* ");
				}
				System.out.println();
			}
		
	}

}
