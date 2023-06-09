package cogent.edu.corejava;
import java.util.*;

public class FibonnaciSequence {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++)
		{
			System.out.print(fibonacci(i) + " ");
		}
	}
	public static int fibonacci(int n) {
		if(n <= 1)
			return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
