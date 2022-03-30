package Day13;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args)
	{
		File myFile = new File("FileCreate");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
