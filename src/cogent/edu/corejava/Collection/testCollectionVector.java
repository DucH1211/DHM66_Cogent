package cogent.edu.corejava.Collection;

import java.util.*;
import java.util.LinkedList;

public class testCollectionVector {

	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		list.add("Chandra");
		list.add("Names");
		list.add("More Names");
		System.out.println(list);//default way to call overridden toString method
		
		list.add(2,"Inserting Names with add(index,value)");
//		list.add(7, "Insert Names with outOfBound index"); This code will not work in Java
		System.out.println(list);
		
		list.remove("Names"); //remove String object "Names"
		list.remove(2);	//remove String object by index
		list.add("My Name");
		list.add("SomeThing");
		System.out.println(list);
		
		System.out.println("Accessing a specific element at index 3:" + list.get(3));
		
		if(list.contains("Something")) { //contains return a boolean type
			System.out.println("contains Something");
		}else { System.out.println("Something not found");}
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Hello");
		list2.add("Hi");
		for(int i = 0; i < 10; i++)
		{
			list2.add(Integer.toString(i));
		}
		list.addAll(list2); //addAll is used to Merge 2 Collections
		System.out.println(list);
		
		ListIterator<String> it = list2.listIterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
			//you can remove element from the list using Iterator
			if(s == "Hi") {
				it.remove();
			}
		}
		System.out.println(list2);
		while(it.hasPrevious()) {
			String p = it.previous();
			System.out.println(p);
			if(p.equals(Integer.toString(4)))
			{
				it.remove();
			}
		}
		System.out.println(list2); 
	}

}
