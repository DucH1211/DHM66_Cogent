package cogent.edu.corejava;

public class LoopingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i < 1000; i ++) {
			//do stuff
		}
		
		//foreach
		int a[] = {1,2,3};
		for(int value : a) { //a has to be array/list of some type, 
			//String does not work
			//do stuff
		}
	}
	
}
