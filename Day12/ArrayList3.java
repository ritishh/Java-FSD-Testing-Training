package Day12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 
{

	public static void main(String[] args)
	{
		ArrayList<String> sample = new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		for(String car:sample)
		{
			System.out.println(car);
		}
		
	}


}


