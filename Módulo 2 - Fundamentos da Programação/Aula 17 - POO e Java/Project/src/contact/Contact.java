package contact;

public class Contact {
	private Integer id;
	private String name;
	private Integer age;
	private String telephone;
	private Address address;
	
	public Contact(Integer id, String name, Integer age, String telephone, Address address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.telephone = telephone;
		this.address = address;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	@Override
	public String toString() {
		return String.format("[Id: %d, Name: %s, Age: %d, Telephone: %s%n"
				+ "Address: %s, %d, %s, %s, %s]",
				id, name, age, telephone,
				address.getStreet(), address.getNumber(), address.getNeighborhood(), 
				address.getState(), address.getCity());
	}
}
