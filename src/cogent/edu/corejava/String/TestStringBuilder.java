package cogent.edu.corejava.String;

public class TestStringBuilder {
	public static void main(String[] args)
	{
		StringBuilder s = new StringBuilder();
		s.append("Helloasffasff");
		s.insert(10, "AAoihfoiAA");
		s.delete(3, 5);
		s.reverse();
		//String Buffer is synchronized. only one thread can read the data.
		//Slower in modification
		//String Builder in unsynchronized. multiple thread can modify together
		//Don't use String class if it require lots of String modification.
		//StringBuffer is better to modify String
		//String is better for const String values.
		StringBuffer s1 = new StringBuffer();
		s1.append("afnaoifnoif");
		s1.insert(19, "OasfhoiF");
		s1.delete(3, 5);
		s1.reverse();
		}
}
