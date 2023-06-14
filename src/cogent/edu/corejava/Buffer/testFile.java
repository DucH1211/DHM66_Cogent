package cogent.edu.corejava.Buffer;

import java.io.IOException;
import java.io.RandomAccessFile;

public class testFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Testing Random Access File.
		RandomAccessFile a =  new RandomAccessFile("SomeFile.txt", "rw"); 
		System.out.println(a.read());
//		a.writeChars("Hello");
//		System.out.println(a.read());
//		a.seek(0);//setting the cursor position
		//RandomAcess will just make a file for u if not there
		System.out.println(a.read());
		System.out.println(a.readLine());
		a.writeChars("Something more");
				
	}

}
