package Day12;
import java.util.ArrayList;
public class Q2SumandAverage {

	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(8);
		list.add(32);
		list.add(54) ;
		list.add(2);
		System.out.println("The elements in the arraylist is:"+list) ;
		int sum = 0;
		for (int number : list){
		sum += number;
		}
		System.out.println("sum of the elements is :"+sum);
		double average=sum/(list.size());
		System.out.println("The average is: " +average);
		
	}

}
