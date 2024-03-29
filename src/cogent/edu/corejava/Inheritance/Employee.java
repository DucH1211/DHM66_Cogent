package cogent.edu.corejava.Inheritance;

import java.io.Serializable;
import java.util.HashMap;

public class Employee implements Comparable<Employee>,Serializable  {
	private static final long serialVersionUID = 10L;
	private int empid;
	private String Name;
	private int age;
	private String Gender;
	private int salary;	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Employee() {
		super();
		this.empid = 999;
	}
	public Employee(int empid, String name, int age, String gender,int salary) {
		super();
		this.empid = empid;
		Name = name;
		this.age = age;
		Gender = gender;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empid - o.empid < 0)
			return -1;
		else if(this.empid - o.empid > 0)
			return 1;
		else 
			return 0;
	}
	@Override
	public String toString() {
		return "\n[empID:" + empid + ",\t Name:" + Name + ",\t age:"+ age + ",\t Gender:"+ Gender + ",\t Salary:" + salary +"]\n";
	}

}
