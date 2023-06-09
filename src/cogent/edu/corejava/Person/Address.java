package cogent.edu.corejava.Person;

public class Address {
	private String street;
	private int Zipcode;
	private String city;
	private String country;
	private String State;
	public Address() {
		super();
	}
	public Address(String street, int zipCode, String city,String country,String State)
	{
		this.city = city;
		this.country = country;
		this.State = State;
		this.street =  street;
		this.Zipcode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}

}
