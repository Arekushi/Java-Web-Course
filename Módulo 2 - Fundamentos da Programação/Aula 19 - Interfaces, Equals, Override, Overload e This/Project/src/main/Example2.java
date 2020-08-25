package main;

import io.Reader;
import io.Writer;
import pastas.Lasagna;
import pastas.Pizza;
import pastas.Spaghetti;
import snack.Cake;
import snack.Pasta;
import snack.Sandwich;
import snack.Snack;

public class Example2 {
	public static Reader reader;
	public static Writer writer;
	private static Snack snack;
	
	public static void main(String[] args) {
		reader = new Reader();
		writer = new Writer();
		snack = null;
		
		int item = reader.readInt();
		
		switch (item) {
		case 1:
			sandwich();
			break;
			
		case 2:
			pasta();
			break;
			
		case 3:
			cake();
			break;

		default:
			System.out.println("Valor inválido");
			System.exit(0);
			break;
		}
		
		writer.write(String.format("Tempo de Entrega: %.0f minutos%n", 
				snack.getTime(reader.readDouble())));
		writer.write(String.format("Valor final: R$ %.2f", snack.getPrice()));
		writer.flush();
	}
	
	public static void sandwich() {	
		snack = new Sandwich();
		Sandwich sandwich = (Sandwich) snack;
		
		for(int i = 0; i < 10; i++)
			sandwich.addIngredient(reader.readString());
	}
	
	public static void pasta() {
		int subItem = reader.readInt();
		
		switch(subItem) {
			case 1:
				snack = new Pizza();
				break;
				
			case 2:
				snack = new Spaghetti();
				break;
				
			case 3:
				snack = new Lasagna();
				break;
				
			default:
				System.out.println("Valor inválido");
				System.exit(0);
				break;
		}
		
		Pasta pasta = (Pasta) snack;
		pasta.addSauce(reader.readString());
	}
	
	public static void cake() {
		snack = new Cake();
		Cake cake = (Cake) snack;
		
		cake.addIngredients(reader.readString(),
				reader.readString(),
				reader.readString());
	}
}
