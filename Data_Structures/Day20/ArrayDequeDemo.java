package Day20;


//addition of elements in deque

import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) 
	
	{
		// Intializing an deque
		Deque<String>dq = new ArrayDeque<String>();
		
		//add() method to insert
		
		dq.add("For");
		dq.addFirst("Java");
		dq.addLast("java");
		
		System.out.println(dq);
		
		
	}

}
