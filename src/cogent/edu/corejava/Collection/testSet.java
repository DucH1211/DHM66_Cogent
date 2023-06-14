package cogent.edu.corejava.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class testSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("Something"); //Set does not keep the index
		set.add("Something");
		set.add("Hello");
		set.add("Hi");
		//All Set Implementation classes 
		System.out.println(set);
		
		set.remove("Hello"); //set can only remove by value
		System.out.println(set);
		//set dont have ListIterator.
		
		Iterator<String> i = set.iterator();
		while(i.hasNext())
		{
			String s = i.next();
			System.out.println(s); //can be change with manipulation, or remove
		}
		Spliterator<String> spli = set.spliterator();
		
		
		TreeSet<String> s = new TreeSet<>();
		s.add("Tree");
		s.add("Taller Tree");
		s.add("");
	}	

}
