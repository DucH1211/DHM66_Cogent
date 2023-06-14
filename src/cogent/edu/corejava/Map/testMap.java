package cogent.edu.corejava.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

import cogent.edu.corejava.Inheritance.Employee;

public class testMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> n = new HashMap<>();
		n.put(1, "Duke");
		n.put(2, "otherName");
		System.out.println(n);

		
		HashMap<Integer,String> m = new HashMap<>();
		m.put(3, "Hello");
		m.put(2,"Hello123"); //only 1 unique key allowed, so it will override
		System.out.println(m);
		
		n.putAll(m); //USE PUTALL here
		System.out.println(n);
///////////////////
///////////////////
		//Map is not Iterable, but we can convert it to Set/Collection to use Iterable
		
		Set<Integer> s = n.keySet(); // keySet return a set view of keys contained in the map
		System.out.println(s);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) //using iterator
		{
			System.out.println("Using iterator by chanding to Set with n.keySet()"+i.next());
		}
//////////////////
//////////////////
		Set e = n.entrySet(); //this will make a set with keyvalue pair
		System.out.println("Using n.entrySet() "+e);
		Iterator i1 = e.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
//////////////////
//////////////////
		Collection<String> r = n.values(); //Collections will return only the Values as Collection type
		System.out.println("Using n.values(): "+ r);
		Iterator i2 = r.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next()); 
		} 
/////////////////
/////////////////
		
		LinkedHashMap lh = new LinkedHashMap();
		lh.put(12, "ME");
		lh.put(15, "YOU");
		System.out.println(lh);
		
		//LinkedHashMap maintain the order of insertion compare to other types of Maps
		
		TreeMap TM = new TreeMap(); //all objects in treemap has to be comparable
		TM.put(1, new Employee()); //Employee have to implement Comparable or 
		TM.put(12, new Employee()); 
	}	

}
