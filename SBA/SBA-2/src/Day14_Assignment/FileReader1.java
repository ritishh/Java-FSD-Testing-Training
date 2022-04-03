package Day14_Assignment;


	import java.io.IOException;
	import java.io.FileReader;

	public class FileReader1 {

		

		public static void main(String[] args) 
		{
			try {
				int i;
				FileReader fr = new FileReader("F:file" );
				while((i = fr.read()) != -1)
				{
					System.out.print((char)i);
				}
				fr.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}

	}



