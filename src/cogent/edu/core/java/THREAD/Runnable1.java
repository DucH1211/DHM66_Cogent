package cogent.edu.core.java.THREAD;

public class Runnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Do Something");
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Thread.currentThread.getName():" + i );
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
