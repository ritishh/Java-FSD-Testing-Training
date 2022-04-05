package Day8;

public class StringSplit {

	public static void main(String[] args)
	{
		String sample=new String("Hello, my name is RITISH , I am 24 years old");
		String[] sentences=sample.split(",");
		for(int i=0;i<sentences.length;i++)
		{
			System.out.println(sentences[i].trim());//it will remove the white spaces and prit only the required String value
		}
		
	}

}
