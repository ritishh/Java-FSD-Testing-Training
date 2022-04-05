package Day9;

class StaticExmp1
{
	static int count=0; // a.count, b.count, c.count
	StaticExmp1()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		StaticExmp1 a=new StaticExmp1();
		StaticExmp1 b=new StaticExmp1();
		StaticExmp1 c=new StaticExmp1();	
	}
}