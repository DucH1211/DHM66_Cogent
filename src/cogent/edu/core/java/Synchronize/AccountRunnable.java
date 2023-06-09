package cogent.edu.core.java.Synchronize;

public class AccountRunnable implements Runnable{
	
	public Account acc;
	
	public AccountRunnable(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
//		for(int i = 0; i < 5; i++) {
			acc.deposit(100);
			acc.withdraw(120); //withdrawing 10 5 times when a thread runs
//		}
	}

}
