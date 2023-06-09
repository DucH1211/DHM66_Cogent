package cogent.edu.core.java.Synchronize;

public class Account { //How to use Synchronize Example
	private double balance = 100; //100 dollars
	public synchronized void withdraw(double wamt) { //wamt in dollars
		if(wamt >balance)
			System.out.println("You are Broke, Account Balance: " + balance);
		else {
			try {
//				Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance- wamt;
			System.out.println("Acount balance:" + balance);
		}
	}
	public synchronized void deposit(double damt)
	{
		balance += damt;
		notify();
		System.out.println("Completed the deposit, Balance:" + balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
