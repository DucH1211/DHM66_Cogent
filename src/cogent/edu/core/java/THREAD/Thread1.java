package cogent.edu.core.java.THREAD;

public class Thread1 extends Thread{
	public synchronized void run() {
		currentThread().notify();
		for(int i = 0; i < 5; i ++){
			System.out.println("Thread: " + currentThread().getId() );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
