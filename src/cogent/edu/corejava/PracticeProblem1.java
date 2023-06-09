package cogent.edu.corejava;
import java.util.*;

public class PracticeProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
//		ArrayList<Integer> arrayList= new ArrayList(); //alternative
		int array[] = new int[10000];
		int len = 0;
		
//		while (number > 0) {
//            int remainder = number % 10;
//            array[i] = remainder;
//            number = number / 10;
//            i++;
//        }
//		int mid = i/2;
//		System.out.println(""+array[mid]);

		
		//second problem
		int result = 0;
		while (number > 0) {
            int remainder = number % 10;
            result = result*10 + remainder;
            number = number / 10;
            len++;
        }
		System.out.println(result);
		
	}

}
