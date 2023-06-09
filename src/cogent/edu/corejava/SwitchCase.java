package cogent.edu.corejava;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {

		//example of switch case here, 
		//switch accept string, character, integer, enum
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a choice:(1,2,3,4,exit)");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Addition");
			return; //u can use break to exit switch instead of return here
		case 2:
			System.out.println("Subtraction");
			return;
		case 3:
			System.out.println("Multiplication");
			return;
		case 4:
			System.out.println("Division");
			return;
		default:
			System.out.println("Invalid Options");
			return;
		}

	}

}
