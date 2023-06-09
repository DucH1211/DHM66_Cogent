package cogent.edu.corejava.String;

//import java.util.ArrayList;
import java.util.Scanner;

public class FindLongestPalindrome {
//	public static String longestPalin(ArrayList<String> palynList)
//	{
//		String result = "";
//		for(int i = 0; i < palynList.size(); i++)
//		{
//			if(palynList.get(i).length() > result.length())
//				result = palynList.get(i);
//		}
//		return result;
//	}

	public static boolean isPalin(String s) {
			boolean result = false;
			int l = 0,r = s.length() - 1;
			while (l <= r) {
				if(s.charAt(l) == s.charAt(r))
				{

					result = true;
				}
				else {return false;}
				l++;
				r--;
			}
			return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter a sentence:");
		try (Scanner scan = new Scanner(System.in)) {
			String s =scan.nextLine();
			String list[] = s.split(" ");
//			ArrayList<String> palynList = new ArrayList<String>(); //String Array instead
			String result = "";
			for(int i = 0; i < list.length; i++)
			{
				if(isPalin(list[i]))
				{
					if(list[i].length() > result.length())
						result = list[i];
				}
			}
			System.out.println(result);
		}
		
	}

}
