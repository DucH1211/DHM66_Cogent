package cogent.edu.corejava.String;

import java.util.Scanner;

public class MiddleName {
	public static String getMiddleName(StringBuilder Name) {
		
		int firstIndex = Name.indexOf(" ");
		int lastIndex = Name.lastIndexOf(" ");
		if(firstIndex == lastIndex)
		{
			return "None";
		}else {
			return Name.substring(firstIndex + 1,lastIndex);
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder Name = new StringBuilder();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your Name:");
			Name.append(scan.nextLine());
			System.out.println(getMiddleName(Name));
			
			//Split()
			System.out.println("Enter another Name:");
			String fullName = scan.nextLine();
			String[] thisName = fullName.split(" ");
			if(thisName.length > 2) {
				System.out.println(thisName[1]);
			}
			else {
				System.out.println("None");
			}
		}
		
	}

}
