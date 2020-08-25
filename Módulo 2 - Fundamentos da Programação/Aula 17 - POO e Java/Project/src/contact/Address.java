package contact;

public class Address {
	private String street;
	private Integer number;
	private String neighborhood;
	private String city;
	private String state;
	
	public Address(String street, Integer number, String neighborhood, String city, String state) {
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
	}
	
	public String getStreet() {
		return street;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public String getNeighborhood() {
		return neighborhood;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
}
