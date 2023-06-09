package cogent.edu.core.java.Synchronize;

public class MultiplicationTableF {
	final int tableSize = 5;
	
	public synchronized void mulTable(int mul)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 1; i < tableSize + 1; i ++)
		{
			System.out.println(mul + "*" + i + "=" + (i * mul));
		}
		
		
		
	}
}
