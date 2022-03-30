package Day18;

import java.util.Hashtable;

public class Hashtableremove {

	public static void main(String[] args)
	{
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		
		map.put(100, "amit");
		map.put(102, "ravi");
		map.put(101, "vijay");
		map.put(103, "rahul");

		System.out.println("Before remove: "+map);
		//Remove value for key 102
		map.remove(102);
		System.out.println("After remove:"+map);
		
	}

}
