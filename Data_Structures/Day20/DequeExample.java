package Day20;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args)
	{
		Deque<String> deque = new LinkedList<String>();
		
		// we can add elements to the queue
		// in various ways
		
		//add at the last
		deque.add("Element 1 (Tail)");
		
		//add at the first
		deque.addFirst("Element 2 (Head)");
		
		//add at the last
		deque.addLast("Element 3 (Tail)");
		
		//add at the first
		deque.push("Element 4 (Head)");
		
		//add at the last
		deque.offer("Element 5 (Tail)");
		
		//add at the first
		deque.offerFirst("Element 6 (Head)");
		
		System.out.println(deque + "\n");
		
		//we can remove the first element
		//or the last element
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing"+"first and last: "+deque);
	}

}
