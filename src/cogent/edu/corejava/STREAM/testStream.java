package cogent.edu.corejava.STREAM;

import java.util.List;
import java.util.stream.Stream;

public class testStream {
	//You dont need this if you don't want to reuse the stream
	static List<Integer> numbers = List.of(12,13,43,65,13,1); // Create a list of numbers quickly
	static Stream<Integer> s1 = numbers.stream();//Specific to Collection data.
	public static void put(Integer num) {
		System.out.println(num);
	}
	public static boolean isEven(Integer num)
	{
		if(num%2 == 0)
			return true;
		else return false;
	}
	public static void getEvenList()
	{
		s1.filter(testStream::isEven).forEach(System.out::println);
	}
	public static void getEvenListwithLambda() {
		s1.filter(x->x%2 == 0).forEach(System.out::println); //Lambda Expression is considered a Consumer
	}
	public static void getIntegers() {
		//Functional Programming
		
		s1.forEach(testStream::put);  
		//Stream foreach perform a certain action for every element in the Stream
		
		//Another approach is to use Lambda Express
		s1.forEach(x-> System.out.println(x));
		
		//Third syntax
		
		s1.forEach(System.out::println);
	}
//display the list of integers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getIntegers(numbers);
		testStream.getEvenList();
	}

}
