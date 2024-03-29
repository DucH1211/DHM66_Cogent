package cogent.edu.corejava.STREAM;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamList {
	static List<Integer> list = List.of(3,12,14,15,15);
	static List<String> strList = List.of("Names", "More Names", "Name II", "Name III");

	public static void getEvenSquare() {
		Integer sum = list.stream()
		.filter(x->x%2==0)
		.map(x->x*x)
		.reduce(0, (a,b) -> a+b); 
		System.out.println(sum);
	}
	public List reverseList(List localList) {
		localList = (List) localList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		return localList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> condition = x->x%3==0;
		Predicate<Integer> condition2 = x->x.equals(3);
		getEvenSquare();
	}

}
