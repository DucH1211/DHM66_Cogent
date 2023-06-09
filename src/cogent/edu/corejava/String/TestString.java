package cogent.edu.corejava.String;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "shandra";
//		String s2 = "Chandra"; // this is one String object created.
//		String s2 = new String("Chandra");
		String s2 = "Chandra";
		System.out.println(s1==s2); //Address Check
		System.out.println(s1.equals(s2)); //Character Check
		System.out.println("Hashcode s2:" + s1.hashCode());
		System.out.println("Hashcode s1:" + s2.hashCode());
		int a = s1.compareTo(s2); //compareTo uses Lexical Order to Compare
		//uses the static final byte UTF16 field to compare s1 and s2.
		System.out.println(a);
		s1.concat(s2);
		
	}

}
