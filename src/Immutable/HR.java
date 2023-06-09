package Immutable;

public abstract class HR{ //extends Department does not work, Department is final.
	void get() {
	System.out.println("Get in HR method");
	}
	abstract void put();
	
}
