package cogent.edu.corejava.String;
import java.util.Scanner;

public class Reverse {

	public static String reverseString(String s)
	{	
		String str ="";
		char c = 0;
		for(int i = 0; i < s.length(); i ++)
		{
			c = s.charAt(i);
			str = c + str;
		}
		return str;
	}
	public static boolean Palyndrome(String s) { //You can also check if reverse equals to this string
		boolean result = false;
		int l = 0,r = s.length() - 1;
		while (l <= r) {
			if(s.charAt(l) == s.charAt(r))
			{
//				l++;
//				r++;
				result = true;
			}
			else {return false;}
			l++;
			r--;
			
		}
		return result;
		
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String s = "";
			System.out.println("Write something:");
			s = sc.nextLine();
			System.out.println(reverseString(s));
			boolean b = Palyndrome(s);
			System.out.println(b);
			
			System.out.println("Write something:");
			String s1 = sc.nextLine();
			System.out.println(reverseString(s1));
			b = Palyndrome(s1);
			System.out.println(b);
		}
		
	}

}
