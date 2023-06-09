package cogent.edu.core.java.Synchronize;

public class MultiplicationTableRunnable2 implements Runnable {

	MultiplicationTableF table;
	final int tableSize = 5;
	MultiplicationTableRunnable2(MultiplicationTableF table)
	{
		this.table = table;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		table.mulTable(5);
	}

}
