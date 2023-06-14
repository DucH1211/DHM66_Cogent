package cogent.edu.corejava.Collection;

import java.util.LinkedList;

public class testDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> deque = new LinkedList<>();
		deque.offerFirst("This");
		deque.offerFirst("This This");
		deque.offerLast("Something");
		deque.offerLast("That");
		System.out.println(deque);
		
		System.out.println("peak First: "+deque.peekFirst());
		deque.pollFirst();
		System.out.println("pollFirst: " + deque);
		System.out.println("peak Last: "+deque.peekLast());
		deque.pollLast();
		System.out.println("pollLast:" + deque);
	}

}
