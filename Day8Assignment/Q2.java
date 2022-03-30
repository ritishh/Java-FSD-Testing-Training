package Day8Assignment;

//input of a String and also take in a number of characters as the user wishes and check if they are present in the String.
import java.util.Scanner;

public class Q2 {
    
 public static void main(String[] args) 
 {
		String test = "Java , Is easy to learn 547869. GH kiu: sieo?? 25.33";
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		
		System.out.println("The string is : Java , Is easy to learn 547869. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
		
	}
}
