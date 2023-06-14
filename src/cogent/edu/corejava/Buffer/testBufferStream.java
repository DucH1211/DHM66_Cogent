package cogent.edu.corejava.Buffer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testBufferStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Something:");
		BufferedInputStream bis = new BufferedInputStream(System.in);
		byte[] c = new byte[10];
		//test buffer in mark and reset;
		bis.mark(1); //mark Buffer at position at 1
		int i = 0,j = 0,data = 0;
		while((data = bis.read()) != -1)
		{
			if(i == 5)
				bis.reset(); //when position reached 5 reset to 1
			System.out.print((char)data + " ");
			i++;
		}
		bis.read(c);
		bis.close();
		

//		BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
//		data = 0;
//		bread.mark(1);
//		while((data = bread.read()) != -1)
//		{
//			if(j == 5)
//				bis.reset(); //when position reached 5 reset to 1
//			System.out.print((char)data + " ");
//			j++;
//		}
	}

}
