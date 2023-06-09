package cogent.edu.corejava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a = 0,div = 0;
		int b;
		
			try //try-catch is handled in compiled time. 
			//So if an error is handled code will keep running
			{
				a = scan.nextInt();
				b = scan.nextInt();
				div = a/b;
				System.out.println("Try continues");
			}
	//		catch(ArithmeticException e){ //Throwable is Parent to all Exceptions,
	//			//Parent can identify all child Exception, child cannot handle parent exception
	//			System.out.println("Catch block");
	//			//e.printStackTrace();} //StackTrace will let you see the detail of exception
	//		System.out.println("Division:" + div);
	//		}
	//		catch(NullPointerException e) //You can have more than 1 catchBlock. 2nd have to not be child of 1st catch
	//		{
	//			System.out.println("Saw Null Pointer");
	//		}
			catch(InputMismatchException e){
				System.out.println("Catch block for input mismatch(must be Int)");
				scan.nextLine();
				System.out.println("Enter your 2 number again as 2 Integer");
			}
			catch(Throwable e)
			{
				System.out.println("Catch block");	
				e.printStackTrace();
			}
			finally
			{
				System.out.println("Inside Finally Block: Will Run regardless of error before terminating a program.");
			}
			System.out.println("Division: " + div);
		
	}
}
