package contact;

import java.util.ArrayList;

public class Notebook {
	ArrayList<Contact> contacts;
	
	public Notebook() {
		contacts = new ArrayList<>();
	}
	
	public boolean addContact(Contact contact) {
		return contacts.add(contact);
	}
	
	public boolean removeContact(int id) {
		return contacts.remove(contacts.stream()
				.filter(x -> x.getId().equals(id)).findFirst().orElse(null));
	}
	
	public void show() {
		if(contacts.size() != 0)
			contacts.stream().forEach(System.out::println);
		else
			System.out.println("Lista vazia");
	}
	
	public Contact search(int id) {
		return contacts.stream()
				.filter(x -> x.getId().equals(id))
				.findFirst()
				.orElse(null);		
	}
	
	public boolean hasExists(int id) {
		return contacts.stream().anyMatch(x -> x.getId().equals(id));
	}
	
	@Override
	public String toString() {
		return contacts.toString();
	}
}
