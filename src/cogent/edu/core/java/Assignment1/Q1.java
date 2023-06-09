package cogent.edu.core.java.Assignment1;
import static java.lang.Math.*;
public class Q1 {
	public static boolean isPrime(int num)
	{
		//Prime number cannot be 1, 0 or neg
		if(num <= 1)
			return false;
		else if(num==2) //2 is a prime
			return true;
		else if(num%2 == 0)//odd number divisible by 2 is not prime
			return false;
		else {
			for(int i = 3; i < sqrt(num); i +=2) {
				if(num %i == 0)
					return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("isPrime: " + isPrime(17));
	}

}
