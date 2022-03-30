package Day12;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class Q1Decending {

	public static void main(String[] args)
	{
			
				ArrayList<Double> sample = new ArrayList<Double>();
				sample.add (1.5);
				sample.add(2.0);
				sample.add(5.8);
				sample.add (10.2);
				System.out.println("The array list of double elements :"+sample);
				Collections.sort(sample, Collections.reverseOrder());
				System.out.println("The decending order");
				for (double num: sample) {
					System.out.println(num);
				}
		
	}

}
