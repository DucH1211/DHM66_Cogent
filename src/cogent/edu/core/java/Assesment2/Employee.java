package cogent.edu.core.java.Assesment2;

import java.io.Serializable;

public class Employee implements Serializable {
	private final int emp_id;
	private String name;
	private int age;
	private int salary;
	
	public Employee() {
		super();
		this.emp_id = 999;
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int age, int salary) {
		super();
		this.emp_id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return emp_id;
	}
	
}
