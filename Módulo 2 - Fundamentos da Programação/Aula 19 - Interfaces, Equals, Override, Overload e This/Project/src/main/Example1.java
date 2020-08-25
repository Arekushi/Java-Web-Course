package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import io.Reader;
import io.Writer;
import santander.Account;
import santander.Check;
import santander.CheckingAccount;
import santander.Client;
import santander.SavingAccount;

public class Example1 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Reader reader = new Reader();
		Writer writer = new Writer();
		Random random = new Random();
		Account account;
		
		Client client = new Client(random.nextInt(), 
						reader.readString(),
						reader.readString(),
						reader.readString());
		
		String typeAccount = reader.readString().toLowerCase();
		
		if(typeAccount.charAt(0) == 'p')
			account = new SavingAccount(client, reader.readDouble());
		else
			account = new CheckingAccount(client, reader.readDouble());
		
		account.makeDeposit(reader.readDouble());
		
		if(account instanceof CheckingAccount) {
			((CheckingAccount) account).depositCheck(
					new Check(reader.readDouble(), 
						reader.readString(), 
						sdf.parse(reader.readString())));
		}
		
		writer.write(String.format("Resultado da retirada: %b%n", 
				account.withdraw(reader.readDouble())));
		
		/*writer.write(String.format("Resultado da retirada: %b%n", 
				account.withdraw(reader.readDouble())));*/
		
		writer.write(account);
		writer.flush();
	}
}
