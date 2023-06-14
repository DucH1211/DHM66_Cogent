package cogent.edu.corejava.Buffer;

import java.io.*;

public class TestBufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("something.txt")));
		bw.write("Hello");
		bw.flush();
		bw.close();
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("somethingnew.txt"));
		String s = "Hello there";
		byte b[] = s.getBytes();
		bos.write(b);
		bos.flush();
		bos.close();
	}

}
