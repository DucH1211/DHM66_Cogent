package cogent.edu.corejava.Collection;

import java.util.LinkedList;

public class testQueue {
	public static void main(String [] args)
	{
		//Queue
		//offer, poll, peek
		
		LinkedList<String> q = new LinkedList<String>();
		q.offer("This");
		q.offer("That");
		q.offer("Something");
		q.offer("Here");
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.peek()); //peek at front
		

	}
}
