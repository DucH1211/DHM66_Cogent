package cogent.edu.corejava.Person;

public class Person extends Address{ //A person has a Address can also be inheritance, in has-a relationship
	//type of Relationship 
	//Is-A Relationship(Inheritance)
	//Has-A Relationship
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String street, int zipCode, String city,String country,String State,int id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void go() throws RuntimeException{
		
	}
}
