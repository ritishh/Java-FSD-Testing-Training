package Day20;

// removal of elements in deque

import java.util.*;
public class ArrayDequeremove {

	public static void main(String[] args) 
	{
		//Intializing an deque
		
		Deque<String>dq = new ArrayDeque<String>();
		
		//add() method to insert
		
		dq.add("For");
		dq.addFirst("java");
		dq.addLast("java");
		
		System.out.println(dq);

		System.out.println(dq.pop());
		System.out.println(dq.poll());
		
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
	}

}
