package Day6Assignment;
// Implementation of interface using Abstract class in java

//Interface KFC
interface KFC {
	void learncoding();
	void learnProgramming();
	void contribute();
}

//abstract class student implementing from KFC interface
abstract class Student implements KFC {
	void learnCoding()
	{
		System.out.println("Let make coding habit with kfc");
	}
	void learnProgramingLanguage()
	{
		System.out.println("Lets master fundamentals in java");
	}
}

//extend the geek class by student abstract class
class GEEK extends Student {
	public void contribute()
	{
		System.out.println("Now lets help others contribute in KFC");
	}

	@Override
	public void learncoding() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void learnProgramming() {
		// TODO Auto-generated method stub
		
	}
}
public class Q1_b {

	public static void main(String[] args) 
	{
		GEEK kfcStudent = new GEEK();
		
		kfcStudent.learnCoding();
		kfcStudent.learnProgramingLanguage();
		kfcStudent.contribute();
		
	}

}
