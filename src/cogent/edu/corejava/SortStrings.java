package cogent.edu.corejava;

import java.util.Scanner;

public class SortStrings {
	
	public static void Merge(String[] strA,int begin, int end,int mid) {
		
		int n1 = mid-begin + 1;
		int n2 = end - mid;
		String[] L = new String[n1];
		String[] R = new String[n2];
		
		for(int i = 0; i < L.length;i++)
		{
			L[i] = strA[begin + i];
		}
		for(int i = 0; i < R.length;i++)
		{
			R[i] = strA[mid + 1 + i];
		}
		
		int i = 0,j=0;
		int k = end;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j])<= 0) {
                strA[k] = L[i];
                i++;
            }
            else {
                strA[k] = R[j];
                j++;
            }
            k++;
        }
		return ;
	}
	public static void sort(String strA[], int l, int r)
    {
        if (l < r) {
 
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(strA, l, m);
            sort(strA, m + 1, r);
 
            // Merge the sorted halves
            Merge(strA, l, m, r);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] strA = new String[5];
		for(int i =0; i < strA.length;i++)
		{
			System.out.println("Enter The Name for person number " + (i + 1));
			strA[i] = sc.nextLine();
		}
		sort(strA,0,5);
	}

}
