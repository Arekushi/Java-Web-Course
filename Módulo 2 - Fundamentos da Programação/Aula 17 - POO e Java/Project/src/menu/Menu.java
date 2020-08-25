package menu;

import contact.Address;
import contact.Contact;
import contact.Notebook;
import io.Reader;

public class Menu {
	Reader reader = new Reader();
	Notebook notebook;
	
	public Menu(Notebook notebook) {
		this.notebook = notebook;
	}
	
	public int startMenu() {
		System.out.println(
			"****** Kon'nichiwa ******\n"
			+ "[1] Adicionar contato\n"
			+ "[2] Remover contato\n"
			+ "[3] Listar contatos\n"
			+ "[4] Pesquisar contato\n"
			+ "[0] Encerrar programa");
		
		return reader.readInt();
	}
	
	public void chooseOption(int option) {
		switch(option) {
			case 1:
				addContact();
				break;
				
			case 2:
				removeContact();
				break;
				
			case 3:
				listContacts();
				break;
				
			case 4:
				searchContact();
				break;
				
			default:
				defaultOption();
				break;
		}
	}
	
	private void addContact() {
		int id;
		
		do {
			id = reader.readInt();
			
			if(id < 0) return;
		} while(notebook.hasExists(id));
	
		String name = reader.readString();
		Integer age = reader.readInt();
		String telephone = reader.readString();
		
		Address address = new Address(reader.readString(), reader.readInt(),
				reader.readString(), reader.readString(), reader.readString());
		
		notebook.addContact(new Contact(id, name, age, telephone, address));
		System.out.println("*** Adicionado com sucesso ***");
	}
	
	private void removeContact() {
		if(notebook.removeContact(reader.readInt())) 
			System.out.println("Removido com sucesso");
		else 
			System.out.println("ID inv�lido");
	}
	
	private void listContacts() {
		notebook.show();
	}
	
	private void searchContact() {
		Contact contact = notebook.search(reader.readInt());
		System.out.println(contact != null? contact : "Inv�lido");
	}
	
	private void defaultOption() {
		System.out.println("*** Sayonara 'u' ***");
	}
}
