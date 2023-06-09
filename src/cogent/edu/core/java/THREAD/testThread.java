package cogent.edu.core.java.THREAD;

public class testThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread1 th = new Thread1();
		Thread1 th1 = new Thread1();
		th.start(); //you do not know which one start first since jvm scheduler is independent.
		System.out.println(th.getId() +" "+ th.hashCode());
		th1.start();
		System.out.println(th1.getId()+" "+th1.hashCode());
		th.wait();
		
	}

}
