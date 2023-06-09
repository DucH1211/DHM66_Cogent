package cogent.edu.core.java.Synchronize;

public class MultiplicationTableRunnable implements Runnable {

	MultiplicationTableF table;
	final int tableSize = 5;
	MultiplicationTableRunnable(MultiplicationTableF table)
	{
		this.table = table;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		table.mulTable(6);
	}

}
