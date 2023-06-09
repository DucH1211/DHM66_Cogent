package cogent.edu.corejava.TestInterface;

import cogent.edu.corejava.Interface.FirstInterface;
import cogent.edu.corejava.Interface.MouseEvent;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstInterface.button1); //button1 is public static final
		System.out.println(FirstInterface.button2);
		System.out.println(FirstInterface.button3);
		FirstInterface.Print();
		FirstInterface m = new MouseEvent();
		m.mouseEnter();
	}

}
