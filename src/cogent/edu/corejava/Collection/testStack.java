package cogent.edu.corejava.Collection;

import java.util.Stack;

public class testStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stack has 
		//push,pop,peak
		Stack<String> s = new Stack<>();
		s.push("Name");
		s.push("Haha");
		s.push("What is Happening");
		s.add("He he");//using add will be OK with compiler but potentially break the chain of stack.				
		s.add("HAHA");//Do not use Add for Stack
		
		System.out.println("stack: " + s);
		s.pop(); 
		System.out.println("stack: " + s);
		s.remove("my");
		System.out.println(s);
		Object o = s.peek();//get the top element
		
	}

}
