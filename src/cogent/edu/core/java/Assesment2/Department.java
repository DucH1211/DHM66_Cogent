package cogent.edu.core.java.Assesment2;

public class Department {
	private final int dept_id;
	private String dept_name;
	private int emp_id;
	private Employee employee;
	
	public Department() {
		super();
		this.dept_id = 999;
		// TODO Auto-generated constructor stub
	}
	public Department(int dept_id, String dept_name,int emp_id) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.emp_id = emp_id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
}
