package cogent.edu.corejava.Inheritance;

public class TestAbstract {

	public static void main(String[] args) {
		Shape shape = new Rectangle("Green", 3,5);
		shape.area();
		shape.perimeter();
		System.out.println(shape.getColor());
		
	}	

}
