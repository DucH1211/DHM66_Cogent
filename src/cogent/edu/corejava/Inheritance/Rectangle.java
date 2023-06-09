package cogent.edu.corejava.Inheritance;

public class Rectangle extends Shape {
	int height;
	int width;
	public Rectangle(String s,int height,int width) {
		super(s);
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area = " + (height*width));
	}
	@Override
	public String getColor() {
		return this.color;
	}
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("parameter = " + ((2*height) + (2*width)));
	}

}
