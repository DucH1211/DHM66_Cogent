package cogent.edu.corejava.String;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static int Armstrong(int num)
	{	
		String str = Integer.toString(num);
		int len = str.length(), Armstrong = 0, lastdigit = 0,expDigit;
		while(num > 0)
		{
//			System.out.println(num);
			lastdigit = num%10;
			expDigit = 1;
			for(int i = 0; i < len; i++)
			{
//				System.out.print(expDigit +" ");
				expDigit *=lastdigit;
			}
			Armstrong += expDigit;
//			System.out.println(Armstrong);
			num /= 10;
		}
		
		return Armstrong;
	}
	public static boolean isArmStrong(int num)
	{
		if(num == Armstrong(num)) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter number:");
		int number = scan.nextInt();
		System.out.println(isArmStrong(number));
}
}
