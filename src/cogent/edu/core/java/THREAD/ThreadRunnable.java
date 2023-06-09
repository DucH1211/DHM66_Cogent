package cogent.edu.core.java.THREAD;

public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable1 r = new Runnable1();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		th1.start();
		th2.start();
	}

}
