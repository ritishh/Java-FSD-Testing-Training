package Day6Assignment;

public class UnlabeledBreak {

	public static void main(String[] args) 
	{
		//break switch loop
		
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
				{
					if(i==3)
						break ; //unlabeled break statement;
					System.out.print("* ");
				}
				System.out.println("end of the program ");
			}
	}

}
