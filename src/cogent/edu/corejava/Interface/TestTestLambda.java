package cogent.edu.corejava.Interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestTestLambda {

	public static void main(String[] args) {
		Consumer<Integer> method = (n) -> {System.out.println(n);};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(9);
		a.add(8);
		a.add(9);
		a.add(121);
		a.forEach(method);
	}

}
