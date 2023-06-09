package cogent.edu.corejava.Inheritance;

public abstract class Shape {
	String color = "Pink";
	public Shape(String s)
	{
		this.color = s;
		System.out.println("shape constructor");
	}
	public void get() {
		System.out.println("get in shape");
	}
	
	public abstract void area();
	public abstract void perimeter();
	protected abstract String getColor();
}
