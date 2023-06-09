package cogent.edu.corejava.Interface;

public class MouseEvent implements FirstInterface {

	@Override
	public void leftclick() {
		System.out.println("Left click from mouse event");
		
	}
	@Override
	public void rightclick() {
		System.out.println("right click from mouse event");
		
	}
	@Override
	public void mouseEnter() {
	FirstInterface.super.mouseEnter();
		System.out.println("mouseEnter in MouseEvent");
	}
	
}
