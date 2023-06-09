package cogent.edu.corejava;

public class SecondDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data Type
		//Integer, Floating, boolean, char, String
		String s = "\u0041";
		System.out.println(s);
		String a = null;
		String b = "chandra";
		System.out.println(a!=null&&a.compareTo(b)>0); //output: False
		System.out.println(a!=null&a.compareTo(b)>0); //output: Exception
	}

}
