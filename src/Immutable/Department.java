package Immutable;

public final class Department { 
	//abstract void get() // illegal final cannot have abstract class
	private final int something;
	private final int deptId; //non-static variable
	static int count = 42; //static does not effect final you can choose which to use depends on your context
	//static does not need to be final. since it is not a object variable.
	//if a variable is marked as final it has to be given a value
	public Department()
	{
		this.something = 2312;
		this.deptId = 1312; //final can only be initialized once.
	}
	public Department(int id,int something)
	{
		this.something = something;
		this.deptId = id;
	}
	public void go() {
		System.out.println("method go in final." + "DeptId:" + deptId);
	}
	public int getSomething() {
		return something;
	}
	public int getDeptId() {
		return deptId;
	}
}
