package cogent.edu.core.java.Assesment;

import java.util.ArrayList;

public class Assessment1 {
	public static ArrayList<Integer> findDup(int[] input)
	{
		int duplicate = 0;
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i = 0 ;i < input.length; i++) //find duplicates using normal ways
		{
			for(int j = i + 1; j < input.length; j++)
			{
				System.out.println(j+ "J:IN:" + input[j]);
				System.out.println(i+ "I:IN:" + input[i]);
				if(input[i] == input[j])
				{
					System.out.println("Duplicate found:" + input[i]);
					duplicate = input[i];
				}
			}
		}
		
		
		return output;//???
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,12,23,20,23,3,5};
		ArrayList<Integer> result = findDup(array);
		
	}

}
