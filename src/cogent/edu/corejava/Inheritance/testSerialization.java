package cogent.edu.corejava.Inheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class testSerialization {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Employee e = new Employee();
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Hello.txt"));
		o.writeObject(e);
	}
}
