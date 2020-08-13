package exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int value = Integer.parseInt(bf.readLine());
		int fato = value;
		
		for(int i = 1; i < value; i++)
			fato *= i;
		
		bw.write(new StringBuilder()
				.append(fato)
				.toString().concat("\n"));
		
		bw.flush();
	}
}
