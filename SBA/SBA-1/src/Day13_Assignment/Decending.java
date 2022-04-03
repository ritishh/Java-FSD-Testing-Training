package Day13_Assignment;


/*Write a program to create a arraylist of double element and add the elements.
sort the elements in descending order and print it.*/

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Decending {
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

//output

/*The decending order
10.2
5.8
2.0
1.5*/