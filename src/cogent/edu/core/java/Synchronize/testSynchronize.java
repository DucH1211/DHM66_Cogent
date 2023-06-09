package cogent.edu.core.java.Synchronize;

public class testSynchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A = new Account();
		AccountRunnable r = new AccountRunnable(A);
		AccountRunnable r1 = new AccountRunnable(A);

//		MultiplicationTableF T = new MultiplicationTableF();
//		MultiplicationTableRunnable r = new MultiplicationTableRunnable(T);
//		MultiplicationTableRunnable2 l = new MultiplicationTableRunnable2(T);

		Thread th1 = new Thread(r); //passing r to thread will allow it to use the override run method
		Thread th2 = new Thread(r1);
		th1.start();
		th2.start();
		
	}

}
