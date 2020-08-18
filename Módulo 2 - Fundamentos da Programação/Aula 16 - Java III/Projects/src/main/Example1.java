package main;

import bank.Account;
import io.Reader;
import io.Writer;

public class Example1 {
	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer writer = new Writer();
		Account account;
		
		int number = reader.readInt();
		String holder = reader.readString();
		
		if(reader.readString().toLowerCase().charAt(0) == 'y')
			account = new Account(number, holder, reader.readDouble());
		else
			account = new Account(number, holder);
		
		writer.write(account);
		
		account.deposit(reader.readDouble());
		writer.write(account);
		
		account.withdraw(reader.readDouble());
		writer.write(account);
		
		account.setName(reader.readString());
		writer.write(account);
		writer.write(account.getName());
		
		writer.flush();
	}
}
