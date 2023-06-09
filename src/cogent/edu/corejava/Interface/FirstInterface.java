package cogent.edu.corejava.Interface;

public interface FirstInterface {
	int button1 = 1; //all default turn into public.
	int button2 = 2;
	int button3 = 3;
	public static void Print() {
		System.out.println("hello static method");
	}
	default void mouseEnter() {
		System.out.println("default method in mouse");
	}
	void leftclick();
	void rightclick();
	
}
