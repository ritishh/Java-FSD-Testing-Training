package Day1;

import java.util.Scanner;

public class CBSE_Result {

	public static void main(String[] args) 
	
	{
		double total,average,percentage;
		 float eng,chem,mat,phy;
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of five subjcts");
		System.out.println("enter the eng marks");
		eng=sc.nextFloat();
		System.out.println("enter the chem");
		chem=sc.nextFloat();
		System.out.println("enter the mat");
		mat=sc.nextFloat();
		System.out.println("enter the phy");
		phy=sc.nextFloat();
		
		//caculate total avg and percentage
		
		total = eng+chem+mat+phy;
		average = (total/4.0);
		percentage=(total/400)*100;
		
		System.out.println("Total marks ="+total);
	    System.out.println("Average marks = "+average);
	    System.out.println("Percentage = "+percentage);
		
	}

}
